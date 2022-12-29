package testNG.us.baspage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class super_class {

	//Intialize webdriver interface with driver instant
	//Intialize properties class with help of object
	//intialize logger class with help of object
	
	//declaring 2 class and 1 interface for instant use.
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;

	
	//help of constructor i can create my path for logger, and properties, 
	
	public super_class()  {
		
		//
		log = Logger.getLogger("QA Test Lead - Hash ");
		PropertyConfigurator.configure("Log4j.properties");
		
		prop = new Properties();
		FileInputStream fl;
		try {
			fl = new FileInputStream("./src/main/java/testNG/us/config/config.properties");// confing file path
			prop.load(fl);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("config file is found");
		}
	}
	// How I can initialize all the browser in base class?

	public static void Broswer_initializations() {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			log.info("Start Automation in Chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			log.info("Start Automation in Edge Browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			log.info("Start Automation in Firefox Browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
//with help of driver instant and manage method, window and maximize method
//i can maximize my screen.
		driver.manage().window().maximize();
		
//with the help of driver instant and manage method and delete all cookies method
//i can delete unnecessary file, text, when browser is close
		driver.manage().deleteAllCookies();

//with the help of driver instant and mange method and timeouts, implicitlywait 
//declaring the time in seconds it can wait until the element is loaded in the 
//dom page.
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		// driver.navigate().to("https://magento.softwaretestingboard.com/");
		
//with the help of driver instant and get method and passing object and getproperty method
//from my config url.
		driver.get(prop.getProperty("URL"));

	}

}
