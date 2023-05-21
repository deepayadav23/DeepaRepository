package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("http://www.google.com");

		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(2000);

		List<WebElement> pohaOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));

		for(int i=1; i<pohaOptions.size();i++)
		{
			String poha = pohaOptions.get(i).getText();
			System.out.println(poha);
			//Thread.sleep(2000);
		}

	}

}
