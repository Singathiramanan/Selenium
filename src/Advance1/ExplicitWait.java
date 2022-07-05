package Advance1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://localhost//login.do");
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.xpath("//div[.='login']")).click();
		 WebDriverWait wait=new WebDriverWait(driver, 7);
		 wait.until(ExpectedConditions.titleContains("Enter"));
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 

	}
              
}
