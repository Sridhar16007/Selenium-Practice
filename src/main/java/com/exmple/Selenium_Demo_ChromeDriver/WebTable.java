package com.exmple.Selenium_Demo_ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		WebDriver driver;
		driver=new ChromeDriver();

		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));

		WebElement table=driver.findElement(By.id("simpletable"));
		List<WebElement> headers=table.findElements(By.tagName("th"));
		for(WebElement header:headers) {
			System.out.println(header.getText());
		}
		
		List<WebElement> allRows=table.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
		System.out.println("No.of rows : "+allRows.size());
		
		//print the values present in first column
//		for(WebElement row: allRows) {
//			List<WebElement> columns=row.findElements(By.tagName("td"));
//			WebElement firstColumn=columns.get(0);
//			System.out.println("First column values"+"\n"+firstColumn.getText());
//		}
		
		for(WebElement row: allRows) {
			List<WebElement> columns=row.findElements(By.tagName("td"));
			WebElement secondColumn=columns.get(1);
			if(secondColumn.getText().equalsIgnoreCase("raj")) {
				columns.get(3).findElement(By.tagName("input")).click();
				break;
			}
		}
		
		//driver.quit();
	}

}
