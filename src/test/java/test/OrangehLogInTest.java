package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.OrangehrmLogInPage;

public class OrangehLogInTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
	
//	    ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\SHRIRANP\\eclipse-workspace\\Selenium-Project\\src\\main\\resources\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
		
		//go to web page
	    Thread.sleep(2000);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.get("https://www.amazon.in/");
		
/*		//enter user name
		Thread.sleep(2000);
		OrangehrmLogInPage.textbox_username(driver).sendKeys("Admin");
		
		//enter password
		Thread.sleep(2000);
		OrangehrmLogInPage.textbox_password(driver).sendKeys("admin123");
		
		//click on LogIn
		Thread.sleep(2000);
		OrangehrmLogInPage.button_click(driver).click();
		
		Thread.sleep(2000);
		driver.close();
		System.out.println("Test Successfully Completed");
*/		
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
	    Thread.sleep(2000);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	    
//      create account 
	    WebElement a = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
	    a.sendKeys("shrii");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("456");
	    Thread.sleep(2000);
	    driver.findElement(By.id("continue")).click();
	}
}
