package SeleniumWorkOut;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_InTo_WebElement {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\703323585\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		EventFiringWebDriver eventDriver=new EventFiringWebDriver(driver);
		
		WebElement element=driver.findElement(By.xpath("//div[@class='tableFixHead']"));
		
		 //obtain element x, y coordinates with getLocation method
	      Point p = element.getLocation();
	      int X = p.getX();
	      int Y = p.getY();
	      System.out.println("X value="+X +"Y value="+Y);
	    
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("window.scrollTo("+X+","+Y+");");
		
	     // eventDriver.executeScript("document.querySelector(element).scrollTop=500");
	      
	      Actions action=new Actions(driver);
	      action.moveToElement(element).click().sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
	      Thread.sleep(500);  
		
		
	}

}
