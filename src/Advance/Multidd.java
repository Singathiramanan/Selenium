package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Seleniumweb/Hotal.html");
		WebElement ele = driver.findElement(By.xpath("//select"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("c");
		Thread.sleep(2000);
		s.selectByVisibleText("Naan");
		Thread.sleep(2000);
		s.deselectAll();
		driver.close();

	}

}
