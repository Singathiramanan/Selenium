package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Enterdata {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("F:/Seleniumweb/Textfield.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("venkat");
		Thread.sleep(4000);
		driver.findElement(By.tagName("input")).clear();
		Thread.sleep(2000);
		driver.close();

	}

	

}
