package com.neotech.lesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * ================= Lesson 09 HW 2 ================================= TC: Delete
		 * Orders
		 * 
		 * 1) Open chrome browser 2) Go to
		 * "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		 * 3) Login to the application 4) Click on the checkbox of all orders with
		 * product FamilyAlbum 5) Delete Selected orders 6) Verify the orders have been
		 * deleted 7) Quit the browser
		 */

		setUp();

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());

			if (list.get(i).getText().contains("FamilyAlbum")) {
				int j = i + 1;
				WebElement select = driver
						.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + j + "]/td/input"));
				select.click();
				Thread.sleep(3000);
			}
		}

		driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

		Thread.sleep(2000);
		
		System.out.println("-------------------------------------------------------------------------------------------------");

		WebElement deselect = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr"));

		if (!deselect.getText().contains("FamilyAlbum")) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}

		Thread.sleep(2000);

		tearDown();
	}

}
