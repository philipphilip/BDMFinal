package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreControls;
import pageobjects.CoreNobPage;

public class FillNOBFormForTasks {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, CoreNobPage.class);

		Helper.waitFor(CoreNobPage.notifier_email);
		CoreNobPage.mothersDOBDay.sendKeys("25");
		CoreNobPage.mothersDOBMonth.sendKeys("12");
		CoreNobPage.mothersDOBYear.sendKeys("2016");
		CoreNobPage.chiledDOBDay.sendKeys("01");
		CoreNobPage.chiledDOBMoth.sendKeys("08");
		CoreNobPage.chiledDOBYear.sendKeys("2020");
		CoreNobPage.mothersFamilyName.sendKeys("test");
		CoreNobPage.mothersFamilyNameAtBirth.sendKeys("test");
		CoreNobPage.notifier_family_name.sendKeys("test");
		CoreControls.actionList.sendKeys("Save");
		Helper.clickItem(CoreControls.go);
		Thread.sleep(1000);
		Helper.clickItem(CoreControls.tasksTab);
		Thread.sleep(2000);
		String task1Idbefore = CoreControls.task1Id.getText();
		String task2Idbefore = CoreControls.task2Id.getText();
		String task1Statusbefore = CoreControls.task1Status.getText();
		Assert.assertTrue("Task was not created with status 'Open'", task1Statusbefore.contains("Open"));
		System.out.println("Task created with ID : "+ task1Idbefore + " and status: " + task1Statusbefore);
		String task2Statusbefore = CoreControls.task2Status.getText();
		Assert.assertTrue("Task was not created with status 'Open'", task2Statusbefore.contains("Open"));
		System.out.println("Task created with ID : "+ task2Idbefore + " and status: " + task2Statusbefore);
		Thread.sleep(2000);
		Helper.clickItem(CoreControls.backToFormButton);
		Thread.sleep(1000);
		CoreControls.actionList.sendKeys("Edit");
		Helper.clickItem(CoreControls.go);
		Helper.waitFor(CoreNobPage.mothersFamilyName);
		CoreNobPage.mothersFamilyName.clear();
		CoreNobPage.mothersFamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		CoreNobPage.mothersFamilyNameSameAsBirth.sendKeys("Yes");
		CoreNobPage.mothersGivenName_Core.sendKeys("Automated" + FillNOBForm.randparent1FirstName);
		CoreNobPage.mothersDOBDay.clear();
		CoreNobPage.mothersDOBMonth.clear();
		CoreNobPage.mothersDOBYear.clear();
		CoreNobPage.mothersDOBDay.sendKeys("25");
		CoreNobPage.mothersDOBMonth.sendKeys("12");
		CoreNobPage.mothersDOBYear.sendKeys("1989");
		CoreNobPage.aboriginal_or_torres_strait_islander_origin.sendKeys("Decline to reply");
		CoreNobPage.street_and_number.sendKeys("12");
		CoreNobPage.address_line_two.sendKeys("Canning st");
		CoreNobPage.suburb.sendKeys("North Melbourne");
		CoreNobPage.postcode.sendKeys("3051");
		CoreNobPage.chiledDOBDay.clear();;
		CoreNobPage.chiledDOBMoth.clear();;
		CoreNobPage.chiledDOBYear.clear();;
		CoreNobPage.chiledDOBDay.sendKeys("01");
		CoreNobPage.chiledDOBMoth.sendKeys("08");
		CoreNobPage.chiledDOBYear.sendKeys("2017");
		CoreNobPage.chiled_time_of_birth.sendKeys("9:59");
		CoreNobPage.chiled_sex_at_birth.sendKeys("male");
		CoreNobPage.chiled_born_alive.sendKeys("Yes");
		CoreNobPage.weight.sendKeys("2000");
		CoreNobPage.multiple_Birth.sendKeys("Yes");
		CoreNobPage.birthOrder.sendKeys("1");
		CoreNobPage.birthOrderOf.sendKeys("2");
		CoreNobPage.hospital_name.sendKeys("Ballina District Hospital");
		CoreNobPage.Hospital_town_suburb.sendKeys("Armidale");
		CoreNobPage.notifier_family_name.clear();
		CoreNobPage.notifier_family_name.sendKeys("auto" + FillNOBForm.randTextInformant2_fmlyN);
		CoreNobPage.notifier_given_name.sendKeys("auto" + FillNOBForm.randparent2FirstName);
		CoreNobPage.notifier_email.sendKeys("john.smith@info.com");
		CoreControls.validateForm();
		CoreControls.overrideExceptionsOnform();
		Helper.waitFor(CoreControls.tasksTab);
		Helper.clickItem(CoreControls.tasksTab);
		Thread.sleep(2000);
		String task1Idafter = CoreControls.task1Id.getText();
		String task2Idafter = CoreControls.task2Id.getText();
		String task1Statusafter = CoreControls.task1Status.getText();
		Assert.assertTrue("Task was not marked 'Completed' when the data was corrected", task1Statusafter.contains("Completed"));
		System.out.println("Task ID : "+ task1Idafter + " is now in status: "+ task1Statusafter);
		String task2Statusafter = CoreControls.task2Status.getText();
		Assert.assertTrue("Task was not marked 'Completed' when the data was corrected", task2Statusafter.contains("Completed"));
		System.out.println("Task ID : "+ task2Idafter + " is now in status: "+ task2Statusafter);

	}

}
