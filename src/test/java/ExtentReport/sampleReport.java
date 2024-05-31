package ExtentReport;

import java.io.File;


import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class sampleReport {
	@Test
	public void launchTheReport() {
		ExtentReports report = new ExtentReports();
		File path =  new File("./extenetReport/sample.html");
		ExtentSparkReporter spark = new  ExtentSparkReporter(path);
		spark.config().setDocumentTitle("selenium");
		spark.config().setReportName("Desul");
		spark.config().setTheme(Theme.DARK);
		//attach the test case
		report.attachReporter(spark);
		report.setSystemInfo("os", "Windows10");
		report.setSystemInfo("Browser", "edge");
		//create the test case
		ExtentTest test1 = report.createTest("test1");
		test1.log(Status.FAIL, "Login function error");
		report.flush();
	}


}