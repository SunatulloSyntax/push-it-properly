package com.neotech.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class LoginSIS extends BaseClass {

//	Login to SIS Web Application
//	https://sis.neotechacademy.com/
//	username -> Admin
//	password -> Neotech$123

	public static void main(String[] args) throws InterruptedException {

		setUp();

//		We are performing our test
		Thread.sleep(1000);

		WebElement username = driver.findElement(By.id("tUsername"));
		username.sendKeys(ConfigsReader.getProperty("username")); // Admin
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.name("tPassword"));
		password.sendKeys(ConfigsReader.getProperty("password"));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"bLogin\"]")).click(); // Method chaining
		Thread.sleep(1000);

		tearDown();

	}

}
