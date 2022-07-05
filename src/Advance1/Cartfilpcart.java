package Advance1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Cartfilpcart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver", "./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(6000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("RedmiNote 10");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[.='REDMI Note 10S (Deep Sea Blue, 64 GB)']")).click();
		Thread.sleep(6000);
		Set<String> wh = driver.getWindowHandles();
		ArrayList<String> id=new ArrayList<String>(wh);
		driver.switchTo().window(id.get(1));
		WebElement ele = driver.findElement(By.xpath("//div[@class='_3I9_wc _2p6lqe']/preceding-sibling::div[1]"));
		String text = ele.getText();
		String no="";
		for(int i=0;i<text.length();i++){
			char ch=text.charAt(i);
			if(ch>=48&&ch<=57){
				no=no+ch;
			}
		}
		int x=Integer.parseInt(no);
		driver.navigate().to("https://www.Amazon.in");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("RedmiNote 10");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@alt='Redmi Note 10S (Deep Sea Blue, 6GB RAM, 64GB Storage) -Super Amoled Display | 33W Charger Included']")).click();
		Thread.sleep(6000);
		WebElement ele1 = driver.findElement(By.xpath("//div[.='₹13,999.00']"));
		String text1 = ele1.getText();
		String no1="";
		for(int i=0;i<text1.length();i++){
			char ch=text1.charAt(i);
			if(ch>=48&&ch<=57){
				no1=no1+ch;
			}
		}
		int y=Integer.parseInt(no1);
		y=y/100;
		if(x==y){
			System.out.println("Price are same you can buy either");
		}else if(x>y){
			System.out.println("Amazon is less amount compare to Flipkart");
			System.out.println("Price "+y);
		}else{
			System.out.println("Flipkart is less amount compare to Amazon");
			System.out.println("Price "+x);
		}
		//driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("623701");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[.='Change']")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		//Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
			
		
	}

}
