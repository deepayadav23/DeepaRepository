package dyanamicScreenShort;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.google.common.io.Files;
public class BaseTest {
	static WebDriver driver;
	@BeforeTest
	public void property()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}

	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://deepa/login.do");
	}
	public void failedMethod(String failedMethod) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot"+failedMethod+".png");
		Files.copy(src, dest);

	}
	
	@AfterMethod()
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
