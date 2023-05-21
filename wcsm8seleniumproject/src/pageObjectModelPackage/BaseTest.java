package pageObjectModelPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IAutoConstant {

	static WebDriver driver;
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData("PROPERTY_PATH","browser");
		String url=flib.readPropertyData("PROPERTY_PATH","url");

		if(browserValue.equalsIgnoreCase("chrome"))		//To launch Chrome
		{
			System.setProperty("CHROME_KEY","drivers/chromedriver.exe");

			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.get(url);

		}
		else if(browserValue.equalsIgnoreCase("Firefox"))	//To launch Firefox
		{
			System.setProperty("GECKO_KEY", "drivers/geckodriver.exe");

			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.get(url);
		}
		else if(browserValue.equalsIgnoreCase("Edge"))		//To launch Edge
		{
			System.setProperty("EDGE_KEY", "drivers/msedgedriver.exe");

			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.get(url);
		}
		else
		{
			System.out.println("Invalid BrowserValue!!!");
		}

	}
	public void tearDown()
	{
		driver.quit();
	}


}


