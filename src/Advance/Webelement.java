package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		WebElement ele=driver.findElement(By.xpath("//button[@aria-label='Settings']"));
		String value=ele.getAttribute("aria-label");
		System.out.println(value);
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//tp-yt-paper-button[@aria-label='Sign in']"));
		String value1=ele1.getText();
		System.out.println(value1);
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.xpath("//button[@aria-label='YouTube apps']"));
		Point value2=ele2.getLocation();
		System.out.println(value2);
		Thread.sleep(2000);
		int x=value2.getX();
		System.out.println(x);
		int y=value2.getY();
		System.out.println(y);
		int h=ele.getSize().getHeight();
		System.out.println(h);
		int w=ele.getSize().getWidth();
		System.out.println(w);
		driver.close();
		
				
	}

}
