package FirstMavenProject.Maven1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.testng.annotations.Test;

public class Browser {
	static ExtentTest test;
	//static ExtentReports report;

	@BeforeTest
	public static void startTest()
	{
	//ExtentReports report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		ExtentReports report = new ExtentReports("C:\\Users\\khushi_Shaurya\\eclipse-workspace\\Maven1\\test-output\\ExtentReportResults.html",true);
				
		test = report.startTest("Browser");

	}
	@Test
	public void testbrowser()
	{System.out.println("Browser test maven");
	}
	
}
