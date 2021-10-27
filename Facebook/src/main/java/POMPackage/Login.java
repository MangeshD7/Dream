package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	private WebDriver driver;
	
	@FindBy(xpath= "//input[@id='email']")
	private WebElement logEmail;
	
	@FindBy(xpath= "//input[@id='pass']")
	private WebElement logPass ;
	
	@FindBy(xpath= "//button")
	private WebElement loginButton;
	
	@FindBy(xpath= "(//i)[4]")
	private WebElement more;
	
	@FindBy(xpath= "(//span[@dir='auto'])[9]")
	private WebElement logout;
	
	public Login(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
}

public void loginForm(WebDriver driver)
{
	
	logEmail.sendKeys("9579867891");
	logPass.sendKeys("Mangesh@28F");
	loginButton.click();
	System.out.println("close loginform");
	more.click();
	logout.click();
}
}