package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.findElement(By.id("fullName")).sendKeys("Prakhar Srivastava");
		driver.findElement(By.id("join")).sendKeys(" what about you");
		driver.findElement(By.id("join")).sendKeys(Keys.TAB);
		driver.findElement(By.id("getMe")).getText();
		driver.findElement(By.id("clearMe")).clear();
		System.out.println(driver.findElement(By.id("noEdit")).isEnabled());
    // to get particular attribute
		String state = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		if (state.contains("true")) {
			System.out.println("readonly");
		} else {
			System.out.println("not readonly");
		}

	}

}
