package SeleniumWorkOut;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;

public class SyntaxOfWaits {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//***settig path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\703323585\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//***WebDriver is an Interface and ChromeDriver is an class
		WebDriver driver=new ChromeDriver();
		
		//Handle allow /block popup
		ChromeOptions p = new ChromeOptions();
		p.addArguments("--disable-notifications");
		
		//**** RemoteWebDriver is a Class ,It implements WebDriver,TakeScreenshot ,JavaScriptExecutor ..etc interfaces
		//RemoteWebDriver driver=new ChromeDriver();
		
		//***to get the url  .get() and navigate().to() method internally works same .The only Difference is get()-will accepts only string and navigate().to() - will accepts both String and URL as Parameter.
		//driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");//return type -void
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/"); //return type navigation interface
		
		
		//****types of navigate method operation
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.navigate().to("");//url or string
//		
		//***************************Manage method
		//driver.manage().window().minimize();
		driver.manage().window().maximize(); //to maximize the 
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait syntax
	
		//**********************Select class
		Select select=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		List<WebElement> list=select.getOptions();
		for(WebElement list1:list)
		{
			System.out.println(list1.getText());
		}
		
		
		//******************** Actions class
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		Actions action=new Actions(driver);
		//** Simulate keyboard event --Perform CTRL+ARROW_DOWN+ARROW_DOWN..
		action.keyUp(Keys.CONTROL).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).keyUp(Keys.CONTROL).build().perform();
		//**//div[@id='radio-btn-example']/fieldset/label[1]/following-sibling::label[2]
		
		
		//div[@id='radio-btn-example']/fieldset/label[1]/following-sibling::label[1] //travers from 1st to 2nd
		WebElement radioButton2=driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[1]/following-sibling::label[1]/input"));
		radioButton2.click();
		
		//************************Handle windows
		WebElement n_Window=driver.findElement(By.xpath("//button[@id='openwindow']"));
		n_Window.click();
		
		//***get current window id
		String parentWindow=driver.getWindowHandle();
		
		Set<String>  numberOfWindows=driver.getWindowHandles();
		
		System.out.println(numberOfWindows);
		for(String windows_Opened:numberOfWindows)
		{
			System.out.println(windows_Opened);
			//**to handle windows
			if(!parentWindow.equals(windows_Opened))
			{
				driver.switchTo().window(windows_Opened);
			}
		}
		
		System.out.println(driver.getTitle());
		
		
		//*********Handle Tabs
		 String parentTab=driver.getWindowHandle();
		WebElement tab=driver.findElement(By.xpath("//a[@id='opentab']"));
		tab.click();
        Set<String>  numberOfTabs=driver.getWindowHandles();
		System.out.println(numberOfTabs);
       	
		for(String Tabs_Opened:numberOfTabs)
		{
			System.out.println(Tabs_Opened);
			//**to handle windows
			if(!parentTab.equals(Tabs_Opened))
			{
				driver.switchTo().window(Tabs_Opened);
			}
		}
		
		System.out.println(driver.getTitle());
		
		//**********Handle Alerts
		WebElement handleAlertMsg=driver.findElement(By.xpath("//input[@id='alertbtn']"));
		handleAlertMsg.click();
		
		
		//Syntax for to handle alerts
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("Narmada");
		
		
		//*******Handle Frames //using tag name ,we can identify the size
		driver.switchTo().frame(0); //by index
		driver.switchTo().frame("Name or ID"); //by name
		driver.switchTo().frame("frameElement"); //by webelement //
		driver.switchTo().parentFrame();//Switch to parent frame
	    driver.switchTo().defaultContent(); //switch to most parent frame

	    //************waits
	    
	    //WebDriverWait wait =new WebDriverWait(driver,10);//this is depricated on selenium 4
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30)); //inline 132 and 133 both are same
	   // FluentWait<WebDriver> wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(tab));
	   //***Fluent wait
	    Wait<WebDriver> f_wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	    
	    WebElement fele=f_wait.until(new Function<WebDriver,WebElement>()
	    {

			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.name("narmada"));
			}
	    	
	    });
	    
	    
		//***Close the current focusing window/tabs
		driver.close();
		
		//**quit () method closes down all the windows/Tabs that the program has opened.
		driver.quit();
		
	}

}
