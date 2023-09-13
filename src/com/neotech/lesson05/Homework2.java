package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * TC 2: Orange HRM Application Negative Login: 
		 * Open Chrome browser 
		 * Go to https://hrm.neotechacademy.com/ 
		 * Enter valid username 
		 * Leave password field empty 
		 * Verify error message with text "Password cannot be empty" is displayed.
		 */
		
		setUp();
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		WebElement noempty = driver.findElement(By.cssSelector("#txtPassword-error"));
		
		System.out.println( noempty.getText() + " is displayed: " + noempty.isDisplayed());
		
		tearDown();
		
		
		
		
		
		
		
		
		
	}

}
