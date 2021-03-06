package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Helper;
import modules.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
		} else if (website.equals("Core Admin UI")) {
			driver.get("https://web-st.objectconsulting.com.au/admin/login");
		} else if (website.equals("eRegistry")) {
			driver.get("https://web-st.objectconsulting.com.au/eregistry/");
		} else if (website.equals("Core Old UI")) {
			driver.get("https://core-st.objectconsulting.com.au/cbdm/login");
		} else if (website.equals("Core Demo")) {
			driver.get("http://10.22.1.42/core/login");
		} else if (website.equals("ePublic Demo")) {
			driver.get("http://10.22.1.42/epublic/");
		} else if (website.equals("eRegistry Demo")) {
			driver.get("http://10.22.1.42/eregistry/");
		} else if (website.equals("Core Config")) {
			driver.get("http://10.22.1.110/core/login");
		} else if (website.equals("Core SIT")) {
			driver.get("http://www.sit.rio.bdm.vic.gov.au/core/login");
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

	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
		SignoutAction.Execute(driver);
	}

	@When("^I sign in \"(.*?)\"")
	public void i_sign_in_site(String website) throws Throwable {
		if (website.equals("ePublic")) {
			EpublicSignInAction.Execute(driver);
		} else if (website.equals("eRegistry")) {
			EregistrySignInAction.Execute(driver);
		} else if (website.equals("Core Admin UI")) {
			CoreAdminSignInAction.Execute(driver);
		} else if (website.equals("Core")) {
			SignInAction.Execute(driver);
		} else if (website.equals("Core Old UI")) {
			CoreOldUISignInAction.Execute(driver);
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
				Helper.waitFor(CoreControls.searchTab);
				CoreControls.searchTab.click();
				CoreControls.drsSearch.click();
			} else if (tab.equals("Search COD")) {
				Helper.waitFor(CoreControls.searchTab);
				CoreControls.searchTab.click();
				CoreControls.codSearch.click();
			} else if (tab.equals("Search Item Id")) {
				Helper.waitFor(CoreControls.searchTab);
				CoreControls.searchTab.click();
				CoreControls.idSearch.click();
			} else if (tab.equals("Search BRS")) {
				Helper.waitFor(CoreControls.searchTab);
				CoreControls.searchTab.click();
				CoreControls.birthsQuickSearch.click();
			} else if (tab.equals("Search Application")) {
				Helper.waitFor(CoreControls.searchTab);
				CoreControls.searchTab.click();
				CoreControls.applicationQuickSearch.click();
			} else if (tab.equals("Search AN")) {
				Helper.waitFor(CoreControls.searchTab);
				CoreControls.searchTab.click();
				CoreControls.adoptionNotificationSearch.click();
			} else if (tab.equals("Search SN")) {
				Helper.waitFor(CoreControls.searchTab);
				CoreControls.searchTab.click();
				CoreControls.surrogacyQuickSearch.click();
			} else if (tab.equals("Search RR")) {
				Helper.waitFor(CoreControls.searchTab);
				CoreControls.searchTab.click();
				CoreControls.relationshipRegistrationSearch.click();
			} else if (tab.equals("Search DR")) {
				Helper.waitFor(CoreControls.searchTab);
				CoreControls.searchTab.click();
				CoreControls.deathRegistrationSearch.click();
			}
		} else if (site.equals("eRegistry")) {
			if (tab.equals("DRS")) {
				Helper.clickItem(EregistryControls.deathsLink);
				EregistryControls.drsLink.click();
			} else if (tab.equals("NOB")) {
				Helper.clickItem(EregistryControls.birthLink);
				EregistryControls.nobLink.click();
			} else if (tab.equals("COD")) {
				Helper.clickItem(EregistryControls.codLink);
				EregistryControls.newCodLink.click();
			} else if (tab.equals("AN")) {
				Helper.clickItem(EregistryControls.adoptionLink);
				EregistryControls.newAdoptionNotificationLink.click();
			} else if (tab.equals("SN")) {
				Helper.clickItem(EregistryControls.surrogacyLink);
				EregistryControls.newSurrogacyNotificationLink.click();
			} else if (tab.equals("Certificates")) {
				Helper.clickItem(EregistryControls.certificatesLink);
				EregistryControls.newCertificateLink.click();
			}

		} else if (site.equals("Core Admin UI")) {
			if (tab.equals("Create internal user")) {
				Helper.waitFor(CoreControls.userTab);
				CoreControls.userTab.click();
				CoreControls.internalUsersLink.click();
				Helper.clickItem(CoreControls.createNewCoreUserButton);
			} else if (tab.equals("Create Correspondence Template")) {
				Helper.waitFor(CoreControls.templateManagement);
				Helper.clickItem(CoreControls.templateManagement);
				Helper.clickItem(CoreControls.correpondenceTemplatesLink);
				Helper.waitFor(CoreControls.createNewTemplateButton);
				Helper.clickItem(CoreControls.createNewTemplateButton);
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
			} else if (form.equals("NOB")) {
				FillEregistryNobForm.Execute(driver);
			} else if (form.equals("AN")) {
				FillEregistryANForm.Execute(driver);
			} else if (form.equals("SN")) {
				FillEregistrySNForm.Execute(driver);
			}
		}

		if (site.equals("Core Admin UI")) {
			if (form.equals("Create internal user")) {
				FillCreateInternalUserForm.Execute(driver);
			} else if (form.equals("Create SMS & EMail correspondence templates")) {
				FillSMSEmailCorrespondenceForm.Execute(driver);
			}
		}

		if (site.equals("ePublic Dev")) {
			if (form.equals("BRS")) {
				FilltheBRSInEpublicDev.Execute(driver);
			}
		}
	}

	@Then("^I select stakeholder as \"(.*?)\"$")
	public void i_select_stakeholder(String stakeholder) throws Throwable {
		Helper.waitFor(EregistryControls.stakeholderList);
		Helper.selectDropDownList(EregistryControls.stakeholderList, stakeholder);
		Helper.clickItem(EregistryControls.submitButton);
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
		} else if (arg1.equals("New Product")) {
			GotToNewProductForm.Execute(driver);
		} else if (arg1.equals("Change of Name")) {
			GoToCONFor.Execute(driver);
		} else if (arg1.equals("Change of Sex Notification")) {
			GoToCOSForm.Execute(driver);
		} else if (arg1.equals("System Parameters")) {
			GoToSystemParameters.Execute(driver);
		} else if (arg1.equals("RN")) {
			GoToRNForm.Execute(driver);
		} else if (arg1.equals("Adoption Notification")) {
			GoToAdoptionForm.Execute(driver);
		}
	}

	@Then("^I can validate the \"([^\"]*)\" form$")
	public void i_can_validate_the_form(String arg1) throws Throwable {
		if (arg1.equals("COD in eRegistry")) {
			ValidateTheCODFormInEregistry.Execute(driver);
		} else if (arg1.equals("DRS in eRegistry")) {
			ValidateTheDRSFormInEregistry.Execute(driver);
		} else if (arg1.equals("Vic Born Adult CON Blank")) {
			ValidateTheCONForVicAdult.Execute(driver);
		} else if (arg1.equals("Overseas Born Adolt CON Blan")) {
			ValidateTheCONForOverseasAdult.Execute(driver);
		} else if (arg1.equals("Overseas Born Child CON Blank")) {
			ValidateTheCONForOverseasChild.Execute(driver);
		} else if (arg1.equals("Vic Born Child CON Blank")) {
			ValidateTheCONForVicChild.Execute(driver);
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
		} else if (formName.equals("Death Application")) {
			FillDCApplicationForm.Execute(driver);
		} else if (formName.equals("Birth Application")) {
			FillBCApplicationForm.Execute(driver);
		} else if (formName.equals("Marriage Certificate request")) {
			FillMCApplicationForm.Execute(driver);
		} else if (formName.equals("New Product")) {
			FillNewProductForm.Execute(driver);
		} else if (formName.equals("Change of Name")) {
			FillCONForm.Execute(driver);
		} else if (formName.equals("Change of Sex")) {
			FillCOSForm.Execute(driver);
		} else if (formName.equals("Relationship Application")) {
			FillRRSApplicationForm.Execute(driver);
		} else if (formName.equals("Relationship Registration Parameter")) {
			FillRelationshipRegistrationParameterForm.Execute(driver);
		} else if (formName.equals("RN")) {
			FillRNForm.Execute(driver);
		} else if (formName.equals("NOB for Tasks")) {
			FillNOBFormForTasks.Execute(driver);
		} else if (formName.equals("COS Reg Service")) {
			FillCOSRegForm.Execute(driver);
		} else if (formName.equals("BRS for SMS & Email correspondence")) {
			FillBRSForSMSAndEmailCorrespondenceForm.Execute(driver);
		} else if (formName.equals("Adoption Notification")) {
			FillAdoptionForm.Execute(driver);
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
			} else if (form.equals("AN")) {
				FillANCoreSearchForm.Execute(driver);
			} else if (form.equals("SN")) {
				FillSNCoreSearchForm.Execute(driver);
			} else if (form.equals("DR")) {
				FillDRCoreSearchForm.Execute(driver);
			}
		}
		if (site.equals("ePublic")) {
			if (form.equals("BRS")) {
				FillBRSCoreSearchForm.Execute(driver);
			} else if (form.equals("Application")) {
				FillePublicApplicationCoreSearchForm.Execute(driver);
			}
		}
		if (site.equals("Core")) {
			if (form.equals("RR")) {
				FillRRCoreSearchForm.Execute(driver);
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