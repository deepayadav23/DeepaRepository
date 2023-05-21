package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		//To avoid IllegalStateException
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//To avoid ConnectionFailedException
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	 //To launch ChromeBrowser
	 new ChromeDriver(co);

	}

}
