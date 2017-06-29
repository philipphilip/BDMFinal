package step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modules.FillBRSForm;
import modules.FillCODForm;
import modules.FillDRSForm;
import modules.FillNOBForm;
import modules.GoToBRSForm;
import modules.GoToCODForm;
import modules.GoToDRSForm;
import modules.GoToNOBForm;
import modules.SignInAction;
import modules.SignoutAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.AutomationHomePage;
import pageobjects.BRSPage;
import pageobjects.CoreControls;
import pageobjects.LoginPage;
import pageobjects.NOBPage;
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