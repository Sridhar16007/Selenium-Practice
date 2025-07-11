package com.exmple.Selenium_Demo_ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		driver.get("https://letcode.in/waits");
		
		driver.findElement(By.id("accept")).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30L));
		Alert until= wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(until.getText());
		until.accept();
		//driver.switchTo().alert().accept();
		//if we run this we will get noSuchElement, coz of the delay in alert pop up
		
		//invisibility of an element
		
	}

}
