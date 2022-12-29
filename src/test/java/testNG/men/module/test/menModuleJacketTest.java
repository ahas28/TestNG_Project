package testNG.men.module.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testNG.us.baspage.super_class;
import testNG.us.generic.commonUtilities;
import testNG.us.generic.waitHelper;
import testNG.us.pageFactory.pageFactory;

public class menModuleJacketTest extends super_class{
	
	pageFactory pf;
	
	public menModuleJacketTest() {
		super();
	}

	@BeforeMethod
	public void startUP() {
		pf = new pageFactory();
		Broswer_initializations();
		
	}
	
	@Test
	public void getMyLogin() {
		pf = new pageFactory();
		pf.getLogin();
		
		    waitHelper.seleniumWait(pf.getMenModule(), 30);
		    commonUtilities.getMouseHoverAction(pf.getMenModule());
		    commonUtilities.takeScreenshotAtEndOfTest();
		   
		    waitHelper.seleniumWait(pf.getSelectMenTops(), 30);
		    commonUtilities.getMouseHoverAction(pf.getSelectMenTops());
			
		    waitHelper.seleniumWait(pf.getSelectMenJackets(), 30);
		 // CommonUtilities.getActionClick(pf.getSelectMenJackets());
		    commonUtilities.getJSEClick(pf.getSelectMenJackets());
		   
		    waitHelper.seleniumWait(pf.getSelectMenJacketsAWT(), 30);
		    commonUtilities.getJSEClick(pf.getSelectMenJacketsAWT());
		   
		    waitHelper.seleniumWait(pf.getSelectMenJacketsSize(), 30);
			commonUtilities.getJSEClick(pf.getSelectMenJacketsSize());
			
			waitHelper.seleniumWait(pf.getSelectMenJacketsColor(), 30);
			commonUtilities.getJSEClick(pf.getSelectMenJacketsColor());
			commonUtilities.takeScreenshotAtEndOfTest();
			
			waitHelper.seleniumWait(pf.getSelectMenJacketsQuantity(), 30);
			pf.getSelectMenJacketsQuantity().clear();
			pf.getSelectMenJacketsQuantity().sendKeys("1");
			
			waitHelper.seleniumWait(pf.getSelectMenJacketsADDCart(), 30);
			commonUtilities.getActionClick(pf.getSelectMenJacketsADDCart());
			
			waitHelper.seleniumWait(pf.getSelectMenJacketsShoppingCart(), 30);
			commonUtilities.getActionClick(pf.getSelectMenJacketsShoppingCart());
		   
			waitHelper.seleniumWait(pf.getSelectMenJacketsProceed2Checkout(), 30);
			commonUtilities.getJSEClick(pf.getSelectMenJacketsProceed2Checkout());
			
			waitHelper.seleniumWait(pf.getSelectNewAddress(), 30);
			commonUtilities.getJSEClick(pf.getSelectNewAddress());
			
			pf.AllShippingDetails();
			
			
			waitHelper.seleniumWait(pf.getSelectShippingAddress(), 30);
			commonUtilities.getJSEClick(pf.getSelectShippingAddress());
			commonUtilities.takeScreenshotAtEndOfTest();
	}
	
		
		
	
	
	@AfterMethod
	public void tearDown() {
	//	driver.quit();
	}
	
}
