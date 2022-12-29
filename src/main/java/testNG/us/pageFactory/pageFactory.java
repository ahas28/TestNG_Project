package testNG.us.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.us.baspage.super_class;
import testNG.us.generic.commonUtilities;
import testNG.us.generic.waitHelper;

public class pageFactory extends super_class {
	
	//with help of constructor i create a special method, constructor invokes 
		//implicitly does not return any value
		//Then I call the pagefactor class from selenium and call initelements method
		//for all element inside my page factory class and pass driver instance and
		//this keyword for use elements in current class inside the parameter.

		public pageFactory() {
			PageFactory.initElements(driver, this);
		}
		//with @FindBy annotation by selenium i can locate elements by id, name, class
		//xpath based on the requirement.
		
		//@CacheLookup annotation from selenium when executing test cases 
		//it will remove unnecessary data to perform and execute my test cases/elements
		//faster
		
		//with help of private key word and can wrap my source code for security purposes
		//and use the function by using getter and setter method and finish within class.
		
		//this applies to all my locators/elements in this class.
		
		
		@FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
		@CacheLookup
		private WebElement clickSignInBTN;

		public WebElement GetClickSignInBTN() {
			return clickSignInBTN;

		}

		
		@FindBy(xpath = "//input[@id = 'email']")
		@CacheLookup
		private WebElement EnterEmail;

		public WebElement GetEnterEmail() {
			return EnterEmail;

		}

		
		@FindBy(xpath = "(//input[@id = 'pass'])[1]")
		@CacheLookup
		private WebElement EnterPassword;

		public WebElement GetEnterPassword() {
			return EnterPassword;

		}

		
		@FindBy(xpath = "(//span[contains(text(),'Sign In')])[1]")
		@CacheLookup
		private WebElement clickLogInBTN;

		public WebElement GetClickLogInBTN() {
			return clickLogInBTN;

		}
		
		@FindBy(xpath = "(//*[text()='Welcome, Smart Tech!'])[1]")
		@CacheLookup
		private WebElement LandingUItext;

		public WebElement getLandingUItext() {
			return LandingUItext;
			
		}

		@FindBy(xpath = "//*[@id=\"ui-id-5\"]/span[2]")
		@CacheLookup
		private WebElement menModule;

		public WebElement getMenModule() {
			return menModule;

		}
		
		@FindBy(xpath = "//*[@id=\"ui-id-17\"]/span[2]")
		@CacheLookup
		private WebElement SelectMenTops;

		public WebElement getSelectMenTops() {
			return SelectMenTops;

		}
		
		@FindBy(xpath = "//*[@id=\"ui-id-19\"]/span")
		@CacheLookup
		private WebElement SelectMenJackets;

		public WebElement getSelectMenJackets() {
			return SelectMenJackets;

		}
		
		@FindBy(xpath = "//*[@class='base']")
		@CacheLookup
		private WebElement SelectMenJacketsText;

		public WebElement getSelectMenJacketsText() {
			return SelectMenJacketsText;

		}
		
		@FindBy(xpath = "(//*[@class='product-image-photo'])[3]")
		@CacheLookup
		private WebElement SelectMenJacketsAWT;

		public WebElement getSelectMenJacketsAWT() {
			return SelectMenJacketsAWT;

		}
		
		@FindBy(xpath = "(//*[@class='swatch-option color'])[1]")
		@CacheLookup
		private WebElement SelectMenJacketsColor;

		public WebElement getSelectMenJacketsColor() {
			return SelectMenJacketsColor;

		}
		
		@FindBy(xpath = "(//*[@class='swatch-option text'])[3]")
		@CacheLookup
		private WebElement SelectMenJacketsSize;

		public WebElement getSelectMenJacketsSize() {
			return SelectMenJacketsSize;

		}
		
		@FindBy(xpath = "//*[@name='qty']")
		@CacheLookup
		private WebElement SelectMenJacketsQuantity;

		public WebElement getSelectMenJacketsQuantity() {
			return SelectMenJacketsQuantity;

		}
		
		
		@FindBy(xpath = "//*[text()='Add to Cart']")
		@CacheLookup
		private WebElement SelectMenJacketsADDCart;

		public WebElement getSelectMenJacketsADDCart() {
			return SelectMenJacketsADDCart;

		}
		
		@FindBy(xpath = "//*[text()='shopping cart']")
		@CacheLookup
		private WebElement SelectMenJacketsShoppingCart;

		public WebElement getSelectMenJacketsShoppingCart() {
			return SelectMenJacketsShoppingCart;

		}
		
		@FindBy(xpath = "//*[@class='action primary checkout']")
		@CacheLookup
		private WebElement SelectMenJacketsProceed2Checkout;

		public WebElement getSelectMenJacketsProceed2Checkout() {
			return SelectMenJacketsProceed2Checkout;

		}
		
		@FindBy(xpath = "//*[contains(@data-bind,'New Address')]")
		@CacheLookup
		private WebElement SelectNewAddress;

		public WebElement getSelectNewAddress() {
			return SelectNewAddress;

		}

		@FindBy(xpath = "(//input[@class='input-text'])[6]")
		@CacheLookup
		private WebElement SelectNewFirstName;

		public WebElement getSelectNewFirstName() {
			return SelectNewFirstName;

		}
		
		@FindBy(xpath = "(//*[@class='input-text'])[7]")
		@CacheLookup
		private WebElement SelectNewLastName;

		public WebElement getSelectNewLastName() {
			return SelectNewLastName;

		}
		
		@FindBy(xpath = "(//input[@class='input-text'])[9]")
		@CacheLookup
		private WebElement SelectStreetAddress;

		public WebElement getSelectStreetAddress() {
			return SelectStreetAddress;

		}

		@FindBy(xpath = "(//input[@class='input-text'])[12]")
		@CacheLookup
		private WebElement SelectNewCity;

		public WebElement getSelectNewCity() {
			return SelectNewCity;

		}
		
		@FindBy(xpath = "(//*[@class='select'])[1]")
		@CacheLookup
		private WebElement SelectNewState;

		public WebElement getSelectNewState() {
			return SelectNewState;

		}
		
		@FindBy(xpath = "(//input[@class='input-text'])[14]")
		@CacheLookup
		private WebElement SelectNewZipCode;

		public WebElement getSelectNewZipCode() {
			return SelectNewZipCode;

		}
		
		@FindBy(xpath = "(//*[@class='select'])[2]")
		@CacheLookup
		private WebElement SelectNewCountry;

		public WebElement getSelectNewCountry() {
			return SelectNewCountry;

		}
		
		@FindBy(xpath = "(//input[@class='input-text'])[15]")
		@CacheLookup
		private WebElement SelectNewPhoneNumber;

		public WebElement getSelectNewPhoneNumber() {
			return SelectNewPhoneNumber;

	    }
		
		@FindBy(xpath = "//*[text()='Ship here']")
		@CacheLookup
		private WebElement SelectShippingAddress;

		public WebElement getSelectShippingAddress() {
			return SelectShippingAddress;
		}
		
		
		//i create a method and in this class  and call the method/function
		//in stepdefinition class and help utulities and waithelper class 
		// i can execute the Function.
		
		public void AllShippingDetails() {
			
			getSelectNewFirstName().clear();
			getSelectNewFirstName().sendKeys("Hashem");
			
			getSelectNewLastName().clear();
			getSelectNewLastName().sendKeys("Abul");
			
			getSelectStreetAddress().clear();
			getSelectStreetAddress().sendKeys("79 83rd street");
			
			getSelectNewCity().clear();
			getSelectNewCity().sendKeys("Brooklyn");
			
		
			commonUtilities.getSelectValue(getSelectNewState(), "New York");
			
			getSelectNewZipCode().clear();
			getSelectNewZipCode().sendKeys("11216");
			
			commonUtilities.getSelectValue(getSelectNewCountry(), "United States");
			
			getSelectNewPhoneNumber().clear();
			getSelectNewPhoneNumber().sendKeys("675-896-9877");
		}
		// Log in Functionality method
		/*
		 * public void getLogin() { GetClickSignInBTN().click();
		 * GetEnterEmail().sendKeys(prop.getProperty("Email"));
		 * GetEnterPassword().sendKeys(prop.getProperty("Password"));
		 * GetClickLogInBTN().click();
		 * 
		 * }
		 */

		
		    //i create a method and in this class  and call the method/function
			//in stepdefinition class and help utulities and waithelper class 
			// i can execute the Function.
		
		public void getLogin() {
			log.info("User able to click on SignIn Button");
			waitHelper.seleniumWait(GetClickSignInBTN(), 30);
			commonUtilities.getActionClick(GetClickSignInBTN());
			log.info("User able to enter Email address");
			waitHelper.seleniumWait(GetEnterEmail(), 30);
			GetEnterEmail().sendKeys(prop.getProperty("Email"));
			log.info("User able to enter Password");
			waitHelper.seleniumWait(GetEnterPassword(), 30);
			GetEnterPassword().sendKeys(prop.getProperty("Password"));
			log.info("User able to click on LogIn Button");
			waitHelper.seleniumWait(GetClickLogInBTN(), 30);
			commonUtilities.getActionClick(GetClickLogInBTN());
			

		}

}
