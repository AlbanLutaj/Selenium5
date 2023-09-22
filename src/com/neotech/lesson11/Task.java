package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Task extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * * Facebook dropdown verification Open chrome browser Go to
		 * https://www.facebook.com/r.php Verify: month dd has 12 month options day dd
		 * has 31 day options year dd has 118 year options Select your date of birth
		 * Quit browser
		 */

		setUp();

		WebElement day = driver.findElement(By.id("day"));

		selectDropdown(day, "12");

		wait(2);

		WebElement month = driver.findElement(By.id("month"));

		selectDropdown(month, 4);

		wait(2);

		WebElement year = driver.findElement(By.id("year"));

		selectDropdown(year, "1990");

		wait(2);

		tearDown();

	}

}
