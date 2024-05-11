package com.seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotFunctionality {

	public static void main(String[] args) throws IOException {

     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
   //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
     
     TakesScreenshot screenshot= (TakesScreenshot)driver;
     
     File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
     
     FileUtils.copyFile(srcFile, new File("C:\\Users\\Vijay\\eclipse-workspace\\Selenium1\\Sceenshot\\screenshot.png"));
     

     
	}

}
