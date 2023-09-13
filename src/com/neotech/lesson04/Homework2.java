package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static String url = "https://demoqa.com/radio-button";

	public static void main(String[] args) throws InterruptedException {

		// Radio Button Practice
		// Open chrome browser
		// Go to "https://demoqa.com/radio-button"
		// Verify if all radio buttons are displayed and clickable
		// Click on all radio buttons
		// Verify radio buttons has been clicked successfully
		// Quit browser

		System.setProperty("webdriver.chrome.drivers", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		List<WebElement> bottons = driver.findElements(By.cssSelector(".custom-control-label"));

		WebElement yes = driver.findElement(By.xpath("//label[@for='yesRadio']"));

		if (yes.isDisplayed()) {
			System.out.println("Button " + yes.getText() + " is displayed");
			if (yes.isEnabled()) {
				yes.click();
				System.out.println(yes.getText() + " is clikable");
			} else {
				System.out.println(yes.getText() + " is NOT clikable!");
			}

		} else {
			System.out.println(yes.getText() + " is NOT displayed");
		}

		Thread.sleep(2000);

		WebElement impressive = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));

		if (impressive.isDisplayed()) {
			System.out.println("Button " + impressive.getText() + " is displayed");
			if (impressive.isEnabled()) {
				impressive.click();
				System.out.println(impressive.getText() + " is clikable");
			} else {
				System.out.println(impressive.getText() + " is NOT clikable!");
			}

		} else {
			System.out.println(impressive.getText() + " is NOT displayed");
		}

		Thread.sleep(2000);

		WebElement no = driver.findElement(By.xpath("//label[@for='noRadio']"));

		if (no.isDisplayed()) {
			System.out.println("Button " + no.getText() + " is displayed");
			if (no.isSelected()) {
				no.click();
				System.out.println(no.getText() + " is clikable");
			} else {
				System.out.println(no.getText() + " is NOT clikable!");
			}

		} else {
			System.out.println(no.getText() + " is NOT displayed");
		}

		Thread.sleep(2000);

		driver.quit();

	}

}
