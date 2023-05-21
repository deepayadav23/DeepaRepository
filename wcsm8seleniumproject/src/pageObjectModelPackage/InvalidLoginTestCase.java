package pageObjectModelPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);

		int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");
		for(int i=1; i<=rc; i++)
		{

			String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", 0, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", 0, 1);
			lp.inValidLogin(invalidUsername, invalidPassword);
		}
		bt.tearDown();

	}
}