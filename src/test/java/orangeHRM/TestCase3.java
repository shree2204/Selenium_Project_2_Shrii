package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class TestCase3 {
	private static WebDriver driver = null;
	
      @Test
      public void valid_credential() throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
    	System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		
	    driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		System.out.println("open URL");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		System.out.println("close URL");
	}
      @Test
      public void validUsername_invalidPass() throws InterruptedException {
    	ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
  	    driver = new ChromeDriver(co);
  		driver.manage().window().maximize();
  		Thread.sleep(2000);
  		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
  		driver.get(url);
  		System.out.println("open URL");
  		Thread.sleep(2000);
  		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
  		username.sendKeys("Admin");
  		Thread.sleep(2000);
  		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
  		password.sendKeys("asdfg");
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//button[@type='submit']")).click();
  		driver.close();
  		System.out.println("close URL"); 
    }
      @Test
      public void validUsername_blankPass() throws InterruptedException {
    	  ChromeOptions co = new ChromeOptions();
    		co.addArguments("--remote-allow-origins=*");
    		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    		driver = new ChromeDriver(co);
    		driver.manage().window().maximize();
    		Thread.sleep(2000);
    		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    		driver.get(url);
    		System.out.println("open URL");
    		Thread.sleep(2000);
    		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
    		username.sendKeys("Admin");
    		Thread.sleep(2000);
    		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
    		password.sendKeys("");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//button[@type='submit']")).click();
    		driver.close();
    		System.out.println("close URL"); 
      }
      @Test
      public void wrongUsername_validPass() throws InterruptedException {
    	    ChromeOptions co = new ChromeOptions();
    		co.addArguments("--remote-allow-origins=*");
    		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    		driver = new ChromeDriver(co);
    		driver.manage().window().maximize();
    		Thread.sleep(2000);
    		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    		driver.get(url);
    		System.out.println("open URL");
    		Thread.sleep(2000);
    		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
    		username.sendKeys("Adminnn");
    		Thread.sleep(2000);
    		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
    		password.sendKeys("admin123");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//button[@type='submit']")).click();
    		driver.close();
    		System.out.println("close URL");   
      }
      @Test
      public void wrongUsername_wrongPass() throws InterruptedException {
    	ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
  		driver = new ChromeDriver(co);
  		driver.manage().window().maximize();
  		Thread.sleep(2000);
  		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
  		driver.get(url);
  		System.out.println("open URL");
  		Thread.sleep(2000);
  		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
  		username.sendKeys("Adminnn");
  		Thread.sleep(2000);
  		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
  		password.sendKeys("asdfgh");
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//button[@type='submit']")).click();
  		driver.close();
  		System.out.println("close URL");  
      }
      @Test
      public void wrongUsername_blankPass() throws InterruptedException {
    	  ChromeOptions co = new ChromeOptions();
    		co.addArguments("--remote-allow-origins=*");
    		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    		driver = new ChromeDriver(co);
    		driver.manage().window().maximize();
    		Thread.sleep(2000);
    		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    		driver.get(url);
    		System.out.println("open URL");
    		Thread.sleep(2000);
    		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
    		username.sendKeys("Adminnn");
    		Thread.sleep(2000);
    		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
    		password.sendKeys("");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//button[@type='submit']")).click();
    		driver.close();
    		System.out.println("close URL");  
    	  
      }
      @Test
      public void blankUsername_validPass() throws InterruptedException {
    	  ChromeOptions co = new ChromeOptions();
    		co.addArguments("--remote-allow-origins=*");
    		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    		driver = new ChromeDriver(co);
    		driver.manage().window().maximize();
    		Thread.sleep(2000);
    		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    		driver.get(url);
    		System.out.println("open URL");
    		Thread.sleep(2000);
    		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
    		username.sendKeys("");
    		Thread.sleep(2000);
    		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
    		password.sendKeys("admin123");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//button[@type='submit']")).click();
    		driver.close();
    		System.out.println("close URL");  
    	  
      }
      @Test
      public void blankUsername_wrongPass() throws InterruptedException {
    	  ChromeOptions co = new ChromeOptions();
    		co.addArguments("--remote-allow-origins=*");
    		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    		driver = new ChromeDriver(co);
    		driver.manage().window().maximize();
    		Thread.sleep(2000);
    		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    		driver.get(url);
    		System.out.println("open URL");
    		Thread.sleep(2000);
    		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
    		username.sendKeys("");
    		Thread.sleep(2000);
    		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
    		password.sendKeys("asdfg");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//button[@type='submit']")).click();
    		driver.close();
    		System.out.println("close URL");  
    	}
      @Test
      public void blankUsername_blankPass() throws InterruptedException {
    	  ChromeOptions co = new ChromeOptions();
    		co.addArguments("--remote-allow-origins=*");
    		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    		driver = new ChromeDriver(co);
    		driver.manage().window().maximize();
    		Thread.sleep(2000);
    		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    		driver.get(url);
    		System.out.println("open URL");
    		Thread.sleep(2000);
    		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
    		username.sendKeys("");
    		Thread.sleep(2000);
    		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
    		password.sendKeys("");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//button[@type='submit']")).click();
    		driver.close();
    		System.out.println("close URL");  
    	  
      }
}
