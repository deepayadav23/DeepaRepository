package pageObjectModelPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserListPage{

	@FindBy(xpath = "//input[@value='Create New User']") private WebElement CreateNewUser;
	@FindBy(xpath = "//*[@name='username']") private WebElement userNameTB;
	@FindBy(xpath = "//*[@name='passwordText']")  private WebElement passwordTB;
	@FindBy(xpath = "//*[@name='passwordTextRetype']")  private WebElement passwordReTextType;
	@FindBy(xpath = "//*[@name='firstName']") private WebElement FirstNameTB;
	@FindBy(xpath = "//*[@name='lastName']") private WebElement LastNameTB;
	@FindBy(xpath = "//input[@type='submit']")  private WebElement CreateUserButton;
	@FindBy(xpath = "//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]") private WebElement cancelButton;
	@FindBy(xpath = "(//a[contains(text(),'System, Administrator (admin)')]/ancestor::tbody/descendant::a)[1]") private WebElement Link;
	@FindBy(xpath = "//input[@value='Delete This User']")  private WebElement DeleteUser;


	//Initialization
	public WebElement getCreateNewUser() {
		return CreateNewUser;
	}
	public WebElement getUserNameTB() {
		return userNameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getPasswordReTextType() {
		return passwordReTextType;
	}
	public WebElement getFirstNameTB() {
		return FirstNameTB;
	}
	public WebElement getLastNameTB() {
		return LastNameTB;
	}
	public WebElement getCreateUserButton() {
		return CreateUserButton;
	}
	public WebElement getCancelButton() {
		return cancelButton;
	}
	public WebElement getLink() {
		return Link;
	}
	public WebElement getDeleteUser() {
		return DeleteUser;
	}

	//Operational Methods





}
