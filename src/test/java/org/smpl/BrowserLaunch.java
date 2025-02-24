package org.smpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws IOException {

		File file = new File(
				"C:\\Users\\Windows\\eclipse-workspace\\SampleMavenJan6\\src\\test\\resources\\Test_Data\\jan8_testdata.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(stream);
		XSSFSheet createSheet = book.createSheet("iphoneName_1");
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearchBox.sendKeys("iphone", Keys.ENTER);
		List<WebElement> allPhone = driver
				.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));

		// By iteration we get each webelement, from that we get the name

		for (int i = 0; i < allPhone.size(); i++) {
			String name = allPhone.get(i).getText();
			XSSFRow createRow = createSheet.createRow(i);
			XSSFCell createCell = createRow.createCell(0);
			createCell.setCellValue(name);
		}

		FileOutputStream st = new FileOutputStream(file);
		book.write(st);
		
		System.out.println("Done!!!");
	}
}
