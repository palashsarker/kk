package com.testng2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class One {
	
	static WebDriver driver;
	@Test
	public void aa() {
		System.out.println("this is aa==--"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\palsa\\Desktop\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	@Test
	public void aa1() {
		System.out.println("this is aa1==--"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\palsa\\Desktop\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	@Test
	public void aa2() {
		System.out.println("this is aa2==--"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\palsa\\Desktop\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

}
