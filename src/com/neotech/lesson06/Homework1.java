package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Homework 2: Alert text verification Open chrome browser Go to
		 * https://demoqa.com/ Click on "Alerts, Frame & Windows" link Click on "Alerts"
		 * links on the left side Click on button to see Alert Verify alert box with
		 * text "You clicked a button" is present Click on 3rd button in the page Verify
		 * alert box with text "Do you confirm action?" is present and click "confirm"
		 * Click on 4 th button in the page and enter your name and click ok. Quit
		 * browser
		 */

		setUp();

		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Alerts']")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("alertButton")).click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		if (alert.getText().equals("You clicked a button")) {
			System.out.println("The test passed");
		} else {
			System.out.println("The test failed");
		}

		Thread.sleep(2000);

		alert.accept();

		Thread.sleep(2000);

		driver.findElement(By.id("confirmButton")).click();

		Alert alertConf = driver.switchTo().alert();

		if (alertConf.getText().equals("Do you confirm action?")) {
			System.out.println("The test passed");
		} else {
			System.out.println("The test failed");
		}

		Thread.sleep(2000);

		alertConf.accept();

		Thread.sleep(2000);

		driver.findElement(By.id("promtButton")).click();

		Thread.sleep(2000);

		Alert alertEnt = driver.switchTo().alert();

		alertEnt.sendKeys("Alban");

		Thread.sleep(2000);

		alertEnt.accept();

		Thread.sleep(2000);

		tearDown();

	}

}
