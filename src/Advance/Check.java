package Advance;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Seleniumweb/Checkbox.html");
		List<WebElement> val = driver.findElements(By.xpath("//input"));
		int count=val.size();
		System.out.println(count);
		for(WebElement we:val){
			we.click();
			Thread.sleep(1000);
		}
		Collections.reverse(val);
		for(WebElement rev:val){
			rev.click();
			Thread.sleep(1000);
		}
		driver.close();
	}

}
