package pageObjectModelPackage;

import java.io.IOException;

public class CreateUserTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt= new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.validLogin(flib.readPropertyData(PROPERTY_PATH, "username"), flib.readPropertyData(PROPERTY_PATH,"password"));
		
		Thread.sleep(2000);
		
		HomePage hp = new HomePage(driver);
		hp.userModuleMethod();
		
		Thread.sleep(2000);
		UserListPage ulp = new UserListPage(driver);
		
		String usn = flib.readExcelData(EXCEL_PATH, "createusers", 1, 0);
		
		
		
		
	}

}
