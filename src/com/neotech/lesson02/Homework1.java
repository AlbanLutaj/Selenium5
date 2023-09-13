package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
		
		    //HW2: Facebook sign up:
			//Open chrome browser
			//Go to "https://www.facebook.com/"
			//Click on Sign Up link
			//Enter first name
			//Enter last name
			//Enter email address
			//Re-enter email address
			//Click on Sign Up button

			System.setProperty("webdriver.chrome.drivers", "drivers/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.linkText("Crea nuovo account")).click();
			
		    Thread.sleep(1000);
			
			driver.findElement(By.name("firstname")).sendKeys("Alban");
			
			Thread.sleep(1000);
			
            driver.findElement(By.name("lastname")).sendKeys("Lutaj");
			
			Thread.sleep(1000);
			
            driver.findElement(By.name("reg_email__")).sendKeys("alban@gmail.com");
			
			Thread.sleep(1000);
			
            driver.findElement(By.name("reg_email_confirmation__")).sendKeys("alban@gmail.com");
			
			Thread.sleep(1000);
			
            driver.findElement(By.id("password_step_input")).sendKeys("alban2345");
			
			Thread.sleep(1000);
			
            driver.findElement(By.id("day")).sendKeys("12");
			
			Thread.sleep(1000);
			
            driver.findElement(By.id("month")).sendKeys("mag");
			
			Thread.sleep(1000);
			
			 driver.findElement(By.id("year")).sendKeys("1990");
				
		    Thread.sleep(1000);
			
            driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
            
			Thread.sleep(1000);
			
			 driver.findElement(By.name("websubmit")).click();
				
		     Thread.sleep(5000);
		     
		     driver.quit();		     
		     
		
		
		
		
		
	}

}
