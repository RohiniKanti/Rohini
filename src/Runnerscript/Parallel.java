package Runnerscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void runner(String browser)
	{
		System.setProperty("webdriver.chrome.driver","./software1/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();		}
		else
		{
			driver=new ChromeDriver();
		}
	}
}


