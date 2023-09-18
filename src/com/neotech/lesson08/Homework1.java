package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Homework 2: -> Use FluentWait Verify element is enabled Open chrome browser
		 * Go to "https://the-internet.herokuapp.com/" Click on the "Dynamic Controls"
		 * link Click on enable button Enter "Hello" and verify text is entered
		 * successfully Close the browser
		 */

		setUp();

		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[13]/a")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
		wait.pollingEvery(Duration.ofSeconds(1));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick='swapInput()']")));
		
        WebElement enable = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
		
		enable.click();

		Thread.sleep(3000);

		WebElement hello = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));

		hello.sendKeys("hello");
		
		Thread.sleep(3000);

		hello.getText();

		if(hello.getAttribute("value").equalsIgnoreCase("Hello")) 
		{
			System.out.println("Test passed");
		}
		else 
		{
			System.out.println("Test failed");
		}
		
			
		tearDown();

	}

}
