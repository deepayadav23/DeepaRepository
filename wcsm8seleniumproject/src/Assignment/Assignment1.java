package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remove-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		Dimension targetSize = new Dimension(350, 450);
		Thread.sleep(2000);
		driver.manage().window().setSize(targetSize);

		Point targetPosition = new Point(450, 3500);
		Thread.sleep(2000);
		driver.manage().window().setPosition(targetPosition);


	}

}
