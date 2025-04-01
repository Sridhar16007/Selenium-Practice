package com.exmple.Selenium_Demo_ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigationCommands {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("http://localhost:8080/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		driver.findElement(By.id("viewoption")).click();
		
		//get the current page url
		System.out.println("View Book page url: "+driver.getCurrentUrl());
		Thread.sleep(5000);
		
		//going back
		driver.navigate().back();
		Thread.sleep(5000);
		
		//going forward
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		driver.navigate().to("http://localhost:8080/addbook?");
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
