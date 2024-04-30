package com.neotech.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class HandlingFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		https://the-internet.herokuapp.com/iframe

		setUp();

//		1st way, switching by index
//		driver.switchTo().frame(0);

//		2st way, switching by ID/Name
//		driver.switchTo().frame("mce_0_ifr");

//		3st way, switching by Webelement
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(frameElement);

//		After I switch to the iFrame, then I am able to locate the element
		WebElement bodyElement = driver.findElement(By.xpath("//body[@id='tinymce']"));

		Thread.sleep(2000);
		bodyElement.clear();
		Thread.sleep(2000);
		bodyElement.sendKeys("Fenerbahce will beat Trabzon 3-0");

		Thread.sleep(2000);

//		This will throw an exeption NoSuchElementException
//		because the focus is inside the frame
//		but the element is oustside of the frame
//		driver.findElement(By.linkText("Element Selenium")).click();

//		We need to switch the focus to the main page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Elemental Selenium")).click();
		Thread.sleep(2000);

		tearDown();

	}

}
