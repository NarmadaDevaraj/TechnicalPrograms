package SeleniumWorkOut;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOverAndOtherSyntax {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

       System.setProperty("webdriver.chrome.driver","C:\\Users\\703323585\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
		
		//**** RemoteWebDriver is a Class ,It implements WebDriver,TakeScreenshot ,JavaScriptExecutor ..etc interfaces
		//RemoteWebDriver driver=new ChromeDriver();
//		driver.get("https://www.wikipedia.org/"); //return type navigation interface
//		
//		//a[href*='donate']
//		WebElement ele=driver.findElement(By.cssSelector("a[href*='donate']"));
//		ele.click();
//		System.out.println(ele.getText());
//		System.out.println("clicked");
	   Actions action =new Actions(driver);
	   driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	   driver.manage().window().maximize();
	   try {
		   WebElement mousehoverElement=driver.findElement(By.xpath("//button[@id='mousehover']"));
		   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   wait.until(ExpectedConditions.elementToBeClickable(mousehoverElement));
		   
		   WebElement clickTop=driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[text()='Top']"));
		   action.moveToElement(mousehoverElement).moveToElement(clickTop).click().build().perform();//we are performing more than one operations so we have to use build() to compile all the actions into a single step.
		   System.out.println("worked perfectly");
		   Thread.sleep(5000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
	   //iframe
	   
	   
	   
	   driver.switchTo().frame("courses-iframe");
	   WebElement fElement=driver.findElement(By.xpath("(//div[@class='login-btn']/a)[1]"));
//	   ((JavascriptExecutor)driver).executeScript("arguements[0].scrollInToView();",fElement);
//	   
	   action.moveToElement(fElement);
	  
	   fElement.click();
	   Thread.sleep(30000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
				
	}

}
