package step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.CODPage;
import pageobjects.CoreControls;
import pageobjects.LoginPage;
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

	private static String baseURL = "http://10.22.1.200/admin/home";

	@Given("^I am on CORE Admin site$")
	public void i_am_on_CORE_Admin_site() throws Throwable {
		driver.get(baseURL);
		PageFactory.initElements(driver, LoginPage.class);
		WebDriverWait waitForLoginPage = new WebDriverWait(driver, 10000);
		LoginPage.coreAdminUsignin_button = waitForLoginPage
				.until(ExpectedConditions.elementToBeClickable(LoginPage.coreAdminUsignin_button));
		LoginPage.coreAdminUsername.sendKeys("admin");
		LoginPage.coreAdminUpassword.sendKeys("a");
		LoginPage.coreAdminUsignin_button.click();

	}

	@When("^I want to create a \"([^\"]*)\" template$")
	public void i_want_to_create_a_template(String arg1) throws Throwable {
		PageFactory.initElements(driver, CoreControls.class);

		// WebDriverWait waitForMeanuTabs = new WebDriverWait(driver, 10000);
		// CoreControls.templateManagement = waitForMeanuTabs
		// .until(ExpectedConditions.elementToBeClickable(CoreControls.templateManagement));
		System.out.println("------------before clicking menue tab");
		// CoreControls.templateManagement.click();
		PageFactory.initElements(driver, TemplatesPages.class);
		if (arg1.equals("SMS corro")) {
			PageFactory.initElements(driver, TemplatesPages.class);
			CoreControls.corroTemp.click();
			WebDriverWait waitForCreateButton = new WebDriverWait(driver, 100000);
			CoreControls.templateManagement = waitForCreateButton
					.until(ExpectedConditions.elementToBeClickable(TemplatesPages.createNewCorroTemplate));
			TemplatesPages.createNewCorroTemplate.click();
			TemplatesPages.templateType.sendKeys("SMS");
		} else if (arg1.equals("Email corro")) {
			System.out.println("------------Inside email loop");
			WebDriverWait waitForMeanuTabs = new WebDriverWait(driver, 10000);
			CoreControls.templateManagement = waitForMeanuTabs
					.until(ExpectedConditions.elementToBeClickable(CoreControls.templateManagement));
			CoreControls.templateManagement.click();
			WebDriverWait waitForCorroTempButtonButton = new WebDriverWait(driver, 100000);
			CoreControls.templateManagement = waitForCorroTempButtonButton
					.until(ExpectedConditions.elementToBeClickable(CoreControls.corroTemp));
			CoreControls.corroTemp.click();
			WebDriverWait waitForCreateButton = new WebDriverWait(driver, 10000);
			CoreControls.templateManagement = waitForCreateButton
					.until(ExpectedConditions.elementToBeClickable(TemplatesPages.createNewCorroTemplate));
			TemplatesPages.createNewCorroTemplate.click();
			TemplatesPages.templateType.sendKeys("Email");
			TemplatesPages.emailSubSystem.sendKeys("CBDM Core");
			TemplatesPages.appBbeforeSending.sendKeys("No");
		} else if (arg1.equals("certificates")) {
			CoreControls.certificatesTemp.click();
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

	@When("^I make the \"([^\"]*)\" body text \"([^\"]*)\"$")
	public void i_make_the(String arg1, String arg2) throws Throwable {
		System.out.println("-----arg1--------the value is: " + arg1);
		System.out.println("-----arg2--------the value is: " + arg2);
		PageFactory.initElements(driver, TemplatesPages.class);
		TemplatesPages.templateEditorTab.click();
		if (arg1.equals("SMS")) {
			TemplatesPages.smsBody.sendKeys(arg2);
		} else if (arg1.equals("Email")) {
			TemplatesPages.pageZise.sendKeys("A4");
			TemplatesPages.topMargin.sendKeys("20");
			TemplatesPages.rightMargin.sendKeys("20");
			TemplatesPages.bottomMargin.sendKeys("20");
			TemplatesPages.leftMargin.sendKeys("20");
			TemplatesPages.emailBody.sendKeys(arg2);

		}

	}

	@Then("^I can save it as a \"([^\"]*)\" template placeholder$")
	public void i_can_save_it_as_a_template_placeholder(String arg1) throws Throwable {
		System.out.println("the value is:L " + arg1);
		TemplatesPages.saveDraftButton.click();
		WebDriverWait waitForMessage = new WebDriverWait(driver, 10000);
		LoginPage.coreAdminUsignin_button = waitForMessage
				.until(ExpectedConditions.elementToBeClickable(TemplatesPages.successfullySaved));
		TemplatesPages.successfullySaved.getText().contains("is successfully saved!");
		System.out.println("This is after checking message successfuly saved!");
		// driver.quit();
	}

}
