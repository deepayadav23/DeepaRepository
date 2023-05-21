package automationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.get("https://www.airindia.in/");

		driver.findElement(By.xpath("//a[contains(text(),'Login/Enrol')]")).click();

		driver.findElement(By.xpath("//input[@id='signInName']]")).click();

		driver.findElement(By.xpath("//input[@id='signInName']]")).sendKeys("yadavvinayak111@gmail.com");
		//Thread.sleep(5000);

		//driver.findElement(By.xpath("//input[@id='password']]")).sendKeys("videe8305");

	}

}
