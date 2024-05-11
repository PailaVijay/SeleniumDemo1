package singletonDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingletonLazyInitialization {

	private WebDriver driver;
	private static SingletonLazyInitialization INSTANCE;
	
	private SingletonLazyInitialization()
	{
		
	}
	
	public static SingletonLazyInitialization getInstance()
	{
		if(INSTANCE==null)
		{
			INSTANCE= new SingletonLazyInitialization();
		}
		return INSTANCE;
	}
	
	public void setDriver(String browser)
	{
		switch(browser.toLowerCase())
		{
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
			
		default : 
			throw new IllegalArgumentException("invalid browser");
		}
	}
	
	public WebDriver getDriver()
	{
		return driver;
		
	}

}
