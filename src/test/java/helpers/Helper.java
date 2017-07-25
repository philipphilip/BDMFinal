package helpers;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.EregistryControls;
import step_definitions.Hooks;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class Helper {

	public static void inputItem( WebElement item, String value, int waitInSeconds, boolean clean) throws Throwable{
		Thread.sleep(waitInSeconds * 1000);
		try {
			WebDriverWait wait = new WebDriverWait(Hooks.driver, 20);
			wait.until(ExpectedConditions.visibilityOf(item));
			wait.until(ExpectedConditions.elementToBeClickable(item));
			if(clean) {
				if (item.getTagName().equals("input")) {
					item.clear();
				}
			}
			item.sendKeys(value);
		}catch (Throwable e)
		{
			System.out.println("Input item failed, wait for 10 seconds to input again.");
			Thread.sleep(10000);
			if(clean) {
				if (item.getTagName().equals("input")) {
					item.clear();
				}
			}
			item.sendKeys(value);
		}
	}

	public static void inputItem( WebElement item, String value ) throws Throwable{

		inputItem( item, value, 0, true);
	}

	public static void inputById( String id, String value ) throws Throwable{
		Thread.sleep(2000);
		WebElement item = Hooks.driver.findElement(By.id(id));
		inputItem( item, value, 0, true);
	}

	public static void clickItem(WebElement item) throws Throwable{

		try {
			WebDriverWait wait = new WebDriverWait(Hooks.driver, 120);
			wait.until(ExpectedConditions.visibilityOf(item));
			wait.until(ExpectedConditions.elementToBeClickable(item));
			item.click();
		}catch (Throwable e) {
			System.out.println("Click item failed, wait for 10 seconds to click again.");
			Thread.sleep(10000);
			try {
				item.click();
			} catch (Throwable e1){
				System.out.println("Click item failed, wait for 120 seconds to click again.");
				Thread.sleep(120000);
				item.click();
			}
		}
	}

	public static void selectDropDownList( WebElement dropDown, String value)
	{
		WebDriverWait wait = new WebDriverWait(Hooks.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(dropDown));
		wait.until(ExpectedConditions.elementToBeClickable(dropDown));

		Select dropdownList = new Select(dropDown);
		List<WebElement> valueList = dropdownList.getOptions();
		for (int i = 0; i < valueList.size(); i++) {
			if(value.toLowerCase().equals(valueList.get(i).getText().toLowerCase())){
				dropdownList.selectByIndex(i);
				System.out.println("Found item to select:" + value );
				return;
			}
		}
		System.out.println("Can not find item to select:" + value );
		if (valueList.size()>1)
		{
			if(valueList.get(0).getText().startsWith("Please")){
				System.out.println("Select second one as first one is Please..." );
				dropdownList.selectByIndex(1);
			}else{
				System.out.println("Select first one" );
				dropdownList.selectByIndex(0);
			}

		}else if(valueList.size()==1)
		{
			System.out.println("Select first one as it is the only one" );
			dropdownList.selectByIndex(0);
		}
	}


	public static void checkText(WebElement textItem, String text) throws Throwable{
		String result = "";
		try {
			WebDriverWait wait = new WebDriverWait(Hooks.driver, 120);
			wait.until(ExpectedConditions.visibilityOf(textItem));
			wait.until(ExpectedConditions.textToBePresentInElement(textItem, text ));
			result = textItem.getText();
		}catch (Throwable e)
		{
			System.out.println("Get text from item failed, wait for 10 seconds to get again.");
			Thread.sleep(10000);
			try {
				result = textItem.getText();
			} catch (Throwable e1){
				System.out.println("Get text from item failed, wait for 120 seconds to get again.");
				Thread.sleep(120000);
				result = textItem.getText();
			}
		}

		Assert.assertTrue("result message not found", result.contains(text));
	}

	public static void clickLinkByText( String linkText) throws Throwable {
		Thread.sleep(2000);
		WebElement linkItem = null;
		try {
			linkItem = Hooks.driver.findElement(new By.ByLinkText(linkText));

		}catch (Throwable e) {
			System.out.println("Find link by text failed, wait for 3 seconds to try again.");
			Thread.sleep(3000);
			linkItem = Hooks.driver.findElement(new By.ByLinkText(linkText));
		}
		clickItem(linkItem);

	}

	public static void clickButtonByText( String buttonText) throws Throwable {

		WebElement buttonItem = null;
		try {
			Thread.sleep(2000);
			buttonItem = Hooks.driver.findElement(xpath("//button[contains(., '"+ buttonText + "')]"));
		}catch (Throwable e) {
			System.out.println("Find button by text failed, wait for 10 seconds to try again.");
			Thread.sleep(10000);
			try {
				buttonItem = Hooks.driver.findElement(xpath("//button[@value='" + buttonText + "']"));
			} catch (Throwable e1){
				System.out.println("Find button by text failed, wait for 120 seconds to get again.");
				Thread.sleep(120000);
				buttonItem = Hooks.driver.findElement(xpath("//button[contains(., '"+ buttonText + "')]"));
			}
		}
		clickItem(buttonItem);

	}



}
