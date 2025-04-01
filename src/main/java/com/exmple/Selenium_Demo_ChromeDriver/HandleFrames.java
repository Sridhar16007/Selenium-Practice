package com.exmple.Selenium_Demo_ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
	
	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		
		driver.switchTo().frame(1);
		driver.findElement(By.name("fname")).sendKeys("Sridhar");
		driver.findElement(By.name("lname")).sendKeys("K");
		
		//index is 0 bcoz this frame inside of the frame already
		driver.switchTo().frame(1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		driver.findElement(By.name("email")).sendKeys("email");
		
		driver.close();
	}

}
