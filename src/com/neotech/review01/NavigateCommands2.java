package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		String ulr = "https://www.instagram.com";

//		driver.get(ulr);
//		will wait for the page and elements to be loaded
//		will NOT keep the history

		driver.navigate().to(ulr);
//		will NOT wait for the page and the elements to be loaded
//		will keep the history

		driver.manage().window().maximize(); // will make full screen
		Thread.sleep(1000);

		driver.manage().window().minimize(); // will minimize the screen
		Thread.sleep(1000);

		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.navigate().to("https://www.mlssoccer.com");
		Thread.sleep(1000);
		

		driver.close();

	}

}
