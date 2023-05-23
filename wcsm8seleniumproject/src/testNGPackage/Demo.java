package testNGPackage;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void f() {
		//System.out.println("Hiii TestNG"); //Show message output only on console
		//Reporter.log("hii TestNG");  //show message output only on HTML report
		Reporter.log("Hii TestNG", true);  //show message out on console as well as on HTML report
	}

	@Test
	public void g(){
		//System.out.println("Hiii Java");
		//Reporter.log("hii Java");  //show message output only on HTML report
		Reporter.log("Hii Java", true);  //show message out on console as well as on HTML report
	}
}
