package com.seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo {

	
	@Test
	public void actionTest()
	{
		WebDriver driver= new ChromeDriver();
		
		Actions act= new Actions(driver);
		
		
		
	}
}
