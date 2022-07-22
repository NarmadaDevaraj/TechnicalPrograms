package SeleniumWorkOut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessMode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions op=new ChromeOptions();
		op.setHeadless(true);
		
		
		//WebDriver driver=WebDriverManager.chromedriver().create();//will do both driver instance creation and initialization
		
		WebDriver driver=WebDriverManager.chromedriver().capabilities(op).create();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("Worked properly");
		
	}

}
