package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) throws InterruptedException {

		// Open chrome browser
		// Go to “https://demo.guru99.com/test/newtours/”
		// Click on Register Link
		//
		// Fill out just
		// First Name:
		// Last Name:
		// Phone:
		// Email:
		// And Click Submit

		System.setProperty("webdriver.chrome.drivers", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		driver.findElement(By.linkText("REGISTER")).click();

		Thread.sleep(1000);

		driver.findElement(By.name("firstName")).sendKeys("alban");

		Thread.sleep(1000);

		driver.findElement(By.name("lastName")).sendKeys("lutaj");

		Thread.sleep(1000);

		driver.findElement(By.name("phone")).sendKeys("12345867");

		Thread.sleep(1000);

		driver.findElement(By.id("userName")).sendKeys("alban@gmail.com");

		Thread.sleep(1000);

		driver.findElement(By.name("address1")).sendKeys("via redi 4");

		Thread.sleep(1000);

		driver.findElement(By.name("city")).sendKeys("vlore");

		Thread.sleep(1000);

		driver.findElement(By.name("state")).sendKeys("shqipri");

		Thread.sleep(1000);

		driver.findElement(By.name("postalCode")).sendKeys("5413");

		Thread.sleep(1000);

		driver.findElement(By.name("country")).sendKeys("albania");

		Thread.sleep(1000);

		driver.findElement(By.name("email")).sendKeys("AlbanLutaj");

		Thread.sleep(1000);

		driver.findElement(By.name("password")).sendKeys("inter");

		Thread.sleep(1000);

		driver.findElement(By.name("confirmPassword")).sendKeys("inter");

		Thread.sleep(1000);

		driver.findElement(By.name("submit")).click();

		Thread.sleep(5000);

		driver.quit();

	}

}
