package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class CheckBoxDemo extends BaseClass {

//	Go to https://demoqa.com/automation-practice-form
//	Check Female
//	Select all the Hobbies

	public static void main(String[] args) throws InterruptedException {

		setUp();

		Thread.sleep(1000);

//		Cannot click on the Input, because the Label does not allow
//		driver.findElement(By.id("gender-radio-2")).click();

//		We are able to click on the Label
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		Thread.sleep(1000);

//		///////////////////////////////////////////////////////
//		findElement VS findElements
//		findElement returns the first WebElement with that xPath
//		findElements returns All the WebElement with that xPath
//		///////////////////////////////////////////////////////

//		It will return all the WebElements with that xPath inside a List
//		List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]"));

//		1. If xPath is wrong
//		findElement will throw an Exception
//		findElements will return an Empty List of WebElements (size = 0)

//		2. If there are multiple elements with that xPath
//		findElement -> will return the first WebElement 
//		findElements -> will return all the WebElements inside a List (size = 3)

//		3. If there is only one elements with that xPath
//		findElement -> will return the first WebElement
//		findElement -> will return the WebElements inside a List (size = 1)
//		///////////////////////////////////////////////////////////////////

//		Locate all the checkBoxes
		List<WebElement> checkBoxList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));

//		Click all the checkBoxes one-by-one
		for (WebElement checkbox : checkBoxList) {

			checkbox.click();
			Thread.sleep(1000);
		}

		Thread.sleep(1000);

		tearDown();

	}

}
