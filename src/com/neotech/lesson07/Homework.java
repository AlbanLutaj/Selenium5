package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.google.common.base.Strings;
import com.neotech.utils.BaseClass;

public class Homework extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * ================== HW_1_Handling Multiple Windows =======================
		 * 
		 * 1) Launch the browser and open the site "http://demo.guru99.com/popup.php" 2)
		 * Click on link "Click Here". When the user clicks on the "Click Here" link,
		 * new child window opens. 3) On the Child Window, Enter your email ID and
		 * submit. 4) Then Access Credentials will be Displayed on submitted page. You
		 * will see the child window is open in new tab. 5) Close the Child window on
		 * which credentials are displayed.Switch to the parent window. 6) Quit all
		 * browsers
		 */

		setUp();

		driver.findElement(By.linkText("Click Here")).click();

		Thread.sleep(2000);

		Set<String> wind = driver.getWindowHandles();

		Thread.sleep(2000);

		Iterator<String> allWind = wind.iterator();

		String first = allWind.next();
		String second = allWind.next();

		System.out.println(first);
		System.out.println(second);

		driver.switchTo().window(second);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("alban@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(2000);

		driver.close();

		Thread.sleep(2000);

		driver.switchTo().window(first);

		Thread.sleep(2000);

		tearDown();
	}

}
