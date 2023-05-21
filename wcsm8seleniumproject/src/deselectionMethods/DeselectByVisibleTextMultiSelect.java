package deselectionMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleTextMultiSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///D:/MultipleDropDrown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		
		Thread.sleep(2000);
		sel.selectByVisibleText("Chakali");
		Thread.sleep(2000);
		sel.selectByVisibleText("Puran_Poli");
		Thread.sleep(2000);
		sel.selectByVisibleText("Vadapav");
		
		
			//To select multiple options we have use selectByVisibleText method repeatedly so we can use selectByIndex

			/*for(int i=0; i<=3;i++)
			{
				sel.selectByIndex(i);
				Thread.sleep(2000);

			}*/
		
		Thread.sleep(2000);
		sel.deselectByVisibleText("Chakali");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Puran_Poli");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Vadapav");
		
	}
}


