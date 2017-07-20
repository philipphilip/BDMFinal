package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CoreControls;
import pageobjects.CoreLoginPage;
import pageobjects.TemplatesPages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

	private static String baseURL = "http://10.22.1.200/admin";

	@Given("^I am on CORE Admin site$")
	public void i_am_on_CORE_Admin_site() throws Throwable {
		driver.get(baseURL);
		PageFactory.initElements(driver, CoreLoginPage.class);
		WebDriverWait waitForLoginPage = new WebDriverWait(driver, 10000);

		CoreLoginPage.coreAdminUsignin_button = waitForLoginPage
				.until(ExpectedConditions.elementToBeClickable(CoreLoginPage.coreAdminUsignin_button));
		CoreLoginPage.coreAdminUsername.sendKeys("admin");
		CoreLoginPage.coreAdminUpassword.sendKeys("Friday17");
		CoreLoginPage.coreAdminUsignin_button.click();

	}

	@When("^I want to create a \"([^\"]*)\" template$")
	public void i_want_to_create_a_template(String arg1) throws Throwable {
		PageFactory.initElements(driver, CoreControls.class);

		System.out.println("------------before clicking menue tab");

		PageFactory.initElements(driver, TemplatesPages.class);
		if (arg1.equals("SMS corro")) {
			Thread.sleep(2000);
			CoreControls.templateManagement.click();

			Thread.sleep(2000);
			CoreControls.corroTemp.click();

			Thread.sleep(2000);
			TemplatesPages.createNewCorroTemplate.click();
			TemplatesPages.templateType.sendKeys("SMS");
		} else if (arg1.equals("Email corro")) {
			System.out.println("------------Inside email loop");
			Thread.sleep(3000);
			CoreControls.templateManagement.click();
			Thread.sleep(3000);
			CoreControls.corroTemp.click();
			Thread.sleep(3000);
			TemplatesPages.createNewCorroTemplate.click();
			TemplatesPages.templateType.sendKeys("Email");
			TemplatesPages.subSystem.sendKeys("CBDM Core");
			TemplatesPages.appBeforeSending.sendKeys("No");
		} else if (arg1.equals("letter corro")) {
			PageFactory.initElements(driver, CoreControls.class);
			Thread.sleep(6000);
			System.out.println("we are the stage of clciking template manage and the arg1 is: " + arg1);
			CoreControls.templateManagement.click();
			System.out.println("------------Inside email loop");
			Thread.sleep(6000);
			CoreControls.corroTemp.click();
			Thread.sleep(6000);
			TemplatesPages.createNewCorroTemplate.click();
			TemplatesPages.templateType.sendKeys("Letter");
			TemplatesPages.subSystem.sendKeys("CBDM Core");
			TemplatesPages.appBeforeSending.sendKeys("No");
		}
	}

	@When("^I want to make the title \"([^\"]*)\"$")
	public void i_want_to_make_the_title(String arg1) throws Throwable {
		System.out.println("the value is:L " + arg1);
		PageFactory.initElements(driver, TemplatesPages.class);
		TemplatesPages.templateName.sendKeys(arg1);

	}

	@When("^I give the temp the discription \"([^\"]*)\"$")
	public void i_give_the_temp_the_discription(String arg1) throws Throwable {
		System.out.println("the value is:L " + arg1);
		PageFactory.initElements(driver, TemplatesPages.class);
		TemplatesPages.templateDescription.sendKeys(arg1);
	}

	@When("^I link it to SMS \"([^\"]*)\"$")
	public void i_link_it_to_SMS(String arg1) throws Throwable {
		PageFactory.initElements(driver, TemplatesPages.class);
		TemplatesPages.relatedSms.sendKeys(arg1);
	}

	@When("^I make the boy text \"([^\"]*)\"$")
	public void i_make_the_boy_text(String arg1) throws Throwable {
		System.out.println("-----arg1--------the value is: " + arg1);
		PageFactory.initElements(driver, TemplatesPages.class);
		TemplatesPages.templateEditorTab.click();
		TemplatesPages.smsBody.sendKeys(arg1);
		// TemplatesPages.pageZise.sendKeys("A4");
		// TemplatesPages.topMargin.sendKeys("20");
		// TemplatesPages.rightMargin.sendKeys("20");
		// TemplatesPages.bottomMargin.sendKeys("20");
		// TemplatesPages.leftMargin.sendKeys("20");
		// TemplatesPages.emailBody.sendKeys(arg1);
	}

	@Then("^I can save it as a \"([^\"]*)\" template placeholder$")
	public void i_can_save_it_as_a_template_placeholder(String arg1) throws Throwable {
		System.out.println("the value is:L " + arg1);
		TemplatesPages.saveDraftButton.click();
		WebDriverWait waitForMessage = new WebDriverWait(driver, 10000);
		CoreLoginPage.coreAdminUsignin_button = waitForMessage
				.until(ExpectedConditions.elementToBeClickable(TemplatesPages.successfullySaved));
		TemplatesPages.successfullySaved.getText().contains("is successfully saved!");
		System.out.println("This is after checking message successfuly saved!");
		// driver.quit();
	}

}
