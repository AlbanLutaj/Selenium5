package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homerwork1 {

	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

	public static void main(String[] args) throws InterruptedException {

		// Open chrome browser
		// Go to
		// "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		// Enter valid username
		// Clear username and enter again valid username
		// Leave password field empty
		// Click on login button
		// Verify error message with text "Invalid Login or Password." is displayed.

		System.setProperty("webdriver.chrome.drivers", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
		Thread.sleep(1000);
		username.clear();
		Thread.sleep(1000);
		username.sendKeys("Tester");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".button")).click();

		WebElement error = driver.findElement(By.cssSelector(".error"));

		Thread.sleep(2000);

		if (error.isDisplayed()) {
			System.out.println("The test passed,this is the text: " + error.getText());
			Thread.sleep(2000);
		} else {
			System.out.println("The test faild");
		}
		driver.quit();

	}

}
