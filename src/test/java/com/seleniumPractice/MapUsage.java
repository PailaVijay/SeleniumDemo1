package com.seleniumPractice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MapUsage {

	public static void main(String[] args) {
		
		Map<String,Integer> map= new HashMap<String,Integer>();
		
		map.put("Rohit", 343);
		map.put("vitart", 210);
		map.put("surya", 202);
		map.put("hardhik", 232);
		map.put("sanju", 124);
		map.put("rahul", 145);
		
		//System.out.println(map);
		// For Iteration 
		
		 Iterator<Entry<String,Integer>> ite=map.entrySet().iterator();
		 
		 while(ite.hasNext())
		 {
			 ite.next();
		 }
//		for( Map.Entry<String, Integer> entry:map.entrySet())
//		{
//		System.out.println(entry.getKey()+"  : "+entry.getValue());	
//		}
		
//		for(String key:map.keySet())
//		{
//			System.out.println("key is : "+key);
//			System.out.println("value is : "+map.get(key));
//		}
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/tables");
		
		List<WebElement> elements=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		Map<String,String> lastNameEmailData=new TreeMap<String,String>();
		
		for(WebElement ele:elements)
		{
			String lastName=ele.findElement(By.xpath("td[1]")).getText();
			String email=ele.findElement(By.xpath("td[3]")).getText();
			lastNameEmailData.put(lastName, email);
		}
		System.out.println(lastNameEmailData);
		

		

	}

}
