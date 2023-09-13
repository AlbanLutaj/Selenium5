package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * HW1: Orange HRM Application Login: Open Chrome browser 
		 * Go to https://hrm.neotechacademy.com/ 
		 * Enter valid username and password 
		 * Click on login button 
		 * Then verify that "span with id account-name" has the text
		 * "Jacqueline White". 
		 * Quit the browser
		 */
	
		setUp();
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		WebElement White = driver.findElement(By.cssSelector("span[id='account-name']"));
	
		System.out.println( White.getText() + " name is displayed: " + White.isDisplayed());
		
		tearDown();

	}

}
