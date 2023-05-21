package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		
		//To avoid IllegalStateException
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		//To launch FirefoxBrowser
		new FirefoxDriver();

	}

}
