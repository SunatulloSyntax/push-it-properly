package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

//		There are 8 locators to find the elements in the DOM
//		id, name, className, linkText, partialLinkText, tagName, xPath, cssSelector

		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		searchText.sendKeys("clothes");
		Thread.sleep(1000);

		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		searchButton.click();

		Thread.sleep(2000);
		driver.close();

	}

}
