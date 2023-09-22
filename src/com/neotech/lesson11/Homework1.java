package com.neotech.lesson11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		System.out.println("Title -> " + driver.getTitle());

		System.out.println("Handle -> " + driver.getWindowHandle());
		
		driver.findElement(By.linkText("Guida")).click();
		
		switchToChildWindow();
		
		wait(2);
		
		System.out.println("Title -> " + driver.getTitle());
		
		System.out.println("Handle -> " + driver.getWindowHandle());
		
		driver.close();
		
		wait(2);
		
		tearDown();
	}

}
