package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericPackage.BaseTest;
import genericPackage.WorkLib;

public class UserPage extends BaseTest {
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
	@FindBy(xpath = "//*[@id='right12']") private WebElement ModifyTimeTrack;
	@FindBy(xpath = "//*[@id='right2']") private WebElement manageCust;
	@FindBy(xpath = "//*[@id='right1']") private WebElement manageReport;
	@FindBy(xpath = "//*[@id='right5']") private WebElement manageUsers;
	@FindBy(xpath = "//*[@id='right7']") private WebElement manageBilling;
 


	//Initialization
	public UserPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Utilization
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

	public void createUserMethod(String usn,String pass,String Fn,String Ln) throws InterruptedException
	{
		CreateNewUser.click();
		Thread.sleep(1000);
		userNameTB.sendKeys(usn);
		Thread.sleep(1000);
		passwordTB.sendKeys(pass);
		passwordReTextType.sendKeys(pass);

		Thread.sleep(1000);
		FirstNameTB.sendKeys(Fn);
		Thread.sleep(1000);
		LastNameTB.sendKeys(Ln);

		Thread.sleep(1000);
		CreateUserButton.click();
	}

	public void deleteUserMethod() throws InterruptedException
	{
		Link.click();
		Thread.sleep(1000);
		DeleteUser.click();
		WorkLib wl = new WorkLib();
		wl.handleConfirmationPopUp();
	}

	public void selectCheckBox()
	{
		ModifyTimeTrack.click();
		manageCust.click();
		manageReport.click();
		manageUsers.click();
		manageBilling.click();
	}

	public void managerCreateMethod()
	{
		CreateUserButton.click();
	}
}
