package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsernamePasswordFrameAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///D:/UserNameTextBox.html");
		Thread.sleep(2000);
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frid']"));
		driver.switchTo().frame(0);

		//driver.switchTo().frame("frid");
		WebElement check = driver.findElement(By.xpath("//iframe[@class='frcl']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(check)).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("i1")).sendKeys("Deepa");
		driver.findElement(By.id("frid")).sendKeys("videe1605");
		


	}


}
