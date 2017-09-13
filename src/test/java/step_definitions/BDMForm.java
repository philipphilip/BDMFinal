package step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Helper;
import modules.EpublicSignInAction;
import modules.EregistrySignInAction;
import modules.FillApplicationCoreSearchForm;
import modules.FillBCApplicationForm;
import modules.FillBRSCoreSearchForm;
import modules.FillBRSForm;
import modules.FillCODCoreSearchForm;
import modules.FillCODForm;
import modules.FillDCApplicationForm;
import modules.FillDRSCoreSearchForm;
import modules.FillDRSForm;
import modules.FillEregistryCertificatesForm;
import modules.FillEregistryCodForm;
import modules.FillEregistryDrsForm;
import modules.FillMCApplicationForm;
import modules.FillMNForm;
import modules.FillNOBForm;
import modules.FillePublicApplicationCoreSearchForm;
import modules.FilltheApplicationInEpublic;
import modules.FilltheBRSInEpublic;
import modules.GoToApplicationForm;
import modules.GoToApplicationInePublic;
import modules.GoToBRSForm;
import modules.GoToBRSInePublic;
import modules.GoToCODForm;
import modules.GoToDRSForm;
import modules.GoToMNForm;
import modules.GoToNOBForm;
import modules.SearchAndMakeCodCompliant;
import modules.SearchAndMakeDrsCompliant;
import modules.SearchForMNAndMakeMR;
import modules.SearchforBRCreated;
import modules.SearchforCreatedDeathCertificate;
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

	@When("^I open \"(.*?)\" website$")
	public void i_open_website(String website) throws Throwable {
		if (website.equals("ePublic")) {
			driver.get("https://web-st.objectconsulting.com.au/epublic/");
		} else if (website.equals("ePublic Dev")) {
			driver.get("http://10.22.1.15/epublic/login");
		} else if (website.equals("eRegistry Dev")) {
			driver.get("http://10.22.1.15/eregistry/login");
		} else if (website.equals("Core Dev")) {
			driver.get("http://10.22.1.15/core/login");
		} else if (website.equals("Core")) {
			driver.get("https://web-st.objectconsulting.com.au/core/login");
		} else {
			driver.get("https://web-st.objectconsulting.com.au/eregistry/");
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
		} else if (website.equals("Core")) {
			SignoutAction.Execute(driver);
		}
	}

	@When("^I navigate to \"(.*?)\" in \"(.*?)\"$")
	public void i_navigate_in_ePublic$(String tab, String site) throws Throwable {

		if (site.equals("ePublic")) {
			if (tab.equals("BRS")) {
				GoToBRSInePublic.Execute(driver);
			} else if (tab.equals("Application")) {
				GoToApplicationInePublic.Execute(driver);
			}
		} else if (site.equals("Core")) {
			if (tab.equals("Search DRS")) {
				WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
				CoreControls.searchTab = waitForTabsMenue
						.until(ExpectedConditions.elementToBeClickable(CoreControls.searchTab));
				CoreControls.searchTab.click();
				CoreControls.drsSearch.click();
			} else if (tab.equals("Search COD")) {
				WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
				CoreControls.searchTab = waitForTabsMenue
						.until(ExpectedConditions.elementToBeClickable(CoreControls.searchTab));
				CoreControls.searchTab.click();
				CoreControls.codSearch.click();
			} else if (tab.equals("Search Item Id")) {
				WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
				CoreControls.searchTab = waitForTabsMenue
						.until(ExpectedConditions.elementToBeClickable(CoreControls.searchTab));
				CoreControls.searchTab.click();
				CoreControls.idSearch.click();
			} else if (tab.equals("Search BRS")) {
				WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
				CoreControls.searchTab = waitForTabsMenue
						.until(ExpectedConditions.elementToBeClickable(CoreControls.searchTab));
				CoreControls.searchTab.click();
				CoreControls.brsSearch.click();
			} else if (tab.equals("Search Application")) {
				WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
				CoreControls.searchTab = waitForTabsMenue
						.until(ExpectedConditions.elementToBeClickable(CoreControls.searchTab));
				CoreControls.searchTab.click();
				CoreControls.applicationQuickSearch.click();
			}
		} else if (site.equals("eRegistry")) {
			if (tab.equals("DRS")) {
				Helper.clickItem(EregistryControls.deathsLink);
				Helper.clickItem(EregistryControls.drsLink);
			} else if (tab.equals("COD")) {
				Helper.clickItem(EregistryControls.codLink);
				Helper.clickItem(EregistryControls.newCodLink);
			} else if (tab.equals("Certificates")) {
				Helper.clickItem(EregistryControls.certificatesLink);
				Helper.clickItem(EregistryControls.newCertificateLink);
			}

		}
	}

	@Then("^I can fill and submit the \"([^\"]*)\" form in \"([^\"]*)\"$")
	public void i_can_fill_and_submit_the_form_in(String form, String site) throws Throwable {
		if (site.equals("ePublic")) {
			if (form.equals("BRS")) {
				FilltheBRSInEpublic.Execute(driver);
			} else if (form.equals("Application")) {
				FilltheApplicationInEpublic.Execute(driver);
			}
		}

		if (site.equals("eRegistry")) {
			if (form.equals("DRS")) {
				FillEregistryDrsForm.Execute(driver);
			} else if (form.equals("COD")) {
				FillEregistryCodForm.Execute(driver);
			} else if (form.equals("Certificates")) {
				FillEregistryCertificatesForm.Execute(driver);
			}
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
		Helper.clickItem(EregistryControls.submitButton);
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
		} else if (formName.equals("COD")) {
			FillCODForm.Execute(driver);
		} else if (formName.equals("DRS")) {
			FillDRSForm.Execute(driver);
		} else if (formName.equals("DR")) {
			SearchforCreatedDeathCertificate.Execute(driver);
		} else if (formName.equals("MN")) {
			FillMNForm.Execute(driver);
		} else if (formName.equals("MR")) {
			SearchForMNAndMakeMR.Execute(driver);
		} else if (formName.equals("Application")) {
			FillDCApplicationForm.Execute(driver);
		} else if (formName.equals("Birth Application")) {
			FillBCApplicationForm.Execute(driver);
		} else if (formName.equals("Marriage Certificate request")) {
			FillMCApplicationForm.Execute(driver);
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

	@Then("^I search for \"([^\"]*)\" form created in \"([^\"]*)\"$")
	public void i_search_for_form(String form, String site) throws Throwable {

		if (site.equals("eRegistry")) {
			if (form.equals("DRS")) {
				FillDRSCoreSearchForm.Execute(driver);
			} else if (form.equals("COD")) {
				FillCODCoreSearchForm.Execute(driver);
			} else if (form.equals("Application")) {
				FillApplicationCoreSearchForm.Execute(driver);
			}
		}
		if (site.equals("ePublic")) {
			if (form.equals("BRS")) {
				FillBRSCoreSearchForm.Execute(driver);
			} else if (form.equals("Application")) {
				FillePublicApplicationCoreSearchForm.Execute(driver);
			}
		}
	}

	@Then("^I search for \"([^\"]*)\" form and make it compliant$")
	public void i_search_for_form_and_make_it_compliant(String form) throws Throwable {

		if (form.equals("DRS")) {
			SearchAndMakeDrsCompliant.Execute(driver);
		} else if (form.equals("COD")) {
			SearchAndMakeCodCompliant.Execute(driver);
		}
	}

}