package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Textfieldid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver() ;
		driver.get("F:/Seleniumweb/Textfield.html");
		Thread.sleep(3000);
		driver.findElement(By.id("i1")).sendKeys("venkataramanan");
		Thread.sleep(3000);
		driver.findElement(By.id("i1")).clear();
		Thread.sleep(3000);
		driver.close();
	}

}
