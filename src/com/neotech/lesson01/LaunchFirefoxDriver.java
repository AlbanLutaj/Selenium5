package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxDriver {

	public static void main(String[] args) throws InterruptedException {
		
		
       System.setProperty("webdriver.gecko.drivers", "drivers/geckodriver");
		
		//open the browser
		WebDriver driver = new FirefoxDriver(); //our command they are comming from selenium library
		
		driver.get("https://www.neotechacademy.com/");
		
		String actualURL = driver.getCurrentUrl();
		
		System.out.println(actualURL);
		
		String expectedURL = "https://www.neotechacademy.com/";
		
		System.out.println(expectedURL);
		
		if ( actualURL.equalsIgnoreCase(expectedURL)) 
		{
			System.out.println("Title: " + driver.getTitle());
		}
		else 
		{
			System.out.println("The URL is wrong");
		}
		
		Thread.sleep(5000); //pause the execution 5 second
		
		driver.quit(); //close the browser
		
	}

}
