package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class HarryPotterSearch extends BaseClass {

//	Go to https://www.amazon.com/
//	select Books from the search drop-down
//	Type Harry potter
//	And click on Search
//	Search "Kindle Unlimited Eligible" checkBox on the left	

	public static void main(String[] args) throws InterruptedException {

		setUp();

		Thread.sleep(1000);

		WebElement searchDDElement = driver.findElement(By.id("searchDropdownBox"));
		Select selectDD = new Select(searchDDElement);

//		Print all the option of the drop-down
//		List<WebElement> optionList = selectDD.getOptions();
//		for(WebElement option : optionList) {
//			System.out.println(option.getText());
//		}

//		3 differetn ways to select one drop-down options
//		selectDD.selectByIndex(1);
//		selectDD.selectByValue("search-alias=stripbooks");
		selectDD.selectByVisibleText("Books");

		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));

		searchTxt.clear();
		searchTxt.sendKeys("Harry Potter");
		Thread.sleep(1000);

		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));

		searchBtn.submit();
		Thread.sleep(1000);

		List<WebElement> elementList = driver.findElements(By.xpath("//li[@class='a-spacing-micro']"));

		System.out.println("There are -> " + elementList.size() + " <- elements with that xPath");

//		This exception is a nightmare -> StaleElementReferenceException
//		Happens when we click, and don't break the loop
		for (WebElement el : elementList) {
			String elementText = el.getText();

			if (elementText.equals("Kindle Unlimited Eligible")) {
				System.out.println(elementText);

				el.click();
//				System.out.println(elementText);
				break;

			}

		}

		Thread.sleep(3000);

		tearDown();

	}

}
