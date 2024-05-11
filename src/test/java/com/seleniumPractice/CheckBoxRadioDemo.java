package com.seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxRadioDemo {

	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");

		// for scrolling down the page
		WebElement ho = driver.findElement(By.xpath("//td[text()='HOBBIES ']"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// jse.executeScript("window.scrollBy(0,700)");
		jse.executeScript("arguments[0].scrollIntoView(true)", ho);

	}

	@Test(priority=1)

	public void checkBoxFunctionality_TC001() throws InterruptedException {

		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@name='Hobby' and @type='checkbox']"));
		

		for (int i = 0; i < checkBoxes.size(); i++) {
			WebElement ele = checkBoxes.get(i);
			String hobbies = ele.getAttribute("value");
			if (hobbies.contains("Sketching")) {
				ele.click();
				Thread.sleep(2000);
			  break;
			}
		}

	}

	@Test(priority=0)
	public void selectRadioBtn() {

		WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@value='Female']"));
		femaleRadioBtn.click();

	}

	@Test(priority=3)
	public void dropDownFunc() {

		WebElement bDay=driver.findElement(By.xpath("//select[@id='Birthday_Day']"));
		WebElement bMonth=driver.findElement(By.xpath("//select[@id='Birthday_Month']"));
		WebElement bYear= driver.findElement(By.xpath("//select[@id='Birthday_Year']"));
		
		Select selDay= new Select(bDay);
		Select selMonth= new Select(bMonth);
		Select selYear= new Select(bYear);
		
		selDay.selectByValue("15");
		selMonth.selectByIndex(6);
		selYear.selectByVisibleText("2000");
		
	}

//	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
