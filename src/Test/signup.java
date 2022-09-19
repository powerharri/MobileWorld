package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signup {
	@Test(dataProvider= "getdatas")

	public void sign_up(String fname,String lname,String mail,String password,String dob,String number,String bio) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//harinarayanan.suresh//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		landingpage landing = new landingpage(driver);
		landing.goTo1();
		landing.sup(fname, lname, mail, password, dob, number, bio);
		driver.switchTo().alert().accept();

	}
	@DataProvider
	public Object[][] getdatas() throws InterruptedException {
		Object[][] data = new Object[22][7];
		data[0][0]="Ha";
		data[0][1]="narayanan";
		data[0][2]="hari@gmail.com";
		data[0][3]="@123Hari";
		data[0][4]="18/07/2000";
		data[0][5]="9751889914";
		data[0][6]="Hello";
		Thread.sleep(1000);
	
		data[1][0]="Hari";
		data[1][1]="narayanan";
		data[1][2]="hari@gmail.com";
		data[1][3]="@123Hari";
		data[1][4]="18/07/2000";
		data[1][5]="9751889914";
		data[1][6]="Hello";
		Thread.sleep(1000);
		
		data[2][0]="Harinarayanankumaravarmareddygaruda";
		data[2][1]="narayanan";
		data[2][2]="hari@gmail.com";
		data[2][3]="@123Hari";
		data[2][4]="18/07/2000";
		data[2][5]="9751889914";
		data[2][6]="Hello";
		Thread.sleep(1000);
		
		data[3][0]="@!$%$%&&^&";
		data[3][1]="narayanan";
		data[3][2]="hari@gmail.com";
		data[3][3]="@123Hari";
		data[3][4]="18/07/2000";
		data[3][5]="9751889914";
		data[3][6]="Hello";
		Thread.sleep(1000);
		
		data[4][0]="987746";
		data[4][1]="narayanan";
		data[4][2]="hari@gmail.com";
		data[4][3]="@123Hari";
		data[4][4]="18/07/2000";
		data[4][5]="9751889914";
		data[4][6]="Hello";
		Thread.sleep(1000);
		
		//Last name
		data[5][0]="Hari";
		data[5][1]="na";
		data[5][2]="hari@gmail.com";
		data[5][3]="@123Hari";
		data[5][4]="18/07/2000";
		data[5][5]="9751889914";
		data[5][6]="Hello";
		Thread.sleep(1000);
		
		data[6][0]="Hari";
		data[6][1]="narayan";
		data[6][2]="hari@gmail.com";
		data[6][3]="@123Hari";
		data[6][4]="18/07/2000";
		data[6][5]="9751889914";
		data[6][6]="Hello";
		Thread.sleep(1000);
		
		data[7][0]="Hari";
		data[7][1]="narayananswamyrathinakumarvel";
		data[7][2]="hari@gmail.com";
		data[7][3]="@123Hari";
		data[7][4]="18/07/2000";
		data[7][5]="9751889914";
		data[7][6]="Hello";
		Thread.sleep(1000);
		
		data[8][0]="Hari";
		data[8][1]="@#$%^^&^%!";
		data[8][2]="hari@gmail.com";
    	data[8][3]="@123Hari";
		data[8][4]="18/07/2000";
		data[8][5]="9751889914";
		data[8][6]="Hello";
		Thread.sleep(1000);
		

		data[9][0]="Hari";
		data[9][1]="975168";
		data[9][2]="hari@gmail.com";
		data[9][3]="@123Hari";
		data[9][4]="18/07/2000";
		data[9][5]="9751889914";
		data[9][6]="Hello";
		Thread.sleep(1000); 
		
		//email
		data[10][0]="Hari";
		data[10][1]="narayanan";
		data[10][2]="hari@gmail.com";
		data[10][3]="@123Hari";
		data[10][4]="18/07/2000";
		data[10][5]="9751889914";
		data[10][6]="Hello";
		Thread.sleep(1000);
		
		data[11][0]="Hari";
		data[11][1]="narayanan";
		data[11][2]="hari@";
		data[11][3]="@123Hari";
		data[11][4]="18/07/2000";
		data[11][5]="9751889914";
		data[11][6]="Hello";
		Thread.sleep(1000);
		
		//Password
		data[12][0]="Hari";
		data[12][1]="narayanan";
		data[12][2]="hari@";
		data[12][3]="@1";
		data[12][4]="18/07/2000";
		data[12][5]="9751889914";
		data[12][6]="Hello";
		Thread.sleep(1000);
		
		data[13][0]="Hari";
		data[13][1]="narayanan";
		data[13][2]="hari@";
		data[13][3]="@123Hari";
		data[13][4]="18/07/2000";
		data[13][5]="9751889914";
		data[13][6]="Hello";
		Thread.sleep(1000);
		
		data[14][0]="Hari";
		data[14][1]="narayanan";
		data[14][2]="hari@narayanan97651387987";
		data[14][3]="@123Hari";
		data[14][4]="18/07/2000";
		data[14][5]="9751889914";
		data[14][6]="Hello";
		Thread.sleep(1000);
		
		//dob

		data[15][0]="Hari";
		data[15][1]="narayanan";
		data[15][2]="hari@123";
		data[15][3]="@123Hari";
		data[15][4]="18/07/2000";
		data[15][5]="9751889914";
		data[15][6]="Hello";
		Thread.sleep(1000);
		

		data[16][0]="Hari";
		data[16][1]="narayanan";
		data[16][2]="hari@12";
		data[16][3]="@123Hari";
		data[16][4]="";
		data[16][5]="9751889914";
		data[16][6]="Hello";
		Thread.sleep(1000);
		
		//phonenumber
		data[17][0]="Hari";
		data[17][1]="narayanan";
		data[17][2]="hari@123";
		data[17][3]="@123Hari";
		data[17][4]="18/07/2000";
		data[17][5]="abkjsksjcbc";
		data[17][6]="Hello";
		Thread.sleep(1000);
		
		data[18][0]="Hari";
		data[18][1]="narayanan";
		data[18][2]="hari@123";
		data[18][3]="@123Hari";
		data[18][4]="18/07/2000";
		data[18][5]="9751889";
		data[18][6]="Hello";
		Thread.sleep(1000);
		
		data[19][0]="Hari";
		data[19][1]="narayanan";
		data[19][2]="hari@123";
		data[19][3]="@123Hari";
		data[19][4]="18/07/2000";
		data[19][5]="975188991423223134432233";
		data[19][6]="Hello";
		Thread.sleep(1000);
		
	//bio
		data[20][0]="Hari";
		data[20][1]="narayanan";
		data[20][2]="hari@123";
		data[20][3]="@123Hari";
		data[20][4]="18/07/2000";
		data[20][5]="9751889914";
		data[20][6]="";
		Thread.sleep(1000);
		
		data[21][0]="";
		data[21][1]="";
		data[21][2]="";
		data[21][3]="";
		data[21][4]="";
		data[21][5]="";
		data[21][6]="";
		Thread.sleep(1000);
		return data;
	}
//
//
}
