package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[.='Logout']") private WebElement Logout;
	@FindBy(xpath="//A[@class='content tt_selected selected']/DIV[2]/IMG") private WebElement Timetrack;
	@FindBy(xpath="//A[@class='content tasks']/IMG[@class='sizer']") private WebElement Task;
	@FindBy(xpath="//A[@class='content users']/IMG[@class='sizer']") private WebElement Users;
	@FindBy(xpath="//A[@class='content administration']/IMG[@class='sizer']") private WebElement Settings;

	//Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getTimetrack() {
		return Timetrack;
	}

	public WebElement getTask() {
		return Task;
	}

	public WebElement getUsers() {
		return Users;
	}

	public WebElement getSettings() {
		return Settings;
	}
	
	//Operational Methods
	public void logOutMethod()
	{
		Logout.click();
	}

	public void userModuleMethod() 
	{
		Users.click();
		
	}

}
