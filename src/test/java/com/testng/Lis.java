package com.testng;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Lis implements ITestListener {
	LibraryOne bb = new LibraryOne();
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("hello");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("successfully done");
		
	}

	public void onTestFailure(ITestResult result) {
		try {
			bb.pic(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("go ahead");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("we are done");
		
	}

}
