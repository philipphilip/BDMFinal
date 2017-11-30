package step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Helper;
import pageobjects.CoreControls;
import pageobjects.CoreLoginPage;
import pageobjects.TemplatesPages;

public class Templates {
	public WebDriver driver;
	public static List<HashMap<String, String>> datamap = null;

	public Templates() {
		driver = Hooks.driver;

		datamap = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> sampleData = new HashMap<String, String>();
		sampleData.put("username", "abc@xyz.com");
		sampleData.put("password", "Test@123");
		System.out.println("Current data" + sampleData);
		datamap.add(sampleData);
	}

	private static String baseURL = "http://10.22.1.110/admin";

	@Given("^I am on CORE Admin site$")
	public void i_am_on_CORE_Admin_site() throws Throwable {
		PageFactory.initElements(driver, CoreLoginPage.class);
		driver.get(baseURL);
		driver.manage().window().maximize();
		Helper.waitFor(CoreLoginPage.coreAdminUsignin_button);
		CoreLoginPage.coreAdminUsername.sendKeys("admin");
		CoreLoginPage.coreAdminUpassword.sendKeys("Friday17");
		Helper.clickItem(CoreLoginPage.coreAdminUsignin_button);
	}

	@When("^I want to create a \"([^\"]*)\" template")
	public void i_want_to_create_a_template_for_the_life_event(String corroType) throws Throwable {

		PageFactory.initElements(driver, CoreControls.class);
		PageFactory.initElements(driver, TemplatesPages.class);
		System.out.println("------------before clicking menue tab");

		Helper.clickItem(CoreControls.templateManagement);
		Helper.clickItem(CoreControls.corroTemp);
		Helper.clickItem(TemplatesPages.createNewCorroTemplate);

		if (corroType.equals("SMS corro")) {
			TemplatesPages.templateType.sendKeys("SMS");
		} else if (corroType.equals("Email corro")) {
			System.out.println("------------Inside email loop");
			TemplatesPages.templateType.sendKeys("Email");
		} else if (corroType.equals("Letter corro")) {
			System.out.println("we are the stage of clciking template manage and the arg1 is: " + corroType);
			TemplatesPages.templateType.sendKeys("Letter");
		}
	}

	@When("^I want the email to have a the related SMS \"([^\"]*)\" and the Signature Block to be \"([^\"]*)\"$")
	public void i_want_the_email_to_have_a_the_related_SMS_and_the_Signature_Block_to_be(String relatedSMS,
			String signatureBlock) throws Throwable {
		PageFactory.initElements(driver, TemplatesPages.class);

		if (relatedSMS != null) {
			TemplatesPages.relatedSms.sendKeys(relatedSMS);
		}
		if (signatureBlock != null) {
			TemplatesPages.signatureBlock.sendKeys(signatureBlock);
		}
	}

	@When("^I want the letter to have the \"([^\"]*)\" and the Signature Block to be \"([^\"]*)\"$")
	public void i_want_the_letter_to_have_the_and_the_Signature_Block_to_be(String brandingTemplates,
			String watermarkTemplates) throws Throwable {

		TemplatesPages.brandingTemplate.sendKeys(brandingTemplates);
		TemplatesPages.watermarkTemplate.sendKeys(watermarkTemplates);

	}

	@When("^I want to make the title \"([^\"]*)\" and the description \"([^\"]*)\" and the \"([^\"]*)\" and the \"([^\"]*)\"$")
	public void i_want_to_make_the_title_and_the_description_and_the(String title, String description, String lifeEvent,
			String docType) throws Throwable {
		PageFactory.initElements(driver, TemplatesPages.class);

		if (title.contains("SMS")) {
			TemplatesPages.templateName.sendKeys(title);
			TemplatesPages.templateDescription.sendKeys(description);
		} else if (title.contains("Email")) {
			TemplatesPages.templateName.sendKeys(title);
			TemplatesPages.templateDescription.sendKeys(description);
			TemplatesPages.subSystem.sendKeys("CBDM Core");
			if (lifeEvent != null && lifeEvent.length() > 0) {
				System.out.println("-------The value of Life Event here is: " + lifeEvent);
				TemplatesPages.lifeEvent.sendKeys(lifeEvent);
				Thread.sleep(2000);
				TemplatesPages.docType.sendKeys(docType);
			}
			TemplatesPages.appBeforeSending.sendKeys("No");
		} else {
			TemplatesPages.templateName.sendKeys(title);
			TemplatesPages.templateDescription.sendKeys(description);
			TemplatesPages.subSystem.sendKeys("CBDM Core");
			TemplatesPages.appBeforeSending.sendKeys("No");
			if (lifeEvent != null && lifeEvent.length() > 0) {
				TemplatesPages.lifeEvent.sendKeys(lifeEvent);
				TemplatesPages.docType.sendKeys(docType);
			}
			TemplatesPages.appBeforeSending.sendKeys("No");

		}
	}

	@When("^I link it to SMS \"([^\"]*)\"$")
	public void i_link_it_to_SMS(String relatedSms) throws Throwable {
		PageFactory.initElements(driver, TemplatesPages.class);
		TemplatesPages.relatedSms.sendKeys(relatedSms);
	}

	@When("^I want to make the email subject \"([^\"]*)\"$")
	public void i_want_to_make_the_email_subject(String emailsubject) throws Throwable {
		PageFactory.initElements(driver, TemplatesPages.class);
		Helper.clickItem(TemplatesPages.templateEditorTab);
		TemplatesPages.emailSubject.sendKeys(emailsubject);
		TemplatesPages.emailBody.sendKeys(" This is content of a email correspondence template");
		System.out.println("----The email subject is: " + emailsubject);
	}

	@When("^I make the boy text \"([^\"]*)\"$")
	public void i_make_the_boy_text(String arg1) throws Throwable {
		Helper.clickItem(TemplatesPages.templateEditorTab);
		TemplatesPages.pageZise.sendKeys("A4");
		TemplatesPages.topMargin.sendKeys("20");
		TemplatesPages.rightMargin.sendKeys("20");
		TemplatesPages.bottomMargin.sendKeys("20");
		TemplatesPages.leftMargin.sendKeys("20");
		TemplatesPages.emailBody.sendKeys(" This is content of a letter correspondence template");
	}

	@When("^I make the boy text \"([^\"]*)\" with template body \"([^\"]*)\"$")
	public void i_make_the_boy_text_with_template_body(String corroType, String templateBody) throws Throwable {

		PageFactory.initElements(driver, TemplatesPages.class);
		System.out.println("-----Corro type value is: " + corroType);
		System.out.println("-----templateBody value is: " + templateBody);

		if (corroType.equals("SMS")) {
			Helper.clickItem(TemplatesPages.templateEditorTab);
			TemplatesPages.smsBody.sendKeys(templateBody);
		} else if (templateBody.equals("Email Body")) {
			System.out.println("This is the email body section");
		} else {
			System.out.println("This is the Letter body section");
		}
	}

	@Then("^I can save the template placeholder$")
	public void i_can_save_the_template_placeholder() throws Throwable {

		Helper.clickItem(TemplatesPages.saveCorro);
		Helper.waitFor(TemplatesPages.successfullySaved);
		String bannerMessage = TemplatesPages.successfullySaved.getText();
		Assert.assertTrue("The corrospondance is saved", bannerMessage.contains("successfully"));
		System.out.println("This is after checking message successfuly saved!");

	}

	// @When("^I make the boy text \"([^\"]*)\"$")
	// public void i_make_the_boy_text(String templateBody) throws Throwable {
	// System.out.println("-----arg1 in body text--------the value is: " +
	// templateBody);
	// PageFactory.initElements(driver, TemplatesPages.class);
	// // Helper.clickItem(TemplatesPages.templateEditorTab);
	// // TemplatesPages.smsBody.sendKeys(arg1);
	// // TemplatesPages.pageZise.sendKeys("A4");
	// // TemplatesPages.topMargin.sendKeys("20");
	// // TemplatesPages.rightMargin.sendKeys("20");
	// // TemplatesPages.bottomMargin.sendKeys("20");
	// // TemplatesPages.leftMargin.sendKeys("20");
	// TemplatesPages.emailBody.sendKeys(templateBody);
	//
	// if (templateBody.equals("SMS Body")) {
	//
	// } else if (templateBody.equals("Email Body")) {
	//
	// } else {
	//
	// }
	//
	// }

}
