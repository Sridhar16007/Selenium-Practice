package com.exmple.Selenium_Demo_ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		
		String windowhandle=driver.getWindowHandle();
		System.out.println("String windowHandle : "+windowhandle);
		
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles);
		System.out.println(driver.getCurrentUrl());
		
		//even after opening another window the url will be in the same page, to switch to another window
		List<String> listOfWindows=new ArrayList<String>(windowHandles);
		driver.switchTo().window(listOfWindows.get(1));
		System.out.println(driver.getCurrentUrl());
		
		//to close the parent window and print the current url
		driver.switchTo().window(listOfWindows.get(0)).close();
		Set<String> windowHandles2=driver.getWindowHandles();
		listOfWindows.clear();
		listOfWindows.addAll(windowHandles2);
		driver.switchTo().window(listOfWindows.get(0));
		
		System.out.println(driver.getCurrentUrl());
		
	}
	
}
