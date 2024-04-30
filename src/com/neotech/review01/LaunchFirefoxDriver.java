package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxDriver {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

//		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.com");
		Thread.sleep(2000);

		String current = driver.getCurrentUrl();
		System.out.println(current);

		String title = driver.getTitle();
		System.out.println(title);

		driver.close();

	}

}
