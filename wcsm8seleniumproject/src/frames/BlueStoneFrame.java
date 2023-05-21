package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");

		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);

		//switch the control to the frame by using webelement as a frame 
		/*WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frameElement);*/
		
		//switch the control to the frame by using string or id
		driver.switchTo().frame("fc_widget");
		
		WebElement checkBox = driver.findElement(By.id("chat-icon"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(checkBox)).click();
		
		driver.switchTo().defaultContent();

		driver.findElement(By.id("chat-fc-name")).sendKeys("Deepa");
		driver.findElement(By.id("chat-fc-email")).sendKeys("deepa@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");


	}
}
