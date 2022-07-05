package Advance;

import org.openqa.selenium.edge.EdgeDriver;

public class Lanchedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.edge.driver";
		String value="./Software/msedgedriver.exe";
		System.setProperty(key, value);
		EdgeDriver e=new EdgeDriver();
		e.close();
		}
}
