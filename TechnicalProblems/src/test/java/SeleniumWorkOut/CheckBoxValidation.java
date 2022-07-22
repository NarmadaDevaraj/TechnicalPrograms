package SeleniumWorkOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
    	driver.get("https://courses.letskodeit.com/practice");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//*[@id='bmwcheck']"));
		
		//optional way to findout whether its checked or not
		String r=element.getAttribute("checked");
		System.out.println(r);
		
		//the way to find out whether its selected or not
		if(element.isSelected())
		{
			System.out.println("Selected");
		}else if(element.isEnabled())
		{
			System.out.println("Element is enabled");
		}else
		{
			System.out.println("Not in both the case");
		}

	}//		checked

}
