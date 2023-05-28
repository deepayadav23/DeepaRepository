package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test(description = "Login TestCase")
  public void loginMethod() {
	  Reporter.log("Login Performed", true);
  }
  
  @Test(description = "createUser TestCase" , dependsOnMethods = "loginMethod")
  public void createUser() {
	  Reporter.log("User created", true);
  }
  
  @Test(description = "Logout TestCase" , dependsOnMethods = "createUser")
  public void logoutMethod() {
	  Reporter.log("logout Performed", true);
  }
}
