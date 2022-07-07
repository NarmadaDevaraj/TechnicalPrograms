package TestNGClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TesCase2 {

	@Test
	public void quiz() throws InterruptedException
	{
   
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Assert.assertTrue(true);
		System.out.println("quiz method TC2 ===m1");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void quiz1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Assert.assertTrue(true);
		System.out.println("quiz method TC2 ----m2");
		Thread.sleep(1000);
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
	@Test
	public void quiz5()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Assert.assertTrue(true);
		System.out.println("quiz method TC2 ----m5");
		driver.close();
	}
}
