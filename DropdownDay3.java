package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		WebElement staticdropdown = driver.findElement(By.cssSelector("select[id='fruits']"));
		Select fruits = new Select(staticdropdown);
		fruits.selectByVisibleText("Apple");
		Select superheroes = new Select(driver.findElement(By.id("superheros")));
		if (superheroes.isMultiple()) {
			superheroes.selectByIndex(0);
			superheroes.selectByIndex(1);
		}

		else
			System.out.println("multiple selection not allowed");

		Select dropDown = new Select(driver.findElement(By.id("lang")));
		List<WebElement> elementCount = dropDown.getOptions();
		int itemSize = elementCount.size();
		for (int i = 0; i < itemSize; i++) {
			String optionsValue = elementCount.get(i).getText();
			System.out.println(optionsValue);
		}

		dropDown.selectByIndex(itemSize - 1);

		Select dropDown1 = new Select(driver.findElement(By.id("country")));
		dropDown1.selectByValue("India");

	}

}
