package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//a[text()='Create New Account']")
	private WebElement newAccount;

	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy (xpath = "//input[@name='reg_email__']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@name='reg_email_confirmation__']")
	private WebElement confirmEmail;
	
	@FindBy (xpath = "//input[@name='reg_passwd__']")
	private WebElement password;
	
	@FindBy (xpath = "//select[@name='birthday_day']")
	private WebElement bDay;
	
	@FindBy (xpath = "//select[@name='birthday_month']")
	private WebElement bMonth;
	
	@FindBy (xpath = "//select[@name='birthday_year']")
	private WebElement bYear;
	
	@FindBy (xpath = "//label[text()='Female']")
	private WebElement genderF;
	
	@FindBy (xpath = "//label[text()='Male']")
	private WebElement genderM;
	
	@FindBy (xpath = "(//button[text()='Sign Up'])[1]")
	private WebElement signUp;
	
	@FindBy (xpath = "//img[@class='_8idr img']")
	private WebElement cancle;
	
	public Signup(WebDriver driver) {
		
			this.driver = driver;
			PageFactory.initElements(driver, this);
	}

	public void signupForm(WebDriver driver)
	{
		newAccount.click();
		boolean a = newAccount.isDisplayed();
		System.out.println(a);
		firstName.click();
		firstName.sendKeys("Mangesh");
		lastName.sendKeys("dhaybar");
		email.sendKeys("mangeshnew2020@gmail.com");
		confirmEmail.sendKeys("mangeshnew2020@gmail.com");	
		password.sendKeys("12345");
		bDay.sendKeys("20");
		boolean b = bDay.isDisplayed();
		System.out.println(b);
		bMonth.sendKeys("Mar");
		bYear.sendKeys("1992");
		genderF.click();
		genderM.click();
		signUp.click();
		String url= driver.getCurrentUrl();
		System.out.println(url);
		String heading= driver.getTitle();
		System.out.println(heading);
		System.out.println("Close signupform");
		cancle.click();	
	}
}
