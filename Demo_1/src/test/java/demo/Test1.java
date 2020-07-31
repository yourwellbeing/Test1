package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
  
WebDriver driver;
	
	@Test
	public void testHelloWorld() throws Throwable {
		
		System.out.println("...  Hello World....!");
		driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}
}
