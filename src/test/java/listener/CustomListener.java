package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CustomListener implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		System.out.println("Failed Test Name is : " + result.getName());
		System.out.println(result.getStatus()); //error msg for failed = 2, pass = 1 may be, skipped = 0
		System.out.println("Reason for the error is " + result.getThrowable().getMessage());
	
		//System.out.println(result.getAttribute("car"));
		ExtentTest test = (ExtentTest)result.getAttribute("reporter"); //nay method which returns an object, you have to cast it with the class.
		test.log(Status.FAIL, result.getThrowable().getMessage());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");
		
	}


	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
