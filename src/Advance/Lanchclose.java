package Advance;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lanchclose {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="./Software/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver c=new ChromeDriver();
		Thread.sleep(3000);
		//c.close();
		c.quit();
	}

}
