package SeleniumWorkOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//*[@id='bmwradio']
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
    	driver.get("https://courses.letskodeit.com/practice");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//*[@id='bmwradio']"));
		
		if(element.isSelected())
		{
			System.out.println("Yes its selected");
		}else if(element.isEnabled())
		{
			System.out.println("Its enabled");
		}else
		{
			System.out.println("not selected");
		}
	
	}

}
