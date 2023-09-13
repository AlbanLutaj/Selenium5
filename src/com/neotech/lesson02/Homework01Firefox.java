package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework01Firefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.drivers", "drivers/geckodriver");

		// Open the Firefox browser
		WebDriver driver = new FirefoxDriver();

		// driver.get("https://www.redfin.com/");
		String url = "https://www.redfin.com/";
		// navigate to the url
		driver.get(url);

		Thread.sleep(1000);// one second

		// get the current url of the page
		String currentUrl = driver.getCurrentUrl();

		if (url.equals(currentUrl)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
			System.out.println("Current url:" + currentUrl);
			System.out.println("Expected url:" + url);
		}

		Thread.sleep(500); // waiting for 0.5 seconds
		driver.quit();

	}

}
















