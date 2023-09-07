package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangehrmLogInPage1 {
    
	WebDriver driver = null;
	
	By textbox_username = By.xpath("//input[@name='username']");
	By textbox_password = By.xpath("//input[@type='password']");
	By button_click     = By.xpath("//button[@type='submit']");
	
	public OrangehrmLogInPage1(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void setTextInUsername(String text) {
		
		driver.findElement(textbox_username).sendKeys(text);
	}
	public void setTextInPassword(String text1) {
		
		driver.findElement(textbox_password).sendKeys(text1);
		
	}
	public void clickLogIn() {
		
		driver.findElement(button_click).click();
		
	}
}
