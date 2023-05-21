package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://deepa/login.do");
		
		//driver.findElement(By.name("username")).clear(); method chaining
		
		WebElement userNameTB = driver.findElement(By.name("username"));//we use probable storing in reference variable
		userNameTB.sendKeys("admin");

		WebElement passwordTB = driver.findElement(By.name("pwd"));
		passwordTB.sendKeys("manager");

		Thread.sleep(2000);
		//userNameTB.clear();

		Thread.sleep(1000);
		passwordTB.clear();



	}

}
