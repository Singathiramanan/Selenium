package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubelike {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("jai bhim trailer tamil");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(16000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Jai Bhim - Official Tamil Trailer | Suriya | New Tamil Movie 2021 | Amazon Prime Video']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='278K']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
