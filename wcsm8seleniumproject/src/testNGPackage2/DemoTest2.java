package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest2 {
	@Test
	public void e() 
	{
		Reporter.log("e Method frome DemoTest2", true);
	}

	@Test
	public void f() 
	{
		Reporter.log("f Method frome DemoTest2", true);
	}

	@Test
	public void f1() 
	{
		int i=10;
		int j=5;
		int res=i/j;
		Reporter.log("f1 Method frome DemoTest2", true);
	}
}
