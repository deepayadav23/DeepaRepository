package dyanamicScreenShort;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ActiTimeDataProvider {
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
	
	@DataProvider(name="testActiTime")
	public Object [] [] dataprovider()
	{
		Object[][] dataprovider = new Object[5] [2];
		
		dataprovider [0][0]="Admin";
		dataprovider [0][1]="Manager";
		
		dataprovider [1][0]="Admin123";
		dataprovider [1][1]="Manager123";
		
		dataprovider [2][0]="Admi_n";
		dataprovider [2][1]="Ma_nager";
		
		dataprovider [3][0]="Manager";
		dataprovider [3][1]="Admin";
		
		dataprovider [4][0]="Ad@min";
		dataprovider [4][1]="Mana@ger";
		
		return dataprovider;
	}
	
	@Test(dataProvider="testActiTime")
	public void loginInvalid(String usn, String pass) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
