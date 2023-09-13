package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homerwork1 {

	public static void main(String[] args) throws InterruptedException {
		
  //HW1: Amazon Page Title Verification: 
  //Open chrome browser
  //Go to “https://www.amazon.com/”
  //Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
  //End the Session (close the browser).
		
		System.setProperty("webdriver.chrome.drivers", "drivers/chromedriver");
		
		WebDriver amazon = new ChromeDriver();
		
		amazon.get("https://www.amazon.com/");
		
		String expectedURL = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		String currentTitle = amazon.getTitle();
		
		System.out.println("Title is : "+ currentTitle);
		
		if ( currentTitle.equalsIgnoreCase(expectedURL)) 
		{
			System.out.println("Title: " + amazon.getTitle());
		}
		else 
		{
			System.out.println("The Title is wrong");
		}
	
		Thread.sleep(5000);
		
		amazon.quit();
		
	}

}
