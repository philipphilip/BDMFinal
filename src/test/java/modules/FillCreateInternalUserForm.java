package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreAdminCreateInternalUserPage;
import pageobjects.CoreControls;

public class FillCreateInternalUserForm {

	static String userName = RandomStringUtils.randomAlphabetic(6);
	static String familyName = RandomStringUtils.randomAlphabetic(6);
	static String givenName = RandomStringUtils.randomAlphabetic(6);

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, CoreAdminCreateInternalUserPage.class);

		CoreAdminCreateInternalUserPage.loginUserName.sendKeys("Auto" + userName);
		CoreAdminCreateInternalUserPage.userFamilyName.sendKeys("Auto" + familyName);
		CoreAdminCreateInternalUserPage.userGivenName.sendKeys("Auto" + givenName);
		CoreAdminCreateInternalUserPage.userEmailAddress.sendKeys("Auto" + givenName + "Auto" + familyName + "@test.com");
		Helper.selectDropDownList(CoreAdminCreateInternalUserPage.location, "Abbotsford");
		Helper.clickItem(CoreAdminCreateInternalUserPage.submitButton);
		
		Helper.clickItem(CoreAdminCreateInternalUserPage.addButton);
		Thread.sleep(5000);
//		Helper.selectDropDownList(CoreAdminCreateInternalUserPage.roleId, "Trainee (Level 1)");
		CoreAdminCreateInternalUserPage.roleId.sendKeys("Trainiee (Level 1");
		Helper.selectDropDownList(CoreAdminCreateInternalUserPage.level, "1");
		Helper.selectDropDownList(CoreAdminCreateInternalUserPage.division, "Operations");
		Helper.clickItem(CoreAdminCreateInternalUserPage.processingTeam);
		Helper.clickItem(CoreAdminCreateInternalUserPage.rightButton);
		Helper.clickItem(CoreAdminCreateInternalUserPage.registrationsTeam);
		Helper.clickItem(CoreAdminCreateInternalUserPage.rightButton);
		Helper.clickItem(CoreAdminCreateInternalUserPage.userCurrentTimeCheckbox);
		Helper.clickItem(CoreAdminCreateInternalUserPage.addRoleButton);
		
		Helper.clickItem(CoreAdminCreateInternalUserPage.submitButton);
		
		Helper.clickItem(CoreControls.userTab);
		Helper.clickItem(CoreControls.internalUsersLink);
		
		CoreAdminCreateInternalUserPage.searchFamilyName.sendKeys("Auto" + familyName);
		Helper.clickItem(CoreAdminCreateInternalUserPage.searchButton);
		
		Thread.sleep(2000);
		String searchUserName;
		searchUserName = CoreAdminCreateInternalUserPage.searchResultsUserName.getText();
		Assert.assertTrue("The internal user was not created", searchUserName.equals("Auto" + userName));
		
	}

}
