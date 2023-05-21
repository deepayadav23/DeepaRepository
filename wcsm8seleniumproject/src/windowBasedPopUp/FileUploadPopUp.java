package windowBasedPopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp 
	{
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			driver.get("http://deepa/login.do");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

			Thread.sleep(2000);
			WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
			
			Actions act = new Actions(driver);
			act.doubleClick(target).perform();
			
			File file = new File("./AutoIT/FileUpload.exe");
			String absolutePath = file.getAbsolutePath();
			Runtime.getRuntime().exec(absolutePath);
			Thread.sleep(2000);

			driver.quit();

		}

	}


