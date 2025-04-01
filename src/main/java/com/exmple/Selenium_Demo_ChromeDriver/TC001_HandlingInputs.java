package com.exmple.Selenium_Demo_ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_HandlingInputs {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.findElement(By.id("fullName")).sendKeys("Sridhar");
		driver.findElement(By.id("join")).sendKeys("boy",Keys.TAB);
		String value=driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println("Value is : "+value);
		
		//Clear text 
		driver.findElement(By.id("clearMe")).clear();
		
		//Check whether able to text or not
		boolean editable=driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println("Editable: "+editable);
		
		//confirm text is read only
		String isReadOnly=driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(isReadOnly);
		
		//close the browser
		driver.quit();
		
	}

}
