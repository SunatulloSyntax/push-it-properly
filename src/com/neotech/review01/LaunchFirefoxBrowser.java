package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {

//		This code will open a Modzilla Firefox Browser
		WebDriver driver = new FirefoxDriver();

		String url = "https://www.nytimes.co";

//		It will navigate to a specific website
		driver.get(url);

		Thread.sleep(2000);

//		Gets the current URL of the website
		String currentURL = driver.getCurrentUrl();

		if (url.equals(currentURL)) {
			System.out.println("URLs are the same!");
		}else {
			System.out.println("URLs are different!");
		}
		System.out.println("url -> " + url);
		System.out.println("currentURL -> " + currentURL);
		
//		Get the website Title
		String title = driver.getTitle();
		System.out.println("Title -> " + title);

//		Quir (close) the browser
		driver.quit();
	}

}
