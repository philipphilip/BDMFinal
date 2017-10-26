package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreOldUiSystemParametersPage;

public class FillRelationshipRegistrationParameterForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, CoreOldUiSystemParametersPage.class);

		CoreOldUiSystemParametersPage.relationshipRegistrationCoolingOffPeriod.clear();
		CoreOldUiSystemParametersPage.relationshipRegistrationCoolingOffPeriod.sendKeys("-1");
		Helper.clickItem(CoreOldUiSystemParametersPage.submitButton);
		Helper.waitFor(CoreOldUiSystemParametersPage.saveMessage);
		String saveMessage;
		saveMessage = CoreOldUiSystemParametersPage.saveMessage.getText();
		Thread.sleep(1000);
		Assert.assertTrue("System Parameter setting has failed",
				saveMessage.equals("SystemConfigHolder Created/Saved successfully"));
		System.out.println("Relationship Registration cooling off period is set to -1");
	}
}
