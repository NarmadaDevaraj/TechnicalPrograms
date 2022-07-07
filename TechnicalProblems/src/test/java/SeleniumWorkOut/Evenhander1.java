package SeleniumWorkOut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Evenhander1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\703323585\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		@SuppressWarnings("deprecation")
		EventFiringWebDriver fireWebdriver=new EventFiringWebDriver(driver);
		EventHandler handle=new EventHandler();
		
		fireWebdriver.register(handle);
		
		fireWebdriver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		fireWebdriver.manage().window().maximize();
		
		

	}

}
