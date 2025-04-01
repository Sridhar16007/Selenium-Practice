package com.exmple.Selenium_Demo_ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		File screenshot=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/screenshot.png");
		org.openqa.selenium.io.FileHandler.copy(screenshot, destination);
		
		//screenshot of a particular element
		
		WebElement ele=driver.findElement(By.id("openwindow"));
		File screenshotOfEle= ele.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/Elementscreenshot.png");
		org.openqa.selenium.io.FileHandler.copy(screenshotOfEle, dest);
		
		//if we want, we can take ss of a particular part of the webpage by targeting that particular div
		
		driver.quit();

	}

}
