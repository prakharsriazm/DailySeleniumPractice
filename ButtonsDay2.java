package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.findElement(By.id("home")).click();
		// this line will navigate back to the page
		driver.navigate().back();
		// this will return dimension of the element
		System.out.println(driver.findElement(By.id("property")).getSize());
		//background color value 
		String buttonColor = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(buttonColor);
		//this will check whether the button is enabled or not
		boolean isEnabled = driver.findElement(By.id("isDisabled")).isEnabled();
		if (isEnabled) {
			System.out.println("Button is enabled");

		} else
			System.out.println("Button is disabled");
         
		WebElement button = driver
				.findElement(By.xpath("//div[@class='card-content']/div[6]//button[@id='isDisabled']"));
		// you need to create action class to perform clik and hold operation on the element
		// Create an object of actions class and pass reference of WebDriver as a
		// parameter to its constructor.

		Actions actions = new Actions(driver);
		actions.moveToElement(button);
		actions.clickAndHold().perform();
	}

}
