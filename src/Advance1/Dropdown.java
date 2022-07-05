 package Advance1;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Seleniumweb/Dropdown.html");
		WebElement opt1= driver.findElement(By.id("aasdf"));
		WebElement opt2= driver.findElement(By.id("aaert"));
		Select sel=new Select(opt1);
		Select sel2=new Select(opt2);
		sel.selectByIndex(2);
		sel.selectByIndex(4);
		sel.selectByIndex(5);
		List<WebElement> s1 = sel.getAllSelectedOptions();
		TreeSet<String> t1=new TreeSet<String>();
		for(WebElement a1:s1){
			t1.add(a1.getText());
		}
		for(String b1:t1){
			System.out.println(b1);
		}
		int c = sel2.getOptions().size();
		for(int i=0;i<c;i++){
			sel2.selectByIndex(i);
		}
		List<WebElement> s2 = sel2.getAllSelectedOptions();
		TreeSet<String> t2=new TreeSet<String>(Collections.reverseOrder());
		for(WebElement a2:s2){
			t2.add(a2.getText());
		}
		for(String b2:t2){
			System.out.println(b2);
		}
	}

}
