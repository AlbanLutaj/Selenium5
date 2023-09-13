package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.drivers", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("neo@gmail.com");
		
		Thread.sleep(1000);
		
       WebElement pw = driver.findElement(By.id("pass"));
       
       pw.sendKeys("alban");
       
       Thread.sleep(2000);
       
       //dos not work the ID is not correct cause it change evrytime
       //driver.findElement(By.id("u_0_5_H5")).click();

       driver.findElement(By.name("login")).click();
       
       driver.findElement(By.linkText("Password dimenticata?")).click();
       
       Thread.sleep(5000);
       
       driver.quit();
	}
	

}
