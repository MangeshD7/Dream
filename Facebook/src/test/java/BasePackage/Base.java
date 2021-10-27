package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import TestUtils.Utility;

public class Base extends Utility {
	public static WebDriver openChromeBrowser()
	{
		System.out.println("hello Chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91957\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	public static WebDriver openFirefoxBrowser()
	{
		System.out.println("hello firefox");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91957\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		return driver;
	}
}