package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signin{

	@Test(dataProvider= "datas")

	public void signin(String username,String password) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//harinarayanan.suresh//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		landingpage landing = new landingpage(driver);
		landing.goTo();
		landing.login(username, password);
		
	}
	
	@DataProvider
	
	public Object[][] datas() {
		Object[][] data = new Object[7][2];
		
		data[0][0] = "Hari";
		data[0][1]= "@hari";
		
		data[1][0] = "Ha";
		data[1][1] = "@hari";
		
		data[2][0]= "harinarayanankumaravarmareddy";
		data[2][1]= "@hari";
		
		data[3][0]= "hari";
		data[3][1]= "2@";
		
		data[4][0]= "hari";
		data[4][1]= "2@bca";
		
		data[5][0]= "hari";
		data[5][1]= "2@fddkhelkwelkvlhelloguys";
		
		data[6][0]= "";
		data[6][1]= "";
		
		
		
		
		
	
		return data;
		
	}
}

