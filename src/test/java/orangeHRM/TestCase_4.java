package orangeHRM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCase_4 {
    
	@Test
	public void orange() throws InterruptedException {
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
        System.setProperty("webDriver.chrome.Driver","src/main/resources/chromedriver.exe");
        
        WebDriver driver = new ChromeDriver(co);
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123"); 
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='app']//aside[@class='oxd-sidepanel']/nav[@role='navigation']//ul[@class='oxd-main-menu']//a[@href='/web/index.php/admin/viewAdminModule']/span[.='Admin']")).click();
	    
	    Thread.sleep(2000);
	    WebElement dropdownEle = driver.findElement(By.xpath("//div[@id='app']//header[@class='oxd-topbar']//nav[@role='navigation']/ul/li[3]//i"));
	    dropdownEle.click();
        List<WebElement> option = dropdownEle.findElements(By.className("oxd-topbar-body-nav-tab-link"));
        System.out.println(option.size());
        String element;
        for(int i=0; i<option.size();i++) {
        	element = option.get(i).getAttribute("value");
        	if(element.equals("30")) {
        		option.get(i).click();
        	}
//      WebElement dropdownEle = driver.findElement(By.xpath("//div[@id='app']//header[@class='oxd-topbar']//nav[@role='navigation']/ul/li[3]//i"));
//      dropdownEle.click();
//      List<WebElement> option = dropdownEle.findElements(By.className("oxd-topbar-body-nav-tab-link"));
//      System.out.println(option.size());
//      Select dropdown = new Select(dropdownEle);
//      dropdown.selectByVisibleText("Locations");
//      dropdown.selectByValue("option_value");
//      dropdown.selectByIndex(1);
         }       
}       
}	

