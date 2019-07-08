package com.testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryOne {
	
	static WebDriver driver;
	@Test
	public void say()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\palsa\\Desktop\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//Assert.assertTrue(false);
		//driver.findElement(By.linkText("jkkkGmailwqqq")).click();
		
	}
	
	public void pic(String ww) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\palsa\\Desktop\\aq\\"+ww+"dada.png"));
	
	}
	

}
