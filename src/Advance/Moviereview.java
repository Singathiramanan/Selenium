package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moviereview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[.='Doctor Strange 2']/../../../td[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[.='KGF 2 ( All Languages)']/../../../td[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[.='Kashmir Files']/../../../td[4]")).click();
		
	}

}
