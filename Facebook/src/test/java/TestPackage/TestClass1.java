package TestPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.Base;
import POMPackage.Login;
import POMPackage.Signup;

public class TestClass1 extends  Base {
	
	private WebDriver driver;
	private Signup signupFacebook ;
	private Login loginFacebook;
	
	@BeforeTest
	@Parameters ("browser")
	
	public void beforeTest(String browser)
	{
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
		driver = openChromeBrowser();	
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = openFirefoxBrowser();
		}
	}
	
	@BeforeClass 
	public void beforeClass()
	{
		System.out.println("BeforeClass");
		
	//signupFacebook = new Signup(driver);
	
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
		System.out.println("BeforeMethod");
		System.out.println("BeforeMethod");
		System.out.println("BeforeMethod");
		driver.get("https://en-gb.facebook.com/");
		
    }
	
	@Test
	public void test123() throws InterruptedException, IOException
	{
		System.out.println("signupFacebook");
		
		signupFacebook = new Signup(driver);
		signupFacebook.signupForm(driver);
		getscreenshot(driver);
	}

	@Test
	public void test345()
	{		
		System.out.println("loginFacebook");
		loginFacebook = new Login(driver);
		loginFacebook.loginForm(driver);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
	
	@AfterClass 
	public void afterClass() throws InterruptedException, IOException
	{
		System.out.println("After class");
		getscreenshot(driver);
		driver.close();
	}
	
@AfterTest
	
	public void afterTest()
	{
		System.out.println("close browser");	
	}
}
