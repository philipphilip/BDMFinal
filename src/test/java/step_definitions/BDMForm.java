package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import helpers.Helper;
import modules.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import modules.FillCODForm;
import modules.FillDRSForm;
import modules.FillMRForm;
import modules.FillNOBForm;
import modules.GoToBRSForm;
import modules.GoToCODForm;
import modules.GoToDRSForm;
import modules.GoToMRForm;
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
	// public List<HashMap<String, String>> datamap = DataHelper.data();
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
		// driver.get("http://10.22.3.205/core/login");
		driver.get("http://52.64.152.134/core/dashboard");
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

	static String st3 = "10.22.1.200";
	static String fat = "52.64.152.134";

	@When("^I open \"(.*?)\" website$")
	public void i_open_website(String website) throws Throwable {
		if (website.equals("ePublic")) {
			driver.get("http://" + st3 + "/epublic/login");
		} else if (website.equals("eRegistry")) {
			driver.get("http://" + st3 + "/eregistry/login");
		}
	}

	@When("^I sign in \"(.*?)\"")
	public void i_sign_in_site(String website) throws Throwable {
		if (website.equals("ePublic")) {
			PageFactory.initElements(driver, EpublicLoginPage.class);
			EpublicSignInAction.Execute(driver, datamap.get(0));
		} else if (website.equals("eRegistry")) {
			PageFactory.initElements(driver, EregistryLoginPage.class);
			EregistrySignInAction.Execute(driver, datamap.get(0));
		}

	}

	@When("^I navigate to \"(.*?)\" in \"(.*?)\"$")
	public void i_navigate_in_ePublic$(String tab, String site) throws Throwable {
		PageFactory.initElements(driver, EpublicControls.class);
		PageFactory.initElements(driver, EregistryControls.class);
		System.out.println("--------I am at the scenario where I nagigate to form " + tab);
		if (site.equals("ePublic")) {
			if (tab.equals("BRS")) {
				System.out.println("--------I am in the condition of running the BRS");
				System.out.println("--------after waiting for 'briths New' tab to load------------");
				Helper.clickItem(EpublicControls.briths_tab);
				System.out.println("--------after trying to click 'briths New' tab------------");
				Helper.clickItem(EpublicControls.BRS_form);
				Helper.clickItem(EpublicControls.i_agree);
			}
		} else if (site.equals("eRegistry")) {
			if (tab.equals("DRS")) {
				System.out.println("--------I am in the condition of running the DRS");
				// Thread.sleep(2000);
				Helper.clickItem(EregistryControls.deathsLink);
				Helper.clickItem(EregistryControls.drsLink);
			} else if (tab.equals("DRS draft list")) {
				System.out.println("--------I am in the condition of going to DRS draft list");
				// Thread.sleep(2000);
				Helper.clickItem(EregistryControls.deathsLink);
				Helper.clickItem(EregistryControls.drsDraftList);
			} else if (tab.equals("Cause of Death")) {
				System.out.println("--------I am in the condition of going to Cause of Death");
				// Thread.sleep(2000);
				Helper.clickItem(EregistryControls.codLink);
				Helper.clickItem(EregistryControls.newCodLink);
			} else if (tab.equals("COD draft list")) {
				System.out.println("--------I am in the condition of going to COD draft list");
				// Thread.sleep(2000);
				Helper.clickItem(EregistryControls.codLink);
				Helper.clickItem(EregistryControls.codDraftList);
			}

		}
	}

	@When("^I fill in the \"(.*?)\" of \"(.*?)\" in \"(.*?)\"$")
	public void i_fill_form$(String page, String form, String site) throws Throwable {
		// Thread.sleep(3000);

		System.out.println("--------I fill " + form + " form in " + site + " page: " + page);
		if (site.equals("epublic")) {
			if (page.equals("Child's details")) {
				System.out.println("--------I am in the condition of filling Child's details of BRS in epublic");
				FillEpublicBrsChildDetailForm.Execute(driver);
			} else if (page.equals("Parent details")) {
				System.out.println("--------I am in the condition of filling Parent details of BRS in epublic");
				FillEpublicBrsParentDetailForm.Execute(driver);
			} else if (page.equals("Second parent details")) {
				System.out.println("--------I am in the condition of filling Second parent details of BRS in epublic");
				FillEpublicBrsSecondParentDetailForm.Execute(driver);
			} else if (page.equals("Relationship details")) {
				System.out.println("--------I am in the condition of filling Relationship details of BRS in epublic");
				FillEpublicBrsRelationshipDetailForm.Execute(driver);
			} else if (page.equals("Second parent participation details")) {
				System.out.println("--------I am in the condition of filling Relationship details of BRS in epublic");
				FillEpublicBrsSecondParentParticipationDetailForm.Execute(driver);
			} else if (page.equals("Informant 1 details")) {
				System.out.println("--------I am in the condition of filling Informant 1 details of BRS in epublic");
				FillEpublicBrsInformant1DetailForm.Execute(driver);
			}
		} else if (site.equals("eregistry")) {
			if (page.equals("DRS")) {
				System.out.println("--------I am in the condition of filling DRS in eregistry");
				FillEregistryDrsForm.Execute(driver);
			} else if (page.equals("COD")) {
				System.out.println("--------I am in the condition of filling COD in eregistry");
				FillEregistryCodForm.Execute(driver);
			}
		}

	}

	@Then("^I select stakeholder as \"(.*?)\"$")
	public void i_select_stakeholder(String stakeholder) throws Throwable {
		PageFactory.initElements(driver, EregistryControls.class);
		// Thread.sleep(2000);
		Helper.selectDropDownList(EregistryControls.stakeholderList, stakeholder);
		// Thread.sleep(1000);
		Helper.clickItem(EregistryControls.submit);
	}

	@When("^I click \"(.*?)\" button on \"(.*?)\" page of \"(.*?)\" in \"(.*?)\"$")
	public void i_click_button$(String buttonName, String pageName, String area, String site) throws Throwable {
		if (site.equals("epublic")) {
			if (buttonName.equals("Next")) {
				System.out.println("--------I am clicking Next button");
				// Thread.sleep(2000);
				Helper.clickItem(EpublicControls.nextButton);
			} else if (buttonName.equals("Save")) {
				System.out.println("--------I am clicking Save button");
				// Thread.sleep(3000);
				Helper.clickItem(EpublicControls.saveButton);
			} else if (buttonName.equals("DashBoard")) {
				System.out.println("--------I am clicking DashBoard button");
				// Thread.sleep(5000);
				Helper.clickItem(EpublicControls.proceedButton);
			} else if (buttonName.equals("Continue")) {
				System.out.println("--------I am clicking Continue button");
				// Thread.sleep(2000);
				Helper.clickItem(EpublicControls.continueButton);
			} else if (buttonName.equals("Close")) {
				System.out.println("--------I am clicking Continue button");
				// Thread.sleep(2000);
				Helper.clickItem(EpublicControls.closeButton);
			} else if (buttonName.equals("Submit Order")) {
				System.out.println("--------I am clicking Submit Order button");
				// Thread.sleep(4000);
				Helper.clickItem(EpublicControls.submitOrderButton);

			} else if (buttonName.equals("Checkout")) {
				System.out.println("--------I am clicking Checkout button");
				// Thread.sleep(5000);
				Helper.clickItem(EpublicControls.checkoutButton);

			} else if (buttonName.equals("accept the terms and conditions")) {
				System.out.println("--------I am clicking accept the terms and conditions button");
				// Thread.sleep(5000);
				Helper.clickItem(EpublicControls.reviewDeclaration);
			} else if (buttonName.equals("Submit")) {
				System.out.println("--------I am clicking Submit button");
				// Thread.sleep(2000);
				Helper.clickItem(EpublicControls.submitButton);
			}
		} else if (site.equals("eregistry")) {
			if (area.equals("Drs")) {
				if (buttonName.equals("Refresh")) {
					System.out.println("--------I am clicking Refresh button");
					// Thread.sleep(2000);
					Helper.clickItem(EregistryControls.drsSearchRefreshButton);
				} else if (buttonName.equals("searchResult")) {
					System.out.println("--------I am clicking searchResult");
					// Thread.sleep(2000);
					Helper.clickItem(EregistryControls.drsSearchResult1);
				} else if (buttonName.equals("Submit Drs")) {
					System.out.println("--------I am clicking Submit");
					// Thread.sleep(2000);
					Helper.clickItem(EregistryControls.submitDrsButton);
				} else if (buttonName.equals("Confirm Submit")) {
					System.out.println("--------I am clicking Confirm Submit");
					// Thread.sleep(2000);
					Helper.clickItem(EregistryControls.submitConfirmButton);
				}
			} else if (area.equals("cod")) {
				if (buttonName.equals("Refresh")) {
					System.out.println("--------I am clicking Refresh button");
					// Thread.sleep(2000);
					Helper.clickItem(EregistryControls.codSearchRefreshButton);
				} else if (buttonName.equals("searchResult")) {
					System.out.println("--------I am clicking searchResult");
					// Thread.sleep(2000);
					Helper.clickItem(EregistryControls.codSearchResult1);
				} else if (buttonName.equals("Submit cod")) {
					System.out.println("--------I am clicking Submit");
					// Thread.sleep(2000);
					Helper.clickItem(EregistryControls.submitCodButton);
				} else if (buttonName.equals("Confirm Submit")) {
					System.out.println("--------I am clicking Confirm Submit");
					// Thread.sleep(2000);
					Helper.clickItem(EregistryControls.submitConfirmButton);
				}
			}

		}
	}

	@When("^I input \"(.*?)\" in \"(.*?)\" on \"(.*?)\" page of \"(.*?)\"$")
	public void i_can_see$(String value, String field, String page, String site) throws Throwable {
		if (value.startsWith("@")) {
			String name = value.substring(1);
			value = DataHelper.getStoredData(name);
		}
		if (site.equals("eregistry")) {
			if (page.equals("drs draft search")) {
				if (field.equals("Deceased's Family Name")) {
					EregistryControls.drsSearchFamilyName.sendKeys(value);
				}
			} else if (page.equals("cod draft search")) {
				if (field.equals("Deceased's Family Name")) {
					EregistryControls.codSearchFamilyName.sendKeys(value);
				}
			}

		}

	}

	@When("^I can see \"(.*?)\" on \"(.*?)\" page of \"(.*?)\"$")
	public void i_can_see$(String text, String page, String site) throws Throwable {

		System.out.println("--------I am checking the message");
		// Thread.sleep(2000);

		String result = "";

		if (site.equals("epublic")) {
			if (page.equals("brs Submit result")) {
				// Thread.sleep(3000);
				Helper.checkText(EpublicControls.brsSubmitResult, text);
			} else {
				// Thread.sleep(1000);
				Helper.checkText(EpublicControls.message, text);
			}

		} else if (site.equals("eregistry")) {
			if (page.equals("drs Submit result")) {
				Helper.checkText(EregistryControls.submitResultMessage, text);
			} else if (page.equals("cod Submit result")) {
				Helper.checkText(EregistryControls.submitResultMessage, text);
			} else if (page.equals("Drs")) {
				Helper.checkText(EregistryControls.drsMessage, text);
			} else if (page.equals("COD")) {
				Helper.checkText(EregistryControls.codMessage, text);
			}
		}

	}

	@When("^I navigate to \"(.*?)\" new form$")
	public void i_navigate_to_new_form(String arg1) throws Throwable {
		PageFactory.initElements(driver, CoreControls.class);
		System.out.println("--------I am at the scenario where I nagigate to form " + arg1);
		Thread.sleep(2000);
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
		} else if (arg1.equals("MR")) {
			System.out.println("--------I am in the condition of running the MR");
			GoToMRForm.Execute(driver, arg1);
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
		} else if (arg1.equals("MR")) {
			FillMRForm.Execute(driver);
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