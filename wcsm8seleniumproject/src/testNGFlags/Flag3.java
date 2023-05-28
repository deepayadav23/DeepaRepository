package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	
	//Use to execute annotation or method for multiple times
  @Test(invocationCount = 10)
  public void method1() {
	  Reporter.log("Login Test Case", true);
  }
}
