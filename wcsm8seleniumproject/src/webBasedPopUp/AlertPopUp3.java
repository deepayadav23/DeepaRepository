package webBasedPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/AlertpopupSendkeys.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);


		al.sendKeys("deepa");

		//If we try to handle alert but alert is not present on webPage we will get NoAlertPresentException.

	}

}
