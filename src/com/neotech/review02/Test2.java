package com.neotech.review02;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Test2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		Preparing for the test
		setUp();

//		Do our test
		Thread.sleep(2000);

//		Locate some elements
//		driver.findElement(By.id(""));

//		CLean up everything
		tearDown();

	}

}
