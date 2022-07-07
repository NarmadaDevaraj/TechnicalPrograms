package TestNGClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 
{

	@Test
	public void company()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Assert.assertTrue(true);
		System.out.println("company method TC1");
		driver.close();
	}
	@Test
	public void quiz3() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Assert.assertTrue(true);
		System.out.println("quiz method TC2 ----m3");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void quiz4()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Assert.assertTrue(true);
		System.out.println("quiz method TC2 ----m4");
		driver.close();
	}
}
