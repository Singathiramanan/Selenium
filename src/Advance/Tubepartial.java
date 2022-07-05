package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tubepartial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("file:///F:/Seleniumweb/youtube.html");
		driver.findElement(By.partialLinkText("2022")).click();
		
	}

}
