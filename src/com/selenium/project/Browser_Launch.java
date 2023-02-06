package com.selenium.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		
		//browser launch
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Intro\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//URL LAunch
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println("Current url title: "+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
//		driver.close();
	
		//navigation
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//manage commands
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
	}

}
