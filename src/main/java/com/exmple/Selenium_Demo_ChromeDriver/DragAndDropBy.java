package com.exmple.Selenium_Demo_ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		int x=source.getLocation().getX();
		int y=source.getLocation().getY();
		
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(source, x+50, y+90).perform();
		
	}

}
