package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubecss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("jai bhim trailer tamil");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("#search-icon-legacy > yt-icon")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
		Thread.sleep(6000);
		driver.close();
		
	}

}
