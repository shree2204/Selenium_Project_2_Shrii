package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public void valid_credential() throws InterruptedException {
		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
//		WebDriver driver = new ChromeDriver(co);
		System.setProperty("webdriver.firefox.marionette","C:/Users/SHRIRANP/eclipse-workspace/Selenium-Project/src/main/resources/geckodriver.exe");  
	    WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		String url = "https://www.microsoft.com/en-us/bing?form=MW00X7&ef_id=_k_Cj0KCQjw0bunBhD9ARIsAAZl0E1aD7WHp9dJYglAcWdr6RNRE-r4UXreE9XzXhD6n7AaHp5iwXz50ToaAh9fEALw_wcB_k_&OCID=AIDcmmn005jwr7_SEM__k_Cj0KCQjw0bunBhD9ARIsAAZl0E1aD7WHp9dJYglAcWdr6RNRE-r4UXreE9XzXhD6n7AaHp5iwXz50ToaAh9fEALw_wcB_k_&gclid=Cj0KCQjw0bunBhD9ARIsAAZl0E1aD7WHp9dJYglAcWdr6RNRE-r4UXreE9XzXhD6n7AaHp5iwXz50ToaAh9fEALw_wcB";
		driver.get(url);
		System.out.println("open URL");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]/div[2]/div[2]/a[1]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/button[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]")).click();
		
//		driver.quit();
//		System.out.println("close URL");
	}
}
