package Advance1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./Software/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("Admin");
		driver.findElement(By.name("submit")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
	}

}
