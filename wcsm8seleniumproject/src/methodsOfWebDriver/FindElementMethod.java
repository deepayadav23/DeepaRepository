package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		 ChromeDriver driver = new ChromeDriver(co);
		 driver.manage().window().maximize();
		 
		 driver.get("http://deepa/login.do");
		 Thread.sleep(2000);
		 
		 WebElement usernameTextBox = driver.findElement(By.name("username"));
		 Thread.sleep(2000);
		 usernameTextBox.sendKeys("admin");
		 System.out.println(usernameTextBox);
		 

	}

}
