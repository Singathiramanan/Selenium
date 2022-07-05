package Advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mapsgoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Google maps");
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//span[.='google maps']")).click();
		//Thread.sleep(12000);
		driver.findElement(By.xpath("//a[@href='https://maps.google.com/']")).click();
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
		//driver.findElement(By.xpath("(//span[@class='DVeyrd LCTIRd'])[1]")).click();
		//Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@class='gstl_51 sbib_a']")).click();
		//Thread.sleep(8000);
		driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[4]")).sendKeys("Hosur");
		//Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@aria-label='Choose destination, or click on the map...']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Choose destination, or click on the map...']")).sendKeys("Rameshwaram");
		driver.findElement(By.xpath("(//button[@class='mL3xi'])[3]")).click();
		//Thread.sleep(12000);
		driver.findElement(By.xpath("//button[@class='TIQqpf fontTitleSmall XbJon Hk4XGb']")).click();
		//Thread.sleep(8000);
		driver.close();

	}

}
