package SeleniumWorkOut;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.get("https://courses.letskodeit.com/practice");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//input[@id='enabled-example-input']
		
		WebElement element=driver.findElement(By.xpath("//input[@id='enabled-example-input']"));
		//*********main code
		String result=element.getAttribute("disabled");
		System.out.println(result);
		
		
		if(result!="true")
		{
			WebElement disableButton=driver.findElement(By.xpath("//input[@id='disabled-button']"));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
			wait.until(ExpectedConditions.elementToBeClickable(disableButton));
			
			disableButton.click();
			System.out.println("Its enabled");
		}
		else
		{
			System.out.println("its disabled");
		}
		
		String resultDisable=element.getAttribute("disabled");
		System.out.println(resultDisable);
		if(resultDisable.equals("true"))
		{
			WebElement enableButton=driver.findElement(By.xpath("//input[@id='enabled-button']"));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
			wait.until(ExpectedConditions.elementToBeClickable(enableButton));
			enableButton.click();
			System.out.println("Clicked enable");
		}
		else
		{
			System.out.println("its not in disable");
		}
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		element.clear();
		element.sendKeys("Narmada");
		Thread.sleep(1000);
		
		
		
		
		
		
		
	
		
	}

}
