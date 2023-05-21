package readProperyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperyData {
	public static void main(String[] args) throws IOException {

		//provide the path of propery file
		FileInputStream fis = new FileInputStream("./data/config.properties");

		//read the data from property file
		Properties prop = new Properties();

		//make the propery file for read
		prop.load(fis);


		String username = prop.getProperty("username");
		System.out.println(username);

	}
	


}
