package testNG.us.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testNG.us.baspage.super_class;

public class waitHelper extends super_class{
	
	public static void seleniumWait(WebElement ele,long time) {
		WebDriverWait wait = new WebDriverWait(driver,time); // Explecit wait will work except list of webeElement
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
}
