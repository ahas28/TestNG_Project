package testNG.us.iListener;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.plexus.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testNG.us.baspage.super_class;
import testNG.us.generic.commonUtilities;

public class iListenerTest  implements ITestListener {

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	WebDriver driver;

	@Override 
	public void onTestStart(ITestResult result) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		String repName = "report-" + timeStamp + ".html";

		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/ExtendReports/" + repName);// specify
																											// location
		// of the report
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml");

		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "Alam");

		htmlReporter.config().setDocumentTitle("Automation Test Project"); // Tile of report
		htmlReporter.config().setReportName("Functional Test Report"); // name of the report
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); // location of the chart
		htmlReporter.config().setTheme(Theme.DARK);

	}

	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Name" + " " + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Name" + " " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Name" + " " + result.getName());
		commonUtilities.takeScreenshotAtEndOfTest();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Name" + " " +result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Name" + " " + result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Name" + " " + context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Name" + " " + context.getName());
		
	}

}
