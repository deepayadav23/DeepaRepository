package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Store all the WebElements of LoginPage
	//Declare with @FindBy Annotation

	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="pwd") private WebElement passwordTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(xpath="//input[@name='remember']") private WebElement checkBox;
	@FindBy(linkText="Actimind Inc.") private WebElement actiMindLink;

	//Initialization

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//utilization (Utilize all the webelements)
	public WebElement getUsernameTB() 
	{
		return usernameTB;
	}
	public WebElement getPasswordTB() 
	{
		return passwordTB;
	}
	public WebElement getLoginButton() 
	{
		return loginButton;
	}
	public WebElement getCheckBox() 
	{
		return checkBox;
	}
	public WebElement getActiMindLink() 
	{
		return actiMindLink;

	}


	//operational Methods
	public void validLogin(String validUsername, String validPassword)
	{
		usernameTB.sendKeys(validUsername);
		passwordTB.sendKeys(validPassword);
		loginButton.click();
	}

	public void inValidLogin(String invalidUsername, String invalidPassword) throws InterruptedException
	{
		usernameTB.sendKeys(invalidUsername);
		passwordTB.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(2000);
		usernameTB.clear();
	}

}