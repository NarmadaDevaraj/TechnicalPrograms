package SeleniumWorkOut;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitSyntax {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		//webdriver and Search context
		WebDriver driver=new ChromeDriver(); //Recomended to use 
		
		ChromeDriver driver1=new ChromeDriver();
		
		//searchcontext and object class
		SearchContext driver3=new ChromeDriver(); //Super interface of selenium WebDriver
		
		Object driver4=new ChromeDriver();
		
		ChromeOptions opt=new ChromeOptions();//anything additional to the chrome i.e language,proxy,geolocation etc
		DesiredCapabilities cap=new DesiredCapabilities();
		
		WebDriver driver5=new RemoteWebDriver(new URL(""),opt);//used in selenium grid
		
	}

}
