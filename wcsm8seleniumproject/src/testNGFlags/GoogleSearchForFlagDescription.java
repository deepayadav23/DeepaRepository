package testNGFlags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchForFlagDescription extends BaseTest {
	@Test
	public void search1()
	{
		driver.switchTo().activeElement().sendKeys("JAVA",Keys.ENTER);
	}
	@Test
	public void search2()
	{
		driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
	}
	@Test
	public void search3()
	{
		driver.switchTo().activeElement().sendKeys("SELENIUM",Keys.ENTER);
	}

}


