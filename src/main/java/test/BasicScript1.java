package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript1 {

 public static void main(String[] args) {
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	 
	 driver.get("https://admin-demo.nopcommerce.com/login");
	 
	 driver.manage().window().maximize();
	 
	 String title = driver.getTitle();
	 
	 //Below are the 2 types to print title as a string
	 
	 System.out.println("Title is : "+title);
	 
	 System.out.println("Title is : "+driver.getTitle());
	 
	 WebElement emailbox = driver.findElement(By.id("Email"));
	 emailbox.clear();
	 emailbox.sendKeys("admin@yourstore.com");
	 
//	 driver.findElement(By.id("Email")).clear();
	 
//	 driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	 
     driver.findElement(By.id("Password")).clear();
	 
	 driver.findElement(By.id("Password")).sendKeys("admin");
	 
	 WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button"));
	 
	 System.out.println("Text of Login button is : "+loginbutton.getText());
	 
	 loginbutton.click();
	 
//	 driver.findElement(By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button")).click();
	 
//	 driver.close();
	 
	 driver.quit();
}
	
}
