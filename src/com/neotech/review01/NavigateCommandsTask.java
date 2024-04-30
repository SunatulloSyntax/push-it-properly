package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommandsTask {

//	Task
//	Navigate to https://www.selenium.dev/
//	Navigate to https://www.google.com/
//	Go back to forth 10 times.
//	Use a for loop
//	Wait 1 second between each navigation

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(1000);

		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);

		for (int i = 1; i <= 10; i++) {
			driver.navigate().forward();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		
		driver.close();

	}

}
