package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * W_3 Overall Practice of WebElements and handling Windows, Alerts ======
		 * 
		 * 1) Launch the browser and open the site
		 * "https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm" 2)
		 * Fill in the all text boxes, Choose your preferred radio button, check box and
		 * drop down option EXCEPT Profile Picture (Dissmiss this Section) 3) Click on
		 * the Button and you will see an Alert pops up then click Ok 4) When user
		 * clicks on Ok new Window will open then get All window handles and get the
		 * size and Quit all of them
		 */

		setUp();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("alban");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lutaj");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Male']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='5']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/div/form/div/table/tbody/tr[5]/td[2]/input"))
				.sendKeys("2015-2020");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();

		Thread.sleep(2000);

		WebElement continents = driver.findElement(By.xpath("//select[@name='continents']"));

		Thread.sleep(2000);

		Select con = new Select(continents);

		con.selectByVisibleText("Europe");

		Thread.sleep(2000);

		WebElement commands = driver.findElement(By.xpath("//select[@name='selenium_commands']"));

		Thread.sleep(2000);

		Select selenium = new Select(commands);

		selenium.selectByVisibleText("WebElement Commands");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submit']")).click();

		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		Thread.sleep(2000);
		
		Set<String> allWind = driver.getWindowHandles();
		
		Thread.sleep(2000);
		
		System.out.println("The size is: " + allWind.size());
		
		Thread.sleep(2000);
		
		Iterator<String> handles = allWind.iterator();
		
		String window1 = handles.next();
		String window2 =handles.next();
		
		System.out.println(window1);
		System.out.println(window2);
		
		Thread.sleep(2000);

		tearDown();
	}

}
