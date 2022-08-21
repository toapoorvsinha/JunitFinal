package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTest {

	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//
		//driver.findElement(By.xpath("/html/body/div[3]/input[3]")).click();
		
//		driver.findElement(By.name("todo[0]")).click();
//		driver.findElement(By.name("todo[1]")).click();
//		driver.findElement(By.name("todo[2]")).click();
		
		
	}
	
	@Test
	public void loginTest() throws InterruptedException
	{
		//Junit Test 1-click toggle All button
		driver.findElement(By.xpath("/html/body/div[3]/input[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/input[3]")).click();
		
		//Junit Test 2-click a single element then click remove to see if it works
		driver.findElement(By.name("todo[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();
		
		//Junit Test 3: Validate that all list item could be removed using the remove
		//button and when "Toggle All" functionality is on.
		driver.findElement(By.xpath("/html/body/div[3]/input[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();
		 
	}
	

}
