package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Homework 1: Amazon Department List Verification Open chrome browser Go to
		 * "http://amazon.com/" Verify how many department options available. Print each
		 * department Select Computers Quit browser
		 */

		setUp();

		Thread.sleep(1000);

		Select search = new Select(driver.findElement(By.id("searchDropdownBox")));

		List<WebElement> list = search.getOptions();

		System.out.println("The aviable department are: " + list.size());

		Thread.sleep(2000);
		
		System.out.println("--------------------------------------------------------");

		for (WebElement dropAll : list) {
			System.out.println(dropAll.getText());
		}

		Thread.sleep(2000);

		search.selectByVisibleText("Computers");

		Thread.sleep(2000);

		tearDown();

	}

}
