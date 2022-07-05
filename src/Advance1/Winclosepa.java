package Advance1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Winclosepa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(3000);
		driver.findElement(By.name("NewWindow")).click();
		String p_id=driver.getWindowHandle();
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh){
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			System.out.println(title);
			if(wh.equals(p_id)
					
					)
			driver.close();
		}
	}

}
