package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.edge.EdgeDriver;

public class Contain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(By.xpath("(//div[.='Fashion'])[4]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();

	}

}
