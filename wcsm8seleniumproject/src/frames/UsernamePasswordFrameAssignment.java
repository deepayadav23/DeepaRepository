package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernamePasswordFrameAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///D:/UserNameTextBox.html");
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.id("i1"));
		username.sendKeys("Deepa");

		//SWitch to frame
		driver.switchTo().frame(0);

		WebElement password = driver.findElement(By.id("i1"));
		password.sendKeys("videe1605");
		Thread.sleep(2000);
		password.clear();
		
		//Go to the previous frame
		driver.switchTo().defaultContent();
		username.clear();

		//Close the browser
		driver.quit();

	}


}
