package Advance1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CompareRate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(6000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("RedmiNote 10");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[.='REDMI Note 10S (Deep Sea Blue, 64 GB)']")).click();
		Thread.sleep(6000);
		Set<String> wh = driver.getWindowHandles();
		ArrayList<String> id=new ArrayList<String>(wh);
		driver.switchTo().window(id.get(1));
		 
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
