package com.neotech.lesson09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Homework extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * ================== Lesson 09 HW 1 ======================= TC: Update Customer
		 * Information
		 * 
		 * 1) Open chrome browser 2) Go to
		 * "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		 * 3) Login to the application 4) Verify customer "Susan McLaren" is present in
		 * the table 5) Click on customer details 6) Update customers last name and
		 * credit card info 7) Verify updated customers name and credit card number is
		 * displayed in table 8) Close browser
		 */

		setUp();

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		Thread.sleep(2000);

		WebElement Susan = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[2]"));

		System.out.println(Susan.getText());

		if (Susan.isDisplayed()) {
			System.out.println(Susan.getText() + ": is present in the table.");

		} else {
			System.out.println(Susan.getText() + ": is NOT present in the table.");
		}

		driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[13]/input")).click();

		Thread.sleep(2000);

		WebElement update = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));

		update.clear();

		Thread.sleep(2000);

		update.sendKeys("Susan Lutaj");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='American Express']")).click();

		Thread.sleep(2000);

		WebElement update1 = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));

		update1.clear();

		Thread.sleep(2000);

		update1.sendKeys("129005159951");

		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();

		Thread.sleep(2000);

		System.out.println(
				"---------------------------------------------------------------------------------------------");

		WebElement Lutaj = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[2]"));

		System.out.println(Lutaj.getText());

		if (Lutaj.isDisplayed()) {
			System.out.println(Lutaj.getText() + ": is married with Alban.");

		} else {
			System.out.println(Lutaj.getText() + ": is NOT married with Alban.");
		}

		Thread.sleep(2000);

		System.out.println(
				"---------------------------------------------------------------------------------------------");

		WebElement card = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[10]"));

		System.out.println(card.getText());

		if (card.isDisplayed()) {
			System.out.println("The card is " + card.getText());

		} else {
			System.out.println("The card is NOT American Express");
		}

		Thread.sleep(2000);

		System.out.println(
				"---------------------------------------------------------------------------------------------");

		WebElement serialNum = driver
				.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[11]"));

		System.out.println(serialNum.getText());

		if (serialNum.isDisplayed()) {
			System.out.println("The card is " + card.getText() + " and is serial number is: " + serialNum.getText());

		} else {
			System.out.println("The card is NOT American Express");
		}

		Thread.sleep(2000);

		tearDown();

	}

}
