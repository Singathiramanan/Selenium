package Advance1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Fileupload {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("file:///F:/Seleniumweb/Popup.html");
		WebElement ele = driver.findElement(By.xpath("//input[@name='uploadfile']"));
		ele.sendKeys("F:\\Seleniumweb\\Program.txt");

	}

}
