package Advance1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Childpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		String wh = driver.getWindowHandle();
		System.out.println(wh);

	}

}
