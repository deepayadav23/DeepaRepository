package webBasedPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:\\alertpopup.html");
		driver.findElement(By.xpath("//button[text()='Click Me!']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();



		//If we try to handle alert but alert is not present on webpage we will get NoAlertPresentException.
	}
}
