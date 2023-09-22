package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Homework extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();

		Thread.sleep(1000);
		
		switchToFrame(0);
		
		WebElement ageText = driver.findElement(By.id("age"));
		
		sendText(ageText,"Alban");
		
		wait(2);
	
		driver.switchTo().defaultContent();
		
		WebElement frameAge = driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		switchToFrame(frameAge);
		
		wait(2);
		
		WebElement age = driver.findElement(By.id("age"));
		
		sendText(age,"33");
		
		wait(2);
		
		driver.switchTo().defaultContent();
		
		tearDown();
		
	}

}
