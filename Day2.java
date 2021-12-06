package com.practice.daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  //setting path of chrome river in local machine
				System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");
				//creating new chrome driver 
			    WebDriver driver =new ChromeDriver();
			    driver.get("https://itera-qa.azurewebsites.net/home/automation");
			    
			    driver.findElement(By.id("male")).click();
			    driver.findElement(By.id("monday")).click();
			    Thread.sleep(2000L);
			    
	}

}

