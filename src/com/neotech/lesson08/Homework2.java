package com.neotech.lesson08;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Homework 3: Add Employee Open chrome browser Go to
		 * "https://hrm.neotechacademy.com/" Login into the application Click on PIM >
		 * Add Employee Add Employee Log out Quit the browser
		 */

		setUp();

		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));

		Thread.sleep(2000);

		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='PIM']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Add Employee']")).click();

		Thread.sleep(2000);

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);

		wait.withTimeout(Duration.ofSeconds(20));

		wait.ignoring(NoSuchElementException.class);

		wait.pollingEvery(Duration.ofSeconds(1));

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator/div/div[1]/div")));

		WebElement addName = driver.findElement(By.id("first-name-box"));

		addName.sendKeys("Alban");

		Thread.sleep(2000);

		WebElement addMidlleName = driver.findElement(By.xpath("//*[@id=\"middle-name-box\"]"));

		addMidlleName.sendKeys("Shqipe");

		Thread.sleep(2000);

		WebElement addLastName = driver.findElement(By.id("last-name-box"));

		addLastName.sendKeys("Lutaj");

		Thread.sleep(2000);

		WebElement employeeID = driver.findElement(By.xpath("//*[@id=\"employeeId\"]"));

		employeeID.clear();

		Thread.sleep(2000);

		employeeID.sendKeys("0000");

		Thread.sleep(2000);

		WebElement select = driver.findElement(By.id("location"));

		Thread.sleep(2000);

		Select state = new Select(select);

		state.selectByVisibleText("New York Sales Office");

		Thread.sleep(2000);

		driver.findElement(By.id("modal-save-button")).click();

		Thread.sleep(2000);
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pimPersonalDetailsForm")));
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]")));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//i[text()='keyboard_arrow_down']")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[text()='keyboard_arrow_down']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();

		Thread.sleep(4000);

		tearDown();
		
	}

}
