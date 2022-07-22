package SeleniumWorkOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.get("https://courses.letskodeit.com/practice");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//input[@name='show-hide']"));
		
		Boolean b=element.isDisplayed();
		System.out.println(b);
		
	}

}
