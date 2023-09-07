package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangehrmLogInPage {

	private static WebElement element = null;
	
	public static WebElement textbox_username(WebDriver driver) {
		
	   element = driver.findElement(By.xpath("//input[@name='username']"));
	   return element;
	}
	
	public static WebElement textbox_password(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@type='password']"));
		return element;
		
	}
	
    public static WebElement button_click(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//button[@type='submit']"));
		return element;
		
	}
	

}
