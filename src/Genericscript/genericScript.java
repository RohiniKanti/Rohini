package Genericscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class genericScript
{
	public WebDriver driver;
	@BeforeMethod
	public void openAppIn()
	{

		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
	}

}
