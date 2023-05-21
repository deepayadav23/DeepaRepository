package keyDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;


public class ValidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException {
		 
		//To open the browser create the object of BaseTest
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData("./data/config.properties", "username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData("./data/config.properties", "password"));
		
		driver.findElement(By.id("loginButton")).click();
		
		//To close the browser 
		bt.closeBrowser();
			
	}

}
