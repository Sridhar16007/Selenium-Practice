package com.exmple.Selenium_Demo_ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtons {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Get the X & Y Co-ordinates
		WebElement element=driver.findElement(By.id("openwindow"));
		Point point=element.getLocation();
		int x=point.getX();
		int y=point.getY();
		System.out.println("X : "+x+" Y : "+y);
		
		//color of the  button
		WebElement buttonColor=driver.findElement(By.id("openwindow"));
		String color=buttonColor.getCssValue("background-color");
		System.out.println("Button color is : "+color);
		
		//height and width of the button
		Rectangle rect=driver.findElement(By.id("openwindow")).getRect();
		Dimension dim=rect.getDimension();
		System.out.println("Height : "+dim.getHeight());
		System.out.println("Width : "+dim.getWidth());
		
		driver.quit();
	}

}
