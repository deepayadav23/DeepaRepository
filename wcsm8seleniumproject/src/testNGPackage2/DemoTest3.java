package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest3 {
	@Test
	public void g() 
	{
		Reporter.log("g Method from DemoTest3", true);
	}

	@Test
	public void h() 
	{
		Reporter.log("h Method from DemoTest3", true);
	}

	@Test
	public void i() 
	{
		Reporter.log("i Method from DemoTest3", true);
	}


}
