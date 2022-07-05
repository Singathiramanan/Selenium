package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Integrationmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nasthiyanmani");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Singathi@97");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@title='Mail']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Compose']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='select-input react-typeahead-input input-to Z_N ir_0 j_n y_Z2hYGcu q_ZkbNhI k_w W_6D6F H_6NIX M_0 b_0 P_SMJKi A_6EqO D_X p_a L_0 B_0']")).sendKeys("nasthiyanmadhavan@yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Integeration testing");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='rte em_N ir_0 iy_A iz_h N_6Fd5']")).sendKeys("hello selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='q_Z29WjXl e_dRA k_w r_P H_6VdP s_3mS2U en_0 M_1gLo4F V_M cZ1RN91d_n y_Z2hYGcu A_6EqO u_e69 b_0 C_52qC I4_Z2chSgW it3_dRA']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@class='_yb_nuzwd']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Sign out']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Sign In']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(.,'Use')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nasthiyanmadhavan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Singathi@97");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);      
		driver.findElement(By.xpath("//div[@title='Mail']")).click();
		Thread.sleep(3000);
		System.out.println("Finish");
		}

}
