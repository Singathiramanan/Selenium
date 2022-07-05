package Advance1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opentabbykeys {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Robot r=new Robot();
		for(int i=0;i<3;i++){
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
		}
		 Set<String> ele = driver.getWindowHandles();
		 ArrayList<String> lis=new ArrayList<String>(ele);
		 String id = lis.get(2);
		 driver.switchTo().window(id);
		 driver.close();

	}

}
