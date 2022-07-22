package SeleniumWorkOut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAllowOrBlockPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Handle allow or block popup
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(op);
		
		
		
		
	}

}
