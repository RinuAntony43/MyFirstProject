package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDriverExample {

	public static void main(String[] args) {
	
		//Invoking Chrome Browser 
		
	   //chrome- ChromeDriver
		
	// create a new object 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	    driver.quit(); 
	} 

}
