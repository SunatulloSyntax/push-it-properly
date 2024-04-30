package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommandsTask2 {

//	TASK
//	Open Chrome browser
//	Navigate to https://www.selenium.dev/
//	Navigate to https://www.amazon.com/
//	Go back and forth 10 times
//	Use for loop
//	Wait 1 second between each navigation

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.navigate().to("https://www.amazon.com/");

		for (int i = 1; i <= 10; i++) {
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();
			Thread.sleep(1000);
		}
		driver.close();

	}

}
