package Assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {

	//By using TreeSet from dropDown

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///D:/MultipleDropdown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));

		//To handle dropDown create object of select class
		Select sel = new Select(dropDown);

		//To get all the options from dropDown
		List<WebElement> allOptions = sel.getOptions();

		//To eliminate the duplicates and maintain the order of insertion we use TreeSet
		TreeSet<String> ts = new TreeSet<String>();

		//To read the list by Eliminating duplicates  
		for(int i=0;i<allOptions.size();i++)
		{
			//Get the options and text of options
			String op = allOptions.get(i).getText();

			//add the text of options to Treeset
			ts.add(op);
		}
		//to read the options from set
		for( String options:ts)
		{
			Thread.sleep(2000);
			System.out.println(options);
		}


	}
}
