package com.practice.daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Selenium script to fill a form on webpage

public class Day1 {
	
	public static void main(String args[])
	
	{   //setting path of chrome driver in local machine
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");
		//creating new chrome driver 
	    WebDriver driver =new ChromeDriver();
	    //launching chrome with given url
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		//inserting data into form
    //in this form we are identifying element by using id 
		driver.findElement(By.id("name")).sendKeys("Naman Srivastav");
		driver.findElement(By.id("phone")).sendKeys("9161057887");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("478544888");
		driver.findElement(By.id("address")).sendKeys("Varanasi UP");
		//submitting the data by clicking submit button
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.close();
	}

}
