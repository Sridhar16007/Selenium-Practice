package com.exmple.Selenium_Demo_ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) {

		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		
		//get text
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println("Text value : "+text);
		
		//get attribute
		String attributeValue=driver.findElement(By.id("fullName")).getAttribute("placeholder");
		System.out.println("Attribute value : "+attributeValue);
		
		driver.quit();
	}

}
