package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement button = driver.findElement(By.xpath("//button[text()=' Login ']"));
		Rectangle rect = button.getRect();

		int xaxis = rect.getX();
		int yaxis = rect.getY();
		System.out.println("X-axis:"+xaxis+"   Y-axis:"+yaxis);

		int h = rect.getHeight();
		int w = rect.getWidth();
		System.out.println("Height is:"+h+"   Width is:"+w);
	}
}
