package Assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitActTime {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("http://deepa/login.do");
		String loginPageTitle = driver.getTitle();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		if(wait.until(ExpectedConditions.titleContains(loginPageTitle)))
		{
			System.out.println("Title is match,Testcase is pass");

			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();

		}
		else
		{
			System.out.println("Title is not match,Testcase is fail");
		}	
		
		String homePageTitle = driver.getTitle();

		if(wait.until(ExpectedConditions.titleContains(homePageTitle)))
		{
			System.out.println("Title is match,Testcase is pass");
		}
		else
		{
			System.out.println("Title is not match,Testcase is fail");
		}
		
		
	}
}
