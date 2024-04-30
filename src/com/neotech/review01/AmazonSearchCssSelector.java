package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchCssSelector {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
//		In this example I will use Css Selector

//		# (hashtag) means the ID
//		#twotabsearchtextbox  -> any element that has the ID twotabsearchtextbox

		WebElement searchText = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchText.sendKeys("watch");
		Thread.sleep(1000);

		WebElement searchButton = driver.findElement(By.cssSelector("#nav-search-submit-button"));
		searchButton.click();

		Thread.sleep(2000);
		driver.close();

	}

}
