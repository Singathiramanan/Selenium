package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tubelink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("file:///F:/Seleniumweb/youtube.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Youtube")).click();

	}

}
