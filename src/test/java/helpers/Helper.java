package helpers;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import step_definitions.Hooks;

public class Helper {

	public static void inputItem(WebElement item, String value, int waitInSeconds, boolean clean) throws Throwable {
		Thread.sleep(waitInSeconds * 1000);
		try {
			WebDriverWait wait = new WebDriverWait(Hooks.driver, 20);
			wait.until(ExpectedConditions.visibilityOf(item));
			wait.until(ExpectedConditions.elementToBeClickable(item));
			if (clean) {
				if (item.getTagName().equals("input")) {
					item.clear();
				}
			}
			item.sendKeys(value);
		} catch (Throwable e) {
			System.out.println("Input item failed, wait for 10 seconds to input again.");
			Thread.sleep(5000);
			if (clean) {
				if (item.getTagName().equals("input")) {
					item.clear();
				}
			}
			item.sendKeys(value);
		}
	}

	public static void inputItem(WebElement item, String value) throws Throwable {

		inputItem(item, value, 0, true);
	}

	public static void clickItem(WebElement item) throws Throwable {
		int count = 0;
		int maxTries = 15;
		while(true) {
			try {
				WebDriverWait wait = new WebDriverWait(Hooks.driver, 1);
				wait.until(ExpectedConditions.visibilityOf(item));
				wait.until(ExpectedConditions.elementToBeClickable(item));
				((JavascriptExecutor) Hooks.driver).executeScript("arguments[0].scrollIntoView(true);", item);
			    Thread.sleep(500);
				item.click();
				break;
			} catch (Exception e) {
				Thread.sleep(100);
				if (++count == maxTries) throw e;
			}
		}
	}

	public static void selectDropDownList(WebElement dropDown, String value) {
		WebDriverWait wait = new WebDriverWait(Hooks.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(dropDown));
		wait.until(ExpectedConditions.elementToBeClickable(dropDown));

		Select dropdownList = new Select(dropDown);
		List<WebElement> valueList = dropdownList.getOptions();
		for (int i = 0; i < valueList.size(); i++) {
			if (value.toLowerCase().equals(valueList.get(i).getText().toLowerCase())) {
				dropdownList.selectByIndex(i);
				return;
			}
		}
		System.out.println("Can not find item to select:" + value);
		if (valueList.size() > 1) {
			if (valueList.get(0).getText().startsWith("Please")) {
				System.out.println("Select the next available dropdown list value");
				dropdownList.selectByIndex(1);
			} else {
				System.out.println("Select first one");
				dropdownList.selectByIndex(0);
			}

		} else if (valueList.size() == 1) {
			System.out.println("Select first value in the dropdown list");
			dropdownList.selectByIndex(0);
		}
	}

	public static void waitFor(WebElement field) throws Throwable {
		WebDriverWait waitForField = new WebDriverWait(Hooks.driver, 15);
		field = waitForField
				.until(ExpectedConditions.elementToBeClickable(field));
	}
}

