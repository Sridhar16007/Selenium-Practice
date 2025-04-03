package com.exmple.Selenium_Demo_ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver=new ChromeDriver();
		//driver.get("https://letcode.in/edit");
		
		//isDisplayed-to check if the element is displayed or rendered
		
//		boolean displayed=driver.findElement(By.tagName("h1")).isDisplayed();
//		System.out.println("Header is displayed : "+displayed);

		//isEnabled - to check if an element is interactable
		
//		boolean editable=driver.findElement(By.id("noEdit")).isEnabled();
//		System.out.println("editable : "+editable);
		
		//isSelected mostly used for radio box or check boxes
		driver.get("https://letcode.in/radio");
		boolean selected=driver.findElement(By.xpath("//label[text()=' Remember me ']//input")).isSelected();
		System.out.println("Selected : "+selected);
		
		driver.quit();
	}

}
