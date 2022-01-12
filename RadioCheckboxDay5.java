package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckboxDay5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.findElement(By.id("yes")).click();
		// to check whether the check box is bug free or not 
		driver.findElement(By.id("nobug")).click();
		boolean nobug = driver.findElement(By.id("nobug")).isSelected();
		driver.findElement(By.id("bug")).click();
		
		boolean bug = driver.findElement(By.id("bug")).isSelected();
		if (bug && nobug) {
			System.out.println("there is a bug");
		}
		boolean foo = driver.findElement(By.id("foo")).isSelected();
		boolean bar = driver.findElement(By.id("notfoo")).isSelected();

		if (foo) {
			System.out.println("foo is selected");
		}

		else if (bar) {
			System.out.println("bar is selected");

		}

		else {
			System.out.println("nothing selected");
		}

		System.out.println(driver.findElement(By.id("maybe")).isEnabled());

		System.out.println(driver.findElement(By.xpath("//label [text()=' Remember me ']")).isSelected());

	}
}
