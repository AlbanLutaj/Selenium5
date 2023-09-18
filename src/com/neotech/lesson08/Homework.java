package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Homework 1: Use WebDriverWait
        Verify element is enabled
        Open chrome browser
        Go to "https://the-internet.herokuapp.com/"
        Click on the "Dynamic Controls" link
        Click on enable button
        Enter "Hello" and verify text is entered successfully
        Close the browser
		 */
	
		setUp();
		
		driver.findElement(By.linkText("Dynamic Controls")).click();

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement enable = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
		
		enable.click();
		
		Thread.sleep(3000);
		
		WebElement hello = driver.findElement(By.xpath("//input[@type='text']"));
		
		hello.sendKeys("hello");
		
		Thread.sleep(3000);
		
		hello.getText();
		
		if(hello.isDisplayed()) 
		{
			System.out.println("Test passed: " + hello.isDisplayed());
		}else 
		{
			System.out.println("Test failed");
		}
		
		Thread.sleep(3000);
		
		tearDown();

	}

}
