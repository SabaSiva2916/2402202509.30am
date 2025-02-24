package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	// WebDriver driver; // Default access specifer --> We can access only within
	// the package

	public static WebDriver driver; // We can access all over the package
	// 1- Launch Browser
//
	public void getDriver() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	// 2- Launch URL
	public void launchURL(String url) {
		driver.get(url);

	}

	// 3 - enterText value by using Sendkeys
	public void enterTextValue(WebElement ele, String data) {
		ele.sendKeys(data);

	}

	// getData from Excel
	public String getDataFromExcel(String sheetName, int rowNo, int cellNo) throws IOException {

		File file = new File(
				"C:\\Users\\Windows\\eclipse-workspace\\SampleMavenJan6\\src\\test\\resources\\Test_Data\\jan8_testdata.xlsx");
		FileInputStream st = new FileInputStream(file);
		XSSFWorkbook bok = new XSSFWorkbook(st);
		XSSFSheet sheet = bok.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rowNo);
		XSSFCell cell = row.getCell(cellNo);
		DataFormatter form = new DataFormatter();
		String formatCellValue = form.formatCellValue(cell);
		bok.close();
		return formatCellValue;
	}
	
	
	//JavaScript--
//	public void enterTextByUsingJS(WebElement ele, String data) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	  	js.executeScript("arguments[0].setAtribute('value','"+data+"')", ele);
//
//	}

}
