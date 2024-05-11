package com.seleniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListUsage {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/tables");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		List<String> listOfLastNames= new ArrayList<>();
		for(WebElement row:rows)
		{
			listOfLastNames.add(row.findElement(By.xpath("td")).getText());
		}
		System.out.println(listOfLastNames);
		

		
		
		
	}

}
