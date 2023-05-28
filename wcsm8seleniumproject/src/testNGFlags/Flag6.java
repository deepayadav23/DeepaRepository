package testNGFlags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	@Test(description = "Login TestCase")
	public void loginMethod() {
		Reporter.log("Login Performed", true);
	}

	@Test(description = "createUser TestCase" , dependsOnMethods = "loginMethod")
	public void createUser() {
		Assert.fail();
		Reporter.log("User created", true);
	}

	@Test(description = "Logout TestCase" , dependsOnMethods = "createUser" , alwaysRun = true)
	public void logoutMethod() {
		Reporter.log("logout Performed", true);
	}
}