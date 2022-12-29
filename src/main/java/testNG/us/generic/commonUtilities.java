package testNG.us.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import testNG.us.baspage.super_class;

public class commonUtilities extends super_class{
	
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	public static String TESTDATA_SHEET_PATH = "C:\\Users\\Abul Hashem\\eclipse-workspace\\tesNG_Framework_Project\\testData";

	static Workbook book;
	static Sheet sheet;

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}

	public static void takeScreenshotAtEndOfTest()  {
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("user.dir");
			FileUtils.copyFile(scrFile, new File(currentDir + "/Screenshots/" + System.currentTimeMillis() + ".png"));
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	//by creating a method and passing webelement interface and obj 
	//and calling actions class from selnium with obj = new keyword and action class
	//passing driver in the parameter the call the click method with object
	//build and perform method i can use mouse to click on a web element.
	public static void getActionClick(WebElement ele) {
		Actions click = new Actions(driver);
		click.click(ele).build().perform();;
	}
	
	//by creating a method and passing string expected and actual inside the parameter
	//
	public static void getAssertText(String expected, String actual) {
		Assert.assertEquals(expected, actual);
		System.out.println("Verified Text" + " " +  " - " + actual );
	}
	
	public static void getJSEClick(WebElement elm) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", elm);
		
	}	
		public static void getSelectDropDownList(List<WebElement> ele, String text) {
			List<WebElement> option = ele;
			for (WebElement newValue : option) {
			if (newValue.getText().contains(text)) {
				newValue.click();
				
			}
		}
	}
	
	//by creating a method and passing webelement interface and obj 
	//and calling actions class from selnium with obj = new keyword and action class
	//passing driver in the parameter the call the move to element method with object
	//build and perform method i can use mouse to move to a web element.
	public static void getMouseHoverAction(WebElement elm) {
		Actions act = new Actions(driver);
		act.moveToElement(elm).build().perform();
	}
	
	//by creating a method and passing webelement interface and obj 
	//and calling actions class from selnium with obj = new keyword and action class
	//passing driver in the parameter the call the click method with object
	//build and perform method i can use mouse to click on a web element.
	public static void getMouseActionClick(WebElement elm) {
		Actions act = new Actions(driver);
		act.moveToElement(elm).click().build().perform();
	}
	
	public static void getMouseActionUp(WebElement elm){
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_UP).build().perform();;
	}	
	public static void getMouseActionDown() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	
	//By creating a static method and passing webelement with object and string obj inside 
	//the parameter and calling select class with obj from selenium with key word for instance of that 
	//class and elm inside the paramter then calling deselectbyvisibletext method and pass obj
	//inside the parameter i can use this function in my framework and call it anywhere
	//by calling current class name and method name.
	public static void getSelectValue(WebElement elm, String text) {
		Select slt = new Select(elm);
		slt.selectByVisibleText(text);
	}
	
	public static void getVerifyMyResults(String Expected, String Actual) {
		Assert.assertEquals(Expected, Actual);
				
		if (Expected.equals(Actual)){
		System.out.println("Expected and Actual Match");
		}else{
		System.out.println("Expected and Actual doesnt not Match");
		}
		
		}
		
		public static void getMyTitle(String Expected, String Actual) {
		Assert.assertEquals(Expected, Actual);
					
		if (Expected.equals(Actual)){
		System.out.println("Expected and Actual Match");
		}else{
		System.out.println("Expected and Actual doesnt not Match");
		}
		}
	    
		
}
