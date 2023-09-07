package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.OrangehrmLogInPage1;

public class OrangehLogInTest1 {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:/Users/SHRIRANP/eclipse-workspace/Selenium-Project/src/main/resources/chromedriver.exe");
	    driver = new ChromeDriver(co);
	    
	    OrangehrmLogInPage1 logInPageObj = new OrangehrmLogInPage1(driver);
	    
	    Thread.sleep(2000);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    Thread.sleep(2000);
	    logInPageObj.setTextInUsername("Admin");
	    Thread.sleep(2000);
	    logInPageObj.setTextInPassword("admin123");
	    Thread.sleep(2000);
	    logInPageObj.clickLogIn();
	}
}
