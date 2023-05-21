package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysMethod {
	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://deepa/login.do");
		
		//driver.findElement(By.name("username")).sendKeys("admin");
		WebElement userNameTB = driver.findElement(By.name("username"));
		userNameTB.sendKeys("admin");
		
		
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		passwordTB.sendKeys("manager");
		
		
		//driver.findElement(By.id("loginButton")).click();
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
	}

}
