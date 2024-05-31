package com.crm.listnersCode;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DWSLogin implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
	}

//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		
//	}s

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");
	}

	public void onStart(ITestContext context) {
		System.out.println("onStart");
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
	}
}
