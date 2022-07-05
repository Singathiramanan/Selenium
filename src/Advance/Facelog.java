package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facelog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("venkat");
		driver.findElement(By.name("pass")).sendKeys("Ramanan@123");
		driver.findElement(By.name("login")).click();
	}

}
