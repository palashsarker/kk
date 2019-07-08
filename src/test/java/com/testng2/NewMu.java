package com.testng2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewMu {
	

	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void first(String name) {
		
		if(name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\palsa\\eclipse-workspaceNew\\com.usa.libraryone\\AllDriver\\chromedriver.exe" );
			driver = new ChromeDriver();	
		}
		else if(name.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\palsa\\eclipse-workspaceNew\\com.usa.libraryone\\AllDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	@Test
	public void aa() {
		driver.get("https://www.google.com/");
		//driver.get("https://www.yahoo.com/");

	}
	@AfterTest
	public void last() {
		System.out.println("done");
	}


}
