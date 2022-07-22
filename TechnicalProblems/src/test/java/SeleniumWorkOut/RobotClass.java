package SeleniumWorkOut;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {

	//simulating the keyboard and mouse events
	//To handle windows pop up  and email attachments etc
	//windows/os pop ups does not contains html element
	//One can't use Action class methods to handle keyboard/mouse events on Desktop windows pop-up. The reason being, Actions class methods need WebElement objects to perform actions. Whereas for Desktop windows pop-up, no locator exists, and the same can be verified using browser developer tools. Therefore, to handle such scenarios, the Robot class is used.
	
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 driver.get("http://the-internet.herokuapp.com/basic_auth");
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		driver.manage().window().maximize();
				
				
		//using robot class
		Robot robot=new Robot();	
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);


		WebElement element = driver.findElement(By.xpath("//div[@class='example']/p"));
		String successMessage = element.getText();
		System.out.println(successMessage);
		
		driver.close();

	}

}
