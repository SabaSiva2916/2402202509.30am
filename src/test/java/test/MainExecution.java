package test;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.BaseClass;

public class MainExecution extends BaseClass{
	// BeforeClass && AfterClass ---> Methods need to public static
	

	@BeforeClass
	public static void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}
 
	@Test
	public void tc03() throws IOException {
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys(getDataFromExcel("Sheet1", 1, 0));

		String userName = txtUserName.getAttribute("value");
		System.out.println(userName);
		Assert.assertEquals("Validating username filed", userName, getDataFromExcel("Sheet1", 1, 0));
		
	}

	@Test
	public void tc01() {
		System.out.println("Method 1");

	}

	@Ignore
	@Test
	public void tc04() {
		System.out.println("Method 4");

	}

	@Test
	public void tc02() {
		System.out.println("method 2");

	}
}
