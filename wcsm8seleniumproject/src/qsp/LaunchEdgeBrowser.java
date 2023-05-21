package qsp;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {

		//To avoid IllegalState Exception
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

		//To avoid ConnectionFailedException
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");

		//To launch EdgeBrowser
		EdgeDriver driver = new EdgeDriver(eo);

		Thread.sleep(4000);


		//To maximize EdgeBrowser
		driver.manage().window().maximize();

		//To close edge Browser
		Thread.sleep(4000);
		//driver.close();

	}

}
