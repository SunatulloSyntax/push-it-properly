package com.neotech.review03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class HandlingWindowsTask extends BaseClass {

//	Open https://neotech.vercel.app/windows
//	Click on the button that opens Neotech Academy page
//	Switch the focus back and forth 10 times

//	Find the time for the best disco movement

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(1000);

		Set<String> allWindows = driver.getWindowHandles();

		Iterator<String> it = allWindows.iterator();
		String handle1 = it.next();
		String handle2 = it.next();

		for (int i = 1; i <= 10; i++) {
			driver.switchTo().window(handle1);
			Thread.sleep(300);
			driver.switchTo().window(handle2);
			Thread.sleep(300);

		}

		tearDown();

	}

}
