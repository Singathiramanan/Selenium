package Advance1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Filedload {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//driver.get("https://skpatro.github.io/demo/links/");
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=102.0.5005.61/");
		driver.findElement(By.xpath("//a[@href='/102.0.5005.61/chromedriver_win32.zip']")).click();
		
		

	}

}
