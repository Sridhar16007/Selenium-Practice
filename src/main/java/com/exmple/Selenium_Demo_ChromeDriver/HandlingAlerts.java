package com.exmple.Selenium_Demo_ChromeDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		
		//Accepting
		
		driver.findElement(By.id("accept")).click();
		Alert alert=driver.switchTo().alert();
		String alertMsg=alert.getText();
		System.out.println("Alert msg is : "+alertMsg);
		alert.accept();
		//If we want to reject
		//alert.dismiss();
		
		//prompt alerts
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("Sri");
		String promptmsg=alert.getText();
		System.out.println("Text shown in the prompt: "+promptmsg);
		alert.accept();
		String text=driver.findElement(By.id("myName")).getText();
		System.out.println("Text given to the prompt is :"+text);
		
		driver.quit();

	}

}
