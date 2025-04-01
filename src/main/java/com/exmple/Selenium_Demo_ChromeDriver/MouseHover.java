package com.exmple.Selenium_Demo_ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		WebElement element=driver.findElement(By.xpath("//span[@class='_1XjE3T']/child::span[starts-with(text(),'Fashion')]"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(element).perform();

	}

}
