package com.neotech.review03;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class HandlingWindows extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		https://neotech.vercel.app/windows

		setUp();

		String window1 = driver.getWindowHandle();

		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);

		System.out.println("--------------------------");

//		I am not able to locate the element. The focus is still on the first page.
//		driver.findElement(By.name("q")).sendKeys("Gena is the best student!");

		Set<String> allWindows = driver.getWindowHandles();

		for (String windowId : allWindows) {

//			System.out.println(windowId);

			if (!windowId.equals(window1)) {
//				If the windowId is NOT to the first Window ID
				driver.switchTo().window(windowId);
			}
		}

//		Now I am able to locate elements. The focus is on the secong page
		driver.findElement(By.name("q")).sendKeys("Gena is the best student!");
		Thread.sleep(3000);

		tearDown();

	}
}
