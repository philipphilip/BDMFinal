package helpers;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;
import java.util.List;

public class Helper {

	public static void inputItem( WebElement item, String value) throws Throwable{

		try {
			WebDriverWait wait = new WebDriverWait(Hooks.driver, 60);
			wait.until(ExpectedConditions.visibilityOf(item));
			wait.until(ExpectedConditions.elementToBeClickable(item));
			item.sendKeys(value);
		}catch (Throwable e)
		{
			System.out.println("Input item failed, wait for 20 seconds to input again.");
			Thread.sleep(20000);
			item.sendKeys(value);
		}
	}

	public static void clickItem(WebElement item) throws Throwable{

		try {
			WebDriverWait wait = new WebDriverWait(Hooks.driver, 60);
			wait.until(ExpectedConditions.visibilityOf(item));
			wait.until(ExpectedConditions.elementToBeClickable(item));
			item.click();
		}catch (Throwable e)
		{
			System.out.println("Click item failed, wait for 20 seconds to click again.");
			Thread.sleep(20000);
			item.click();
		}
	}

	public static void selectDropDownList( WebElement dropDown, String value)
	{
		WebDriverWait wait = new WebDriverWait(Hooks.driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dropDown));
		wait.until(ExpectedConditions.elementToBeClickable(dropDown));

		Select dropdownList = new Select(dropDown);
		List<WebElement> valueList = dropdownList.getOptions();
		for (int i = 0; i < valueList.size(); i++) {
			if(value.equals(valueList.get(i).getText())){
				dropdownList.selectByIndex(i);
				return;
			}
		}

		if (valueList.size()>1)
		{
			if(valueList.get(0).getText().startsWith("Please")){
				dropdownList.selectByIndex(1);
			}else{
				dropdownList.selectByIndex(0);
			}

		}else if(valueList.size()==1)
		{
			dropdownList.selectByIndex(0);
		}
	}

	//TODO: check page text

}
