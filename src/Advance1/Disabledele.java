package Advance1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabledele {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Seleniumweb/Disabled.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('tf').value='venkat'");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('tf').value=''");
		Thread.sleep(3000);
		driver.close();
	}

}
