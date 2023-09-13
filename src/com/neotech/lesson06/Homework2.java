package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Homework 3: Open chrome browser Go to
		 * "https://semantic-ui.com/modules/dropdown.html" Scroll down to
		 * "Multiple Selection" Click on drop down and select "CSS" and "HTML" Verify
		 * value has been selected Deselect 1 of the options from the dropdown Quit
		 * browser
		 */

		setUp();

		driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple']")).click();

		Thread.sleep(2000);

		WebElement css = driver.findElement(By.xpath("//div[@class='menu transition visible']/div[2]"));

		css.click();

		Thread.sleep(2000);

		WebElement html = driver.findElement(By.xpath("//div[@class='menu transition visible']/div[5]"));

		html.click();

		Thread.sleep(2000);

		if (css.getAttribute("data-value").equals("css")) {
			System.out.println("Test Passed: Css is selected");
		} else {
			System.out.println("Test Failed");
		}

		Thread.sleep(2000);

		if (html.getAttribute("data-value").equals("html")) {
			System.out.println("Test Passed: Html is selected");
		} else {
			System.out.println("Test Failed");
		}

		Thread.sleep(2000);

		WebElement deselectHtml = driver.findElement(By.xpath("//a[@data-value='css']"));

		deselectHtml.click();

		Thread.sleep(4000);

		if (deselectHtml.getAttribute("data-value").equals("html")) {
			System.out.println("Test Failed");
		} else {
			System.out.println("Test passed: Html is deselected");
		}

		Thread.sleep(2000);

		tearDown();

	}

}
