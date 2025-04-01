package com.exmple.Selenium_Demo_ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {

		WebDriver driver;
		driver=new ChromeDriver();

		driver.get("https://practice.expandtesting.com/context-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		WebElement target=driver.findElement(By.xpath("//div[@id='hot-spot']"));

		Actions builder=new Actions(driver);
		builder.contextClick(target).perform();

		//driver.switchTo().alert().accept();

	}

}
