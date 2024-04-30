package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.amazon.com");
//		will wait for the elements to be loaded

		driver.navigate().to("https://signal-telecom.net");
//		will not wait for the element to be loaded
//		will keep history

		Thread.sleep(500);

		driver.navigate().to("https://github.com/NeotechAcademy/");
		Thread.sleep(500);

		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.navigate().back();
//		will go back to the previuos page
		
		
		Thread.sleep(2000);
		driver.navigate().forward();

		Thread.sleep(2000);

		driver.close();
		
//		TASK
//		Open Chrome browser
//		Naviget to https://www.selenium.dev/
//		Navigate to https://www.amazon.com/
//		Go back and forth 10 times
//		Use for loop
//		Wait 1 second between each navigation

	}

}
