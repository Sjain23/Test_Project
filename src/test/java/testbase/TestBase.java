package testbase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import report_generation.ExtentManager;

public class TestBase {
	
	public ExtentReports rep;
	public ExtentTest test;
	public SoftAssert softAssert;
	
	@BeforeMethod
	public void init(ITestResult res) {
		System.out.println(res.getMethod().getMethodName().toUpperCase());
		rep = ExtentManager.getReports();
		test = rep.createTest(res.getMethod().getMethodName().toUpperCase());
		
		//res.setAttribute("car", "BMW");
		res.setAttribute("reporter", test);
		
		softAssert = new SoftAssert();
		
	}
	
	
	@AfterMethod
	public void exiting() {
		rep.flush();
	}
	
	public void log(String msg) {
		System.out.println(msg);
		test.log(Status.INFO, msg);
	}

}
