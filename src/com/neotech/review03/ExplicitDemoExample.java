package com.neotech.review03;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class ExplicitDemoExample extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html

		setUp();

//		Implicit Wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//
//		driver.findElement(By.id("downloadButton")).click();
//
//		driver.findElement(By.xpath("//div[text()='Complete!']"));
//		//////////////////////////////////////////////////////////////////////

//		WebDriver Wait
//		driver.findElement(By.id("downloadButton")).click();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Complete!']")));
//
////		Wait until the element is visible
////		Wait for a maximum of 30 seconds
//
//		WebElement label = driver.findElement(By.xpath("//div[text()='Complete!']"));
//		System.out.println("The label text is -> " + label.getText());

//		FluentWait
		driver.findElement(By.id("downloadButton")).click();

		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
		fluentWait.withTimeout(Duration.ofMinutes(1)); // Maximum wait is 1 minute
		fluentWait.pollingEvery(Duration.ofSeconds(2)); // Try every 2 seconds
		fluentWait.ignoring(NoSuchElementException.class); // While trying ignore this exception

//		I will wait for the button Close to be in page and  Clickable

		fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Close']")));

//		Now we know that the Cloe button is clickable
		driver.findElement(By.xpath("//button[text()='Close']")).click();

		Thread.sleep(1000);

		tearDown();

	}

}
