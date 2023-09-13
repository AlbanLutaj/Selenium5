package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * ================= HW_2_Handling Frames =================================
		 * 
		 * 1) Launch the browser and open the site
		 * "https://chercher.tech/practice/frames-example-selenium-webdriver" 2) Verify
		 * on the page header "Not a Friendly Topic" displayed 3) Click on the Inner
		 * Frame Check box 4) Choose baby Cat from Animals dropdown 5) Quit the browser
		 */

		setUp();

		WebElement header = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));

		System.out.println(header.getText());

		if (header.isDisplayed()) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test Failed");
		}

		WebElement first = driver.findElement(By.id("frame1"));

		Thread.sleep(2000);

		driver.switchTo().frame(first);

		Thread.sleep(2000);

		WebElement third = driver.findElement(By.id("frame3"));

		Thread.sleep(2000);

		driver.switchTo().frame(third);

		Thread.sleep(2000);

		driver.findElement(By.id("a")).click();

		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		WebElement second = driver.findElement(By.id("frame2"));

		Thread.sleep(2000);

		driver.switchTo().frame(second);
		
		Thread.sleep(2000);
		
		WebElement select = driver.findElement(By.id("animals"));

		Select babycat = new Select(select);
		
		babycat.selectByValue("babycat");
		
		Thread.sleep(2000);

		tearDown();

	}

}
