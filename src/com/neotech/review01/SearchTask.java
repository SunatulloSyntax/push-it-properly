package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTask {

//	TASK
//	Go to https://demoqa.com/text-box
//	Fill the form and submit

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/text-box");

		Thread.sleep(1000);

		WebElement fullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		fullName.sendKeys("Ali Valiev");

		Thread.sleep(1000);

		WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		email.sendKeys("abc@gmail.com");

		Thread.sleep(1000);

		WebElement address = driver.findElement(By.cssSelector("#permanentAddress"));
		address.sendKeys("980 N CountrySide Dr, Palatine");

		Thread.sleep(1000);

		WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		submit.click();

		Thread.sleep(2000);
		driver.close();

	}

}
