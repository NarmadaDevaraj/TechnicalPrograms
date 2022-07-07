package SeleniumWorkOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.id(""));
		
		By id=By.id("Narmada");
		WebElement element=driver.findElement(id);
		
		WebElement ele =driver.findElement(By.id("Narmadada"));
		
		WebElement relative=driver.findElement(By.id(""));
		

	}

}
