package Advance;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lanch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="./Software/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver c=new ChromeDriver();
		c.quit();
	}

}
