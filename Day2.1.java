package com.practice.daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting path of chrome river in local machine
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");
		//creating new chrome driver 
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://itera-qa.azurewebsites.net/home/automation");
	    WebElement staticDropdown=driver.findElement(By.xpath("//select[@class='custom-select']"));
	    Select dropdown = new Select(staticDropdown);
	    dropdown.selectByIndex(3);
	    
	    
	    
	}

}
