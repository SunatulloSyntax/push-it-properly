package com.neotech.review03;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class HandlingTimeAlert extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		https://neotech.vercel.app/alerts

		setUp();

		Thread.sleep(1000);

		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(1000);

//		Handling the Alert
		Alert alert = driver.switchTo().alert();
		System.out.println("The text of the alert is -> " + alert.getText());
		alert.accept();
		Thread.sleep(1000);

//		Handling the Delayed Alert
		driver.findElement(By.id("btnDelayedAlert")).click();
//		alert = driver.switchTo().alert();

//		I want to wait for the Alert to be present
//		Wait for a maximum of 20 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());

//		If the alert is present in 3 seconds, I will wait only 3 seconds
		alert = driver.switchTo().alert();
		Thread.sleep(1000);

		alert.accept();
		Thread.sleep(1000);

		tearDown();

	}

}
