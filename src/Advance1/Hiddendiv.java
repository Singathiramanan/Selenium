package Advance1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hiddendiv {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.cleartrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=EAIaIQobChMI99PFk4eU-AIVDpNmAh0IgwEyEAAYASAAEgKf1_D_BwE&gclid=EAIaIQobChMI99PFk4eU-AIVDpNmAh0IgwEyEAAYASAAEgKf1_D_BwE");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@style='min-width: 250px;']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//div[@aria-label='Sat Jun 11 2022']")).click();
		driver.close();
	}

}
