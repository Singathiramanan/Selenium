package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keysenum {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Seleniumweb/Keys.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@value='Ramanan']"));
		System.out.println(ele.isSelected());
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		ele.sendKeys(Keys.CONTROL+"ac");
		System.out.println(ele.isSelected());
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//input[@value='Singathi']"));
		ele1.sendKeys(Keys.CONTROL+"av");
		Thread.sleep(2000); 
		System.out.println("complete");
		driver.close();
	}

}
