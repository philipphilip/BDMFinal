package step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modules.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDMForm {
	public WebDriver driver;
	// public List<HashMap<String,String>> datamap = DataHelper.data();
	public static List<HashMap<String, String>> datamap = null;

	public BDMForm() {
		driver = Hooks.driver;

		datamap = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> sampleData = new HashMap<String, String>();
		sampleData.put("username", "abc@xyz.com");
		sampleData.put("password", "Test@123");
		System.out.println("Current data" + sampleData);
		datamap.add(sampleData);
	}

	@When("^I open Core website$")
	public void i_open_Core_website() throws Throwable {
		 driver.get("http://10.22.3.205/core/login");
	}

	@When("^I sign in$")
	public void i_sign_in() throws Throwable {
		PageFactory.initElements(driver, AutomationHomePage.class);
		PageFactory.initElements(driver, LoginPage.class);
		SignInAction.Execute(driver, datamap.get(0));
		
	}

	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
		SignoutAction.Execute(driver);
	}


	@When("^I open ePublic website$")
	public void i_open_ePublic_website() throws Throwable {
		driver.get("http://10.22.1.200/epublic/login");
	}

	@When("^I sign in ePublic$")
	public void i_sign_in_ePublic() throws Throwable {
		PageFactory.initElements(driver, AutomationHomePage.class);
		PageFactory.initElements(driver, EpublicLoginPage.class);
		EpublicSignInAction.Execute(driver, datamap.get(0));

	}

	@When("^I navigate to \"(.*?)\" in ePublic$")
	public void i_navigate_in_ePublic$(String arg1) throws Throwable {
		PageFactory.initElements(driver, EpublicControls.class);
		System.out.println("--------I am at the scenario where I nagigate to form " + arg1);
		if (arg1.equals("NOB")) {
			System.out.println("--------I am in the condition of running the NOB");
			GoToNOBForm.Execute(driver, arg1);
		} else if (arg1.equals("BRS")) {
			System.out.println("--------I am in the condition of running the BRS");
			GoToEpublicBRSForm.Execute(driver);
		} else if (arg1.equals("DRS")) {
			System.out.println("--------I am in the condition of running the DRS");
			GoToDRSForm.Execute(driver, arg1);
		} else if (arg1.equals("COD")) {
			System.out.println("--------I am in the condition of running the COD");
			GoToCODForm.Execute(driver);
		}
	}


	@When("^I fill in the \"(.*?)\" of BRS in epublic$")
	public void i_fill_brs_in_ePublic$(String arg1) throws Throwable {
		Thread.sleep(2000);
		System.out.println("--------I fill brs form in epublic " + arg1);
		if (arg1.equals("Child's details")) {
			System.out.println("--------I am in the condition of filling Child's details of BRS in epublic");
			FillEpublicBrsChildDetailForm.Execute(driver);
		}else if (arg1.equals("Parent details")) {
			System.out.println("--------I am in the condition of filling Parent details of BRS in epublic");
			FillEpublicBrsParentDetailForm.Execute(driver);
		}else if (arg1.equals("Second parent details")) {
			System.out.println("--------I am in the condition of filling Second parent details of BRS in epublic");
			FillEpublicBrsSecondParentDetailForm.Execute(driver);
		}else if (arg1.equals("Relationship details")) {
			System.out.println("--------I am in the condition of filling Relationship details of BRS in epublic");
			FillEpublicBrsRelationshipDetailForm.Execute(driver);
		}else if (arg1.equals("Second parent participation details")) {
			System.out.println("--------I am in the condition of filling Relationship details of BRS in epublic");
			FillEpublicBrsSecondParentParticipationDetailForm.Execute(driver);
		}else if (arg1.equals("Informant 1 details")) {
			System.out.println("--------I am in the condition of filling Informant 1 details of BRS in epublic");
			FillEpublicBrsInformant1DetailForm.Execute(driver);
		}




	}


	@When("^I click \"(.*?)\" button on \"(.*?)\" page of \"(.*?)\" in \"(.*?)\"$")
	public void i_click_button$(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		if (arg1.equals("Next")) {
			System.out.println("--------I am clicking Next button");
			Thread.sleep(2000);
			EpublicControls.nextButton.click();
		} else if (arg1.equals("Save")) {
			System.out.println("--------I am clicking Save button");
			Thread.sleep(2000);
			EpublicControls.saveButton.click();
		} else if (arg1.equals("DashBoard")) {
			System.out.println("--------I am clicking DashBoard button");
			Thread.sleep(3000);
			EpublicControls.dashBoard.click();
		} else if (arg1.equals("Continue")) {
			System.out.println("--------I am clicking Continue button");
			Thread.sleep(2000);
			EpublicControls.continueButton.click();
		} else if (arg1.equals("Close")) {
			System.out.println("--------I am clicking Continue button");
			Thread.sleep(2000);
			EpublicControls.closeButton.click();
		} else if (arg1.equals("Submit Order")) {
			System.out.println("--------I am clicking Submit Order button");
			Thread.sleep(2000);
			EpublicControls.submitOrderButton.click();
		} else if (arg1.equals("accept the terms and conditions")) {
			System.out.println("--------I am clicking accept the terms and conditions button");
			Thread.sleep(2000);
			EpublicControls.reviewDeclaration.click();
		} else if (arg1.equals("Submit")) {
			System.out.println("--------I am clicking Submit button");
			Thread.sleep(2000);
			EpublicControls.submitButton.click();
		}










	}

	@When("^I can see \"(.*?)\" on page$")
	public void i_can_see$(String arg1) throws Throwable {

		System.out.println("--------I am checking the message");
		Thread.sleep(1000);
		String result = EpublicControls.message.getText();

		Assert.assertTrue("result message not found", result.contains(arg1));

	}




	@When("^I navigate to \"(.*?)\" new form$")
	public void i_navigate_to_new_form(String arg1) throws Throwable {
		PageFactory.initElements(driver, CoreControls.class);
		System.out.println("--------I am at the scenario where I nagigate to form " + arg1);
		if (arg1.equals("NOB")) {
			System.out.println("--------I am in the condition of running the NOB");
			GoToNOBForm.Execute(driver, arg1);
		} else if (arg1.equals("BRS")) {
			System.out.println("--------I am in the condition of running the BRS");
			GoToBRSForm.Execute(driver);
		} else if (arg1.equals("DRS")) {
			System.out.println("--------I am in the condition of running the DRS");
			GoToDRSForm.Execute(driver, arg1);
		} else if (arg1.equals("COD")) {
			System.out.println("--------I am in the condition of running the COD");
			GoToCODForm.Execute(driver);
		}
	}

	@Then("^I fill in the \"([^\"]*)\" form$")
	public void i_fill_in_the_form(String arg1) throws Throwable {
		PageFactory.initElements(driver, CoreControls.class);
		if (arg1.equals("NOB")) {
			FillNOBForm.Execute(driver);
		} else if (arg1.equals("BRS")) {
			FillBRSForm.Execute(driver);
		} else if (arg1.equals("DRS")) {
			FillDRSForm.Execute(driver);
		} else if (arg1.equals("COD")) {
			FillCODForm.Execute(driver);
		}
	}

	@When("^I view errors on the form \"(.*?)\" form$")
	public void i_submit_blank_form(String arg1) throws Throwable {

		if (arg1.equals("NOB")) {
			PageFactory.initElements(driver, NOBPage.class);
			NOBPage.View_NOB_Form_Errors();

		} else if (arg1.equals("BRS")) {
			PageFactory.initElements(driver, BRSPage.class);
			BRSPage.view_BRS_Form_Errors();
		}

	}

	@Then("^I should Get all mandatory fields validation$")
	public void i_should_Get_all_mandatory_fields_validation() throws Throwable {

	}

}