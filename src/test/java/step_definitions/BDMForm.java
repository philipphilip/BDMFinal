package step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import helpers.Helper;
import modules.EpublicSignInAction;
import modules.EregistrySignInAction;
import modules.FillBCApplicationForm;
import modules.FillBRSForm;
import modules.FillCODForm;
import modules.FillCoreBrsFormForBr;
import modules.FillCoreNobFormForBr;
import modules.FillDCApplicationForm;
import modules.FillDRSForm;
import modules.FillEpublicApplicationApplicantDetailForm;
import modules.FillEpublicApplicationPaymentDetailForm;
import modules.FillEpublicApplicationSubjectDetailForm;
import modules.FillEpublicBrsChildDetailForm;
import modules.FillEpublicBrsInformant1DetailForm;
import modules.FillEpublicBrsParentDetailForm;
import modules.FillEpublicBrsRelationshipDetailForm;
import modules.FillEpublicBrsSecondParentDetailForm;
import modules.FillEpublicBrsSecondParentParticipationDetailForm;
import modules.FillEregistryCodForm;
import modules.FillEregistryDrsForm;
import modules.FillMNForm;
import modules.FillNOBForm;
import modules.FilltheApplicationInEpublic;
import modules.FilltheBRSInEpublic;
import modules.GoToApplicationForm;
import modules.GoToApplicationInePublic;
import modules.GoToBRSForm;
import modules.GoToBRSInePublic;
import modules.GoToBRSInePublicDev;
import modules.GoToCODForm;
import modules.GoToDRSForm;
import modules.GoToMNForm;
import modules.GoToNOBForm;
import modules.SearchForMNAndMakeMR;
import modules.SearchforBRCreated;
import modules.SignInAction;
import modules.SignoutAction;
import pageobjects.AutomationHomePage;
import pageobjects.CoreBrsPage;
import pageobjects.CoreControls;
import pageobjects.CoreLoginPage;
import pageobjects.CoreNobPage;
import pageobjects.CoreSearchBirthsPage;
import pageobjects.EpublicControls;
import pageobjects.EpublicLoginPage;
import pageobjects.EregistryControls;
import pageobjects.EregistryLoginPage;

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

		PageFactory.initElements(driver, AutomationHomePage.class);
		PageFactory.initElements(driver, CoreSearchBirthsPage.class);
		PageFactory.initElements(driver, CoreLoginPage.class);
		PageFactory.initElements(driver, CoreControls.class);
		PageFactory.initElements(driver, CoreNobPage.class);
		PageFactory.initElements(driver, CoreBrsPage.class);
		PageFactory.initElements(driver, EpublicLoginPage.class);
		PageFactory.initElements(driver, EpublicControls.class);
		PageFactory.initElements(driver, EregistryLoginPage.class);
		PageFactory.initElements(driver, EregistryControls.class);

	}

	// static String st2 = "10.22.3.205";
	// static String st3 = "10.22.1.200";
	// static String fat = "52.64.152.134";

	@When("^I open \"(.*?)\" website$")
	public void i_open_website(String website) throws Throwable {
		// String base_url = st3;
		if (website.equals("ePublic")) {
			driver.get("http://10.22.1.200/epublic/login");
			//driver.get("http://52.64.152.134/epublic/login");
		// Adding Core, ePublic and eRegistry Development environments for smoke tests to deploy to System Test environment
		} else if (website.equals("ePublic Dev")) {
			driver.get("http://10.22.1.15/epublic/login");
		} else if (website.equals("eRegistry Dev")) {
			driver.get("http://10.22.1.15/eregistry/login");
		} else if (website.equals("Core Dev")) {
			driver.get("http://10.22.1.15/core/login");
		} else if (website.equals("Core")) {
			driver.get("http://10.22.1.200/core/login");
		} else {
			//driver.get("http://52.64.152.134/eregistry/login");
			driver.get("http://10.22.1.200/eregistry/login");
		}
		driver.manage().window().maximize();
	}

	@When("^I login \"(.*?)\" as user \"(.*?)\" password \"(.*?)\"$")
	public void i_sign_user(String website, String user, String password) throws Throwable {
		if (website.equals("Core")) {

			CoreLoginPage.username.sendKeys(user);
			CoreLoginPage.password.sendKeys(password);
			CoreLoginPage.signin_button.click();

		}
	}

	@When("^I logout from \"(.*?)\"$")
	public void i_sign_user(String website) throws Throwable {
		if (website.equals("Core")) {

			Helper.clickItem(CoreLoginPage.sign_out);

		}
	}

	@When("^I open Core website$")
	public void i_open_Core_website() throws Throwable {
		// driver.get("http://10.22.3.205/core/login");
		driver.get("http://10.22.1.200/core/login");
		// driver.get("http://52.64.152.134/core/login");
		// driver.get("http://10.22.1.110/core/login");
		driver.manage().window().maximize();
	}

	@When("^I sign in$")
	public void i_sign_in() throws Throwable {
		SignInAction.Execute(driver, datamap.get(0));
	}

	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
		SignoutAction.Execute(driver);
	}

	@When("^I sign in \"(.*?)\"")
	public void i_sign_in_site(String website) throws Throwable {
		if (website.equals("ePublic")) {
			EpublicSignInAction.Execute(driver, datamap.get(0));
		} else if (website.equals("eRegistry")) {
			EregistrySignInAction.Execute(driver, datamap.get(0));
		}

	}

	@When("^I navigate to \"(.*?)\" in \"(.*?)\"$")
	public void i_navigate_in_ePublic$(String tab, String site) throws Throwable {
		System.out.println("--------I am at the scenario where I nagigate to form " + tab);

		if (site.equals("ePublic")) {
			if (tab.equals("BRS")) {
			GoToBRSInePublic.Execute(driver);
			} else if (tab.equals("Application")) {
			  GoToApplicationInePublic.Execute(driver);
			}
		} else {
			if (tab.equals("DRS")) {
				System.out.println("--------I am in the condition of running the DRS");
				Helper.clickItem(EregistryControls.deathsLink);
				Helper.clickItem(EregistryControls.drsLink);
			} else if (tab.equals("DRS draft list")) {
				System.out.println("--------I am in the condition of going to DRS draft list");
				Helper.clickItem(EregistryControls.deathsLink);
				Helper.clickItem(EregistryControls.drsDraftList);
			} else if (tab.equals("Cause of Death")) {
				System.out.println("--------I am in the condition of going to Cause of Death");
				Helper.clickItem(EregistryControls.codLink);
				Helper.clickItem(EregistryControls.newCodLink);
			} else if (tab.equals("COD draft list")) {
				System.out.println("--------I am in the condition of going to COD draft list");
				Helper.clickItem(EregistryControls.codLink);
				Helper.clickItem(EregistryControls.codDraftList);
			}

		}
	}

	@When("^I fill in the \"(.*?)\" of \"(.*?)\" in \"(.*?)\"$")
	public void i_fill_form$(String page, String form, String site) throws Throwable {

		// System.out.println("--------I fill " + form + " form in " + site + "
		// page: " + page);
		if (site.toLowerCase().equals("epublic".toLowerCase())) {
			if (form.equals("BRS")) {
				if (page.equals("Child's details")) {
					System.out.println("--------I am in the condition of filling Child's details of BRS in epublic");
					FillEpublicBrsChildDetailForm.Execute(driver);
				} else if (page.equals("Parent details")) {
					System.out.println("--------I am in the condition of filling Parent details of BRS in epublic");
					FillEpublicBrsParentDetailForm.Execute(driver);
				} else if (page.equals("Second parent details")) {
					System.out.println(
							"--------I am in the condition of filling Second parent details of BRS in epublic");
					FillEpublicBrsSecondParentDetailForm.Execute(driver);
				} else if (page.equals("Relationship details")) {
					System.out
							.println("--------I am in the condition of filling Relationship details of BRS in epublic");
					FillEpublicBrsRelationshipDetailForm.Execute(driver);
				} else if (page.equals("Second parent participation details")) {
					System.out
							.println("--------I am in the condition of filling Relationship details of BRS in epublic");
					FillEpublicBrsSecondParentParticipationDetailForm.Execute(driver);
				} else if (page.equals("Informant 1 details")) {
					System.out
							.println("--------I am in the condition of filling Informant 1 details of BRS in epublic");
					FillEpublicBrsInformant1DetailForm.Execute(driver);
				} else if (page.equals("Informant 1 details")) {
					System.out
							.println("--------I am in the condition of filling Informant 1 details of BRS in epublic");
					FillEpublicBrsInformant1DetailForm.Execute(driver);
				}
			} else if (form.equals("application")) {
				if (page.equals("Applicant details")) {
					System.out.println(
							"--------I am in the condition of filling Applicant details of application in epublic");
					FillEpublicApplicationApplicantDetailForm.Execute(driver);
				} else if (page.equals("Subject details")) {
					System.out.println(
							"--------I am in the condition of filling Subject details of application in epublic");
					FillEpublicApplicationSubjectDetailForm.Execute(driver);
				} else if (page.equals("Payment details")) {
					System.out.println(
							"--------I am in the condition of filling Payment details of application in epublic");
					FillEpublicApplicationPaymentDetailForm.Execute(driver);
				}

			}

		} else if (site.equals("eregistry")) {
			if (page.equals("DRS")) {
				System.out.println("--------I am in the condition of filling DRS in eregistry");
				FillEregistryDrsForm.Execute(driver);
			} else if (page.equals("COD")) {
				System.out.println("--------I am in the condition of filling COD in eregistry");
				FillEregistryCodForm.Execute(driver);
			}
		} else if (site.equals("Core")) {
			if (form.equals("BR")) {
				if (page.equals("BRS")) {
					FillCoreBrsFormForBr.Execute(driver);
				} else if (page.equals("NOB")) {
					FillCoreNobFormForBr.Execute(driver);
				}
			}
		}

	}

	@Then("^I can fill and submit the \"([^\"]*)\" form$")
	public void i_can_fill_and_submit_the_form(String form) throws Throwable {
		if (form.equals("BRS")) {
		FilltheBRSInEpublic.Execute(driver);
		} else if (form.equals("Application")) {
		FilltheApplicationInEpublic.Execute(driver);
		}
	}
	
	
	

	@Then("^I select \"(.*?)\" in \"(.*?)\" dropdown list on \"(.*?)\" page of \"(.*?)\" in \"(.*?)\"$")
	public void i_select_dropdown(String value, String dropDoneListName, String page, String function, String site)
			throws Throwable {
		if (site.equals("Core")) {

			if (dropDoneListName.equals("Reason Code")) {
				Helper.selectDropDownList(CoreControls.coreBrsReasonCodeList, value);
			} else if (dropDoneListName.equals("Action List")) {
				Helper.selectDropDownList(CoreControls.actionList, value);
			}

		}
	}

	@Then("^I input \"(.*?)\" in field with id \"(.*?)\" in \"(.*?)\"$")
	public void i_input_by_id(String value, String id, String site) throws Throwable {
		Helper.inputById(id, value);
	}

	@Then("^I input \"(.*?)\" in \"(.*?)\" input on \"(.*?)\" page of \"(.*?)\" in \"(.*?)\"$")
	public void i_input(String value, String inputName, String page, String function, String site) throws Throwable {
		if (site.equals("Core")) {

			if (inputName.equals("Comments")) {
				Helper.inputItem(CoreControls.coreBrsReasonComments, value);
			}
		}
	}

	@Then("^I select stakeholder as \"(.*?)\"$")
	public void i_select_stakeholder(String stakeholder) throws Throwable {
		Helper.selectDropDownList(EregistryControls.stakeholderList, stakeholder);
		Helper.clickItem(EregistryControls.submit);
	}

	@When("^I click \"(.*?)\" item by id \"(.*?)\" in \"(.*?)\"$")
	public void i_click_link_by_text$(String item, String id, String site) throws Throwable {
		Helper.clickById(id);
	}

	@When("^I click \"(.*?)\" link in \"(.*?)\"$")
	public void i_click_link_by_text$(String linkText, String site) throws Throwable {
		Helper.clickLinkByText(linkText);
	}

	@When("^I click \"(.*?)\" button in \"(.*?)\"$")
	public void i_click_button_by_text$(String buttonText, String site) throws Throwable {
		System.out.println("================the value of buttonText is: " + buttonText);
		Helper.clickButtonByText(buttonText);
	}

	@When("^I click \"(.*?)\" button on \"(.*?)\" page of \"(.*?)\" in \"(.*?)\"$")
	public void i_click_button$(String buttonName, String pageName, String area, String site) throws Throwable {
		if (site.equals("Core")) {

			if (area.equals("br")) {
				if (buttonName.equals("Validate")) {
					Helper.clickItem(CoreControls.coreBrsValidateButton);
				} else if (buttonName.equals("Exception List")) {
					Helper.clickItem(CoreControls.coreBrsExceptionListCheckBox);
				} else if (buttonName.equals("Override")) {
					Helper.clickItem(CoreControls.coreBrsExceptionOverrideButton);
				} else if (buttonName.equals("Do Override")) {
					Helper.clickItem(CoreControls.coreBrsDoOverrideButton);
				} else if (buttonName.equals("Check For Duplicates")) {
					Helper.clickItem(CoreControls.coreBrsCheckForDuplicatesButton);
				} else if (buttonName.equals("Proceed to Death Check")) {
					Helper.clickItem(CoreControls.coreBrsProceedToDeathCheckButton);
				} else if (buttonName.equals("Submit")) {
					Helper.clickItem(CoreControls.coreBrsSubmitButton);
				} else if (buttonName.equals("Search")) {
					Helper.clickItem(CoreSearchBirthsPage.nobSearchButton);
				} else if (buttonName.equals("First NOB Search Result")) {
					Helper.clickItem(CoreControls.coreNobFirstSearchResult);
				} else if (buttonName.equals("Go")) {
					Helper.clickItem(CoreControls.go);
				}

			}

		} else if (site.equals("epublic")) {
			if (buttonName.equals("Next")) {
				System.out.println("--------I am clicking Next button");

				Helper.clickItem(EpublicControls.nextButton);
			} else if (buttonName.equals("Save")) {
				System.out.println("--------I am clicking Save button");

				Helper.clickItem(EpublicControls.saveButton);
			} else if (buttonName.equals("DashBoard")) {
				System.out.println("--------I am clicking DashBoard button");

				Helper.clickItem(EpublicControls.proceedButton);
			} else if (buttonName.equals("Continue")) {
				System.out.println("--------I am clicking Continue button");

				Helper.clickItem(EpublicControls.continueButton);
			} else if (buttonName.equals("Close")) {
				System.out.println("--------I am clicking Continue button");

				Helper.clickItem(EpublicControls.closeButton);
			} else if (buttonName.equals("Submit Order")) {
				System.out.println("--------I am clicking Submit Order button");

				Helper.clickItem(EpublicControls.submitOrderButton);

			} else if (buttonName.equals("Checkout")) {
				System.out.println("--------I am clicking Checkout button");

				Helper.clickItem(EpublicControls.checkoutButton);

			} else if (buttonName.equals("accept the terms and conditions")) {
				System.out.println("--------I am clicking accept the terms and conditions button");

				Helper.clickItem(EpublicControls.reviewDeclaration);
			} else if (buttonName.equals("Submit")) {
				System.out.println("--------I am clicking Submit button");

				Helper.clickItem(EpublicControls.submitButton);
			}
		} else if (site.equals("eregistry")) {
			if (area.equals("Drs")) {
				if (buttonName.equals("Refresh")) {
					System.out.println("--------I am clicking Refresh button");

					Helper.clickItem(EregistryControls.drsSearchRefreshButton);
				} else if (buttonName.equals("searchResult")) {
					System.out.println("--------I am clicking searchResult");

					Helper.clickItem(EregistryControls.drsSearchResult1);
				} else if (buttonName.equals("Submit Drs")) {
					System.out.println("--------I am clicking Submit");

					Helper.clickItem(EregistryControls.submitDrsButton);
				} else if (buttonName.equals("Confirm Submit")) {
					System.out.println("--------I am clicking Confirm Submit");

					Helper.clickItem(EregistryControls.submitConfirmButton);
				}
			} else if (area.equals("cod")) {
				if (buttonName.equals("Refresh")) {
					System.out.println("--------I am clicking Refresh button");

					Helper.clickItem(EregistryControls.codSearchRefreshButton);
				} else if (buttonName.equals("searchResult")) {
					System.out.println("--------I am clicking searchResult");

					Helper.clickItem(EregistryControls.codSearchResult1);
				} else if (buttonName.equals("Submit cod")) {
					System.out.println("--------I am clicking Submit");

					Helper.clickItem(EregistryControls.submitCodButton);
				} else if (buttonName.equals("Confirm Submit")) {
					System.out.println("--------I am clicking Confirm Submit");

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
		} else if (site.equals("Core")) {
			if (page.equals("core nob search")) {
				if (field.equals("Mother First Name")) {
					Helper.inputItem(CoreSearchBirthsPage.mothersFirstName, value);
				}
			}
		}

	}

	@When("^I can see \"(.*?)\" on \"(.*?)\" page of \"(.*?)\"$")
	public void i_can_see$(String text, String page, String site) throws Throwable {
		System.out.println("--------I am checking the message");
		String result = "";

		if (site.equals("epublic")) {
			if (page.equals("brs Submit result")) {
				Helper.checkText(EpublicControls.brsSubmitResult, text);
				Helper.clickItem(EpublicControls.noCertificate);
			} else if (page.equals("application payment result")) {
				Helper.checkText(EpublicControls.paymentResult, text);
			} else {
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
		} else if (site.equals("Core")) {
			if (page.equals("br")) {
				Helper.checkText(CoreControls.coreResultMessage, text);
			}
		}
	}

	@When("^I navigate to \"(.*?)\" new form$")
	public void i_navigate_to_new_form(String arg1) throws Throwable {

		Thread.sleep(2000);
		if (arg1.equals("NOB")) {
			GoToNOBForm.Execute(driver, arg1);
		} else if (arg1.equals("BRS")) {
			GoToBRSForm.Execute(driver);
		} else if (arg1.equals("DRS")) {
			GoToDRSForm.Execute(driver, arg1);
		} else if (arg1.equals("COD")) {
			GoToCODForm.Execute(driver);
		} else if (arg1.equals("MN")) {
			GoToMNForm.Execute(driver);
		} else if (arg1.equals("Application")) {
			GoToApplicationForm.Execute(driver);
		}
	}

	@Then("^I fill in the \"([^\"]*)\" form$")
	public void i_fill_in_the_form(String formName) throws Throwable {
		if (formName.equals("NOB")) {
			FillNOBForm.Execute(driver);
		} else if (formName.equals("BRS")) {
			FillBRSForm.Execute(driver);
		} else if (formName.equals("BR")) {
			SearchforBRCreated.Execute(driver);
		} else if (formName.equals("DRS")) {
			FillDRSForm.Execute(driver);
		} else if (formName.equals("COD")) {
			FillCODForm.Execute(driver);
		} else if (formName.equals("MN")) {
			FillMNForm.Execute(driver);
		} else if (formName.equals("MR")) {
			SearchForMNAndMakeMR.Execute(driver);
		} else if (formName.equals("Application")) {
			FillDCApplicationForm.Execute(driver);
		} else if (formName.equals("Birth Application")) {
			FillBCApplicationForm.Execute(driver);
		}
	}

	@When("^I view errors on the form \"(.*?)\" form$")
	public void i_submit_blank_form(String arg1) throws Throwable {

		if (arg1.equals("NOB")) {
			CoreNobPage.View_NOB_Form_Errors();
		} else if (arg1.equals("BRS")) {
			CoreBrsPage.view_BRS_Form_Errors();
		}
	}

	@Then("^I should Get all mandatory fields validation$")
	public void i_should_Get_all_mandatory_fields_validation() throws Throwable {
	}

}