package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest extends Flib implements IAutoConstant
{

	protected static WebDriver driver;
	//It is use to open the browser and close the browser

	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browservalue=flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		if(browservalue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}

		else if(browservalue.equals("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}

		else if(browservalue.equals("edge"))
		{
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else
		{
			Reporter.log("InvalidBrowser value!!!", true);
		}
	}
	// Create The generic reusable Method to take ScreenShot
	@Test

	public void failedMethodToTakesScreenShot(String failedMethod)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./ScreenShot/"+failedMethod+".png");
			Files.copy(src, dest);
		}

		catch(Exception e)
		{

		}
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}


