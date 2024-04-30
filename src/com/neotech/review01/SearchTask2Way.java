package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTask2Way {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/text-box");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Ali Valiev");
//		WebElement fullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
//		fullName.sendKeys("Ali Valiev");

		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("abc@gmail.com");
//		WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
//		email.sendKeys("abc@gmail.com");

		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("980 N CountrySide Dr, Palatine");
//		WebElement address = driver.findElement(By.cssSelector("#permanentAddress"));
//		address.sendKeys("980 N CountrySide Dr, Palatine");

		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
//		WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
//		submit.click();

		Thread.sleep(2000);
		driver.close();

	}

}
