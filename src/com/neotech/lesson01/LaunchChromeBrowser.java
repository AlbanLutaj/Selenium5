package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
	
		        //We have added everything we need on the communitìcation path
				//we add selenium language binding (Selenium Java Libs)
				//we added the chromedriver
				//all we need to do,is to use selenium classes to call 
				//the chromedriver and open/close the chromedriver
		
		
		// if java cannot find our chrome driver location
		
		System.setProperty("webdriver.chrome.drivers", "drivers/chromedriver");
		
		//open the browser
		WebDriver driver = new ChromeDriver(); //our command they are comming from selenium library
		
		driver.get("https://www.neotechacademy.com/");
		
		Thread.sleep(5000); //pause the execution 5 second
		
		driver.quit(); //close the browser
		
		
	}

}
