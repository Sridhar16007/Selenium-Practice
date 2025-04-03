package com.exmple.Selenium_Demo_ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		
		WebElement fruits=driver.findElement(By.id("fruits"));
		Select myFruits=new Select(fruits);
		myFruits.selectByVisibleText("Apple");
		
		WebElement country=driver.findElement(By.id("country"));
		Select myCountry=new Select(country);
		myCountry.selectByValue("India");
		WebElement selectedCountry=myCountry.getFirstSelectedOption();
		System.out.println(selectedCountry.getText());
		
		//selecting multiple options
		WebElement heros=driver.findElement(By.id("superheros"));
		Select myHeors=new Select(heros);
		System.out.println("is multiple ? "+myHeors.isMultiple());
		myHeors.selectByIndex(1);
		myHeors.selectByVisibleText("Batman");
		List<WebElement> allOptions=myHeors.getAllSelectedOptions();
		for(WebElement all:allOptions) {
			System.out.println(all.getText());
		}
		
	}

}
