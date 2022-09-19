package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
   WebDriver driver;
   public landingpage(WebDriver driver) {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
	   
   }
   //login locators
   @FindBy(id="username")
   WebElement user;
   @FindBy(id="password")
   WebElement pass;
   @FindBy(xpath="//button[@class='btn btn-warning my-2 my-sm-0']")
   WebElement start;
   @FindBy(css = "a[class*='btn btn-primary btn-block']")
	WebElement submits;
   
   //login constructor
   public void login(String username,String password) {
	   start.click();
	   user.sendKeys(username);
	   pass.sendKeys(password);
	   submits.click();
	   
   }
   
   //link
   public void goTo()
   {
	   driver.get("https://mobileworld.banyanpro.com/");
   }
   
   
   //signup locator

	@FindBy(id="myName")
	WebElement firstname;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastname;
	@FindBy(xpath="//input[@placeholder='Enter Email']")
	WebElement email;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement verification;
	@FindBy(xpath="//input[@type='date']")
	WebElement day;
	@FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
	WebElement conta;
	@FindBy(xpath="//textarea[@placeholder='Short Bio']")
	WebElement bios;
	@FindBy(xpath=("//p/a['Sign up']"))
	WebElement signup;
	@FindBy(xpath="//button[@type='submit']")
	WebElement register;
	
	
	//signup constructor
	public void sup(String fname,String lname,String mail,String password,String dob,String number,String bio) {
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		email.sendKeys(mail);
		verification.sendKeys(password);
		day.sendKeys(dob);
		conta.sendKeys(number);
		bios.sendKeys(bio);
		register.click();
	}
	//HOMEPAGE LOCATOR
	@FindBy(id="navbarDropdown")
	WebElement allmobile;
	
	@FindBy(xpath="//div//a[@class='dropdown-item'][1]")
	WebElement brandsamsung;
	@FindBy(xpath="//a[@class='btn btn-primary '][1]")
	WebElement detail;
	
	@FindBy(xpath="//a[@class='dropdown-item'][2]")
	WebElement lenovo;
	
	@FindBy(xpath="//a[@class='dropdown-item'][3]")
	WebElement apple;
	@FindBy(xpath="//a[@class='btn btn-primary '][1]")
	WebElement detail1;
	
	@FindBy(xpath="//body/nav[@id='navbar']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mx-auto']/li[4]/a[1]")
	WebElement support;
	
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Order']")
	WebElement orders;
	
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Contact Us']")
	WebElement contact;
	
	//homepage constructor
	public void home() {
		allmobile.click();
		brandsamsung.click();
		detail.click();
		
	}
	
	public void home1() {
		allmobile.click();
		lenovo.click();
		
	}
	
	public void home2() {
		allmobile.click();
		apple.click();
		detail1.click();
	}
	
	public void home3(){
		support.click();
		orders.click();
		
	}
	
	public void home4()
	{
		support.click();
		contact.click();
	}

	
	//link
	public void goTo1()
	{
		driver.get("https://mobileworld.banyanpro.com/");
		start.click();
		signup.click();
		
		
	}

}
