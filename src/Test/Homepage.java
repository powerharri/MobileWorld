package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homepage {

	@Test
	public void brand1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harinarayanan.suresh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		landingpage landing =  new landingpage(driver);
		landing.goTo();
		landing.home();
		driver.close();
	}
	
	@Test
	public void brandlenovo() {
		WebDriver driver = new ChromeDriver();
		landingpage landing = new landingpage(driver);
		landing.goTo();
		landing.home1();
		driver.close();
	}
	
	@Test
	public void brandapple() {
		WebDriver driver = new ChromeDriver();
		landingpage landing = new landingpage(driver);
		landing.goTo();
		landing.home2();
		driver.close();
		
	}
	
	@Test
	public void support()
	{
		WebDriver driver = new ChromeDriver();
		landingpage landing = new landingpage(driver);
		landing.goTo();
		landing.home3();
		driver.close();

}
	public void support1() {
		WebDriver driver = new ChromeDriver();
		landingpage landing = new landingpage(driver);
		landing.goTo();
		landing.home4();
		driver.close();
	}
}
