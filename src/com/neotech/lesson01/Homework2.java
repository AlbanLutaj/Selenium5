package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
		
		//HW2: Opening Page on Firefox Browser
		//Open Firefox browser
		//Navigate to “https://www.redfin.com/”
		//Verify that you have navigated to (https://www.redfin.com/)
		//End the Session (close the browser).	
		
		System.getProperty("webdriver.gecko.drivers", "drivers/geckodriver");
		
		WebDriver redfin = new FirefoxDriver();
		
		redfin.get("https://www.redfin.com/");
		
		String currentURL = redfin.getCurrentUrl();
		
		String expectedURL = "https://www.redfin.com/";
		
		if ( currentURL.equalsIgnoreCase(expectedURL)) 
		{
			System.out.println("Title: " + redfin.getTitle());
		}
		else 
		{
			System.out.println("The URL is wrong");
		}

		Thread.sleep(5000);
		
		redfin.quit();
		
	}

}
