package robotClassMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass1 {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/");

		//generate print popup
		Robot robot = new Robot();

		//press(ctrl+p)
		robot.keyPress(KeyEvent.VK_CONTROL);	
		robot.keyRelease(KeyEvent.VK_P);

		//release(ctrl+p)
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_CONTROL);

		//shift control to cancel button
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		////press enter to handle print
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}


}
