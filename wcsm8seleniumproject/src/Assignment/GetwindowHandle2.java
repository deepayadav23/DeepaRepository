//HOW TO CLOSE ALL THE BROWSER WITHOUT QUIT METHOD

package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandle2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://omayo.blogspot.com/");


		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		Point point = link.getLocation();
		int xaxis = point.getX();
		
		int yaxis = point.getY();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis -250)+")");
		Thread.sleep(2000);
		link.click();
		Thread.sleep(2000);

		//To close all the browser without quit method
		Set<String> allOptions = driver.getWindowHandles();
		for(String wh:allOptions)
		{
			Thread.sleep(2000);
			driver.switchTo().window(wh).close();
		}
	}

}
