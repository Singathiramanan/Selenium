package Advance;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Twobroser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="./Software/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver c=new ChromeDriver();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		c.close();
		
		String key1="webdriver.edge.driver";
		String value1="./Software/msedgedriver.exe";
		System.setProperty(key1, value1);
		EdgeDriver e=new EdgeDriver();
		Thread.sleep(4000);
		e.quit();
	}

}
