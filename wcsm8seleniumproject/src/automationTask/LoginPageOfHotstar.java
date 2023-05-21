package automationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPageOfHotstar {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.get("https://www.hotstar.com/");
		//Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class='icon-user-line soul-icon NAV_ICON_FONT_SIZE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login Now']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='7']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='7']")).sendKeys("7057838183");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Get OTP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Get Help']")).click();
	}

}
