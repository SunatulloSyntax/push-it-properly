package com.neotech.review02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass {

//		https://neotech.vercel.app/alerts

	public static void main(String[] args) throws InterruptedException {

		setUp();

		Thread.sleep(1000);

		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(1000);

//		When alert is open, you cannot interact with the main page
//		driver.findElement(By.id("btnConfirm")).click();
//		Thread.sleep(1000);

//		We need to take care of the Alert (Javascript Pop-up)
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);

		System.out.println("The text of the Alert -> " + alert.getText());

//		alert.dismiss(); //Clicking without accepting
		alert.accept(); // Click on OK
		Thread.sleep(1000);

//		After accept/dismiss the alert, we can interact with the main page
		driver.findElement(By.id("btnPrompt")).click();
		Thread.sleep(1000);

		Alert prompt = driver.switchTo().alert();
		Thread.sleep(2000);

		prompt.sendKeys("Gena");
		Thread.sleep(2000);

		prompt.accept();
		Thread.sleep(2000);

		tearDown();

	}

}
