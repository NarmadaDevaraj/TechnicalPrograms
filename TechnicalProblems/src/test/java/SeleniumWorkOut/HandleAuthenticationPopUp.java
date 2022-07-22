package SeleniumWorkOut;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthenticationPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		//Syntax ---> https://username:password@URL
		//https://admin:admin@the−nternet.herokuapp.com/basic_auth
		//http://the-internet.herokuapp.com/basic_auth
		
		//WebDriver driver=WebDriverManager.chromedriver().create();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//div[@class='example']/p"));
		String successMessage=element.getText();
		System.out.println(successMessage);	
		
		driver.close();
		
		
	}

}
