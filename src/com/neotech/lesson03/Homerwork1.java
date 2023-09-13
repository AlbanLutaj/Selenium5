package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homerwork1 {

	public static void main(String[] args) throws InterruptedException {

		//Homework 1:
		    //Using xPath ONLY
		    //TC 2: Mercury Tours Registration: 
		        //Open chrome browser
		        //Go to “http://demo.guru99.com/test/newtours/”
		        //Click on Register Link
		        //Fill out all required info
		        //Click Submit
		        //User successfully registered

		System.setProperty("webdriver.chrome.drivers", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		driver.findElement(By.xpath("//a[@href ='register.php']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("Alban");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name = 'lastName']")).sendKeys("Lutaj");
		Thread.sleep(1000);

		WebElement phone = driver.findElement(By.xpath("//input[@name = 'phone']"));
		phone.sendKeys("324567");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("alban@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name ='address1']")).sendKeys("viale redi 3");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("Zurich");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name = 'state']")).sendKeys("Swiss");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name = 'postalCode']")).sendKeys("50013");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//select[@name = 'country']")).sendKeys("SWITZERLAND");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("AlbanLutaj");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("fgbds");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name = 'confirmPassword']")).sendKeys("fgbds");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name = 'submit']")).click();
		Thread.sleep(3000);

	}

}
