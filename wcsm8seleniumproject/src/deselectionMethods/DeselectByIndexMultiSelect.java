package deselectionMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexMultiSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///D:/MultipleDropDrown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		/*for(int i=0; i<=4;i++)
		{
			if(i%2==0)
			{
				Thread.sleep(2000);
				sel.selectByIndex(i);
			}
			else
			{
				System.out.println("Its odd place");
			}
		}
		for(int i=0; i<=4;i++)
		{
			if(i%2==0)
			{
				Thread.sleep(2000);
				sel.deselectByIndex(i);
			}
			else
			{
				System.out.println("Its odd place");
			}
		}*/
		for(int i=0; i<=4; i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		for(int i=0; i<=4; i++)
		{
			Thread.sleep(2000);
			sel.deselectByIndex(i);
		}


	}

}
