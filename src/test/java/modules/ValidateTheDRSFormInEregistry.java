package modules;

import helpers.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.EregistryControls;


public class ValidateTheDRSFormInEregistry {
	
	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryControls.class);
			
		WebDriverWait waitForValidateButton = new WebDriverWait(driver, 10000);
		EregistryControls.validateButton = waitForValidateButton
				.until(ExpectedConditions.elementToBeClickable(EregistryControls.validateButton));

		Helper.clickItem(EregistryControls.validateButton);
		
		WebDriverWait waitForBackToFormButton = new WebDriverWait(driver, 10000);
		EregistryControls.backToFormButton = waitForBackToFormButton
				.until(ExpectedConditions.elementToBeClickable(EregistryControls.backToFormButton));
		
		EregistryControls.validateItem(EregistryControls.validationErrorRow1,"Parent 2 Given Name is required.","Parents of the Deceased - Given Names");
		EregistryControls.validateItem(EregistryControls.validationErrorRow2,"Informant Residential Address Suburb/Town/City is required."
				,"Informant Details - Residential Address Suburb/Town/City");
		EregistryControls.validateItem(EregistryControls.validationErrorRow3,"Postal Address Line 1 is required.","Informant Details - Postal Address Line 1");
		EregistryControls.validateItem(EregistryControls.validationErrorRow4,"Informant email address or telephone is required."
				,"Informant Details - Informant email address or telephone");
		EregistryControls.validateItem(EregistryControls.validationErrorRow5,"Postal Address Postcode is required."
				,"Informant Details - Postal Address Postcode");
		EregistryControls.validateItem(EregistryControls.validationErrorRow6,"Informant Residential Address Line 1 is required."
				,"Informant Details - Residential Address Line 1");
		EregistryControls.validateItem(EregistryControls.validationErrorRow7,"Suburb/Town/City is required.","Deceased Details - Suburb/Town/City");
		EregistryControls.validateItem(EregistryControls.validationErrorRow8,"Date of Disposal or when the deceased remains are sent overseas is required."
				,"Disposal Details - Date of Disposal or when the deceased remains are sent overseas");
		EregistryControls.validateItem(EregistryControls.validationErrorRow9,"Were Deceased remains disposed off within 30 days of death? cannot be blank"
				,"Disposal Details - Were Deceased remains disposed off within 30 days of death?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow10,"Address Line 1 is required.","Deceased Details - Address Line 1");
		EregistryControls.validateItem(EregistryControls.validationErrorRow11,"Postal Address Suburb/Town/City is required."
				,"Informant Details - Postal Address Suburb/Town/City");
		EregistryControls.validateItem(EregistryControls.validationErrorRow12,"Informant Residential Address Postcode is required."
				,"Informant Details - Residential Address Postcode");
		EregistryControls.validateItem(EregistryControls.validationErrorRow13,"Postcode is required.","Deceased Details - Postcode");
		EregistryControls.validateItem(EregistryControls.validationErrorRow14,"Age at death is required.","Deceased Details - Age at death");
		EregistryControls.validateItem(EregistryControls.validationErrorRow15,"Given Name is required.","Deceased Details - Given Name");
		EregistryControls.validateItem(EregistryControls.validationErrorRow16,"Occupation during working life is required."
				,"Deceased Details - Occupation during working life");
		EregistryControls.validateItem(EregistryControls.validationErrorRow17,"Number of Children is required."
				,"Children of the Deceased - Number of Children");
		EregistryControls.validateItem(EregistryControls.validationErrorRow18,"Occupation is required.","Parents of the Deceased - Occupation");
		EregistryControls.validateItem(EregistryControls.validationErrorRow19,"Relationship Status at time of Death is required."
				,"Deceased's Relationship Details - Relationship Status at time of Death");
		EregistryControls.validateItem(EregistryControls.validationErrorRow20,"Is the current family name the same as the family name at birth? is required."
				,"Parent 1 of Deceased - Is the current family name the same as the family name at birth?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow21,"Relationship To Subject is required.","Informant Details - Relationship To Subject");
		EregistryControls.validateItem(EregistryControls.validationErrorRow22,"Death Certified by is required.","Death Certification - Death Certified by");
		EregistryControls.validateItem(EregistryControls.validationErrorRow23,"Date of Birth Type is required.","Deceased Details - Date of Birth Type");
		EregistryControls.validateItem(EregistryControls.validationErrorRow24,"Sex is required.","Deceased Details - Sex");
		EregistryControls.validateItem(EregistryControls.validationErrorRow25,"Suburb/Town/City is required.","Deceased Details - Suburb/Town/City");
		EregistryControls.validateItem(EregistryControls.validationErrorRow26,"Is the current family name the same as the family name at birth? is required."
				,"Deceased Details - Is the current family name the same as the family name at birth?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow27,"Date of Death Type is required.","Deceased Details - Date of Death Type");
		EregistryControls.validateItem(EregistryControls.validationErrorRow28,"Units is required.","Deceased Details - Units");
		EregistryControls.validateItem(EregistryControls.validationErrorRow29,"Aboriginal or Torres Strait Islander Origin? is required."
				,"Deceased Details - Aboriginal or Torres Strait Islander Origin?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow30,"Given Name is required.","Parents of the Deceased - Given Name");
		EregistryControls.validateItem(EregistryControls.validationErrorRow31,"Where did Death occur? is required.","Deceased Details - Where did Death occur?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow32,"Number of previous Marriages/Relationships is required."
				,"Deceased's Previous Relationship Details - Number of previous Marriages/Relationships");
		EregistryControls.validateItem(EregistryControls.validationErrorRow33,"Is the current family name the same as the family name at birth? is required."
				,"Parent 2 of Deceased - Is the current family name the same as the family name at birth?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow34,"Given Name is required.","Parents of the Deceased - Given Name");
		EregistryControls.validateItem(EregistryControls.validationErrorRow35,"Given Name is required.","Informant Details - Given Name");
		EregistryControls.validateItem(EregistryControls.validationErrorRow36,"Method of Disposal? is required.","Disposal Details - Method of Disposal?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow37,"Occupation is required.","Parents of the Deceased - Occupation");
		EregistryControls.validateItem(EregistryControls.validationErrorRow38,"Was the deceased under 18 years of age? is required."
				,"Siblings of the Deceased - Was the deceased under 18 years of age?");

		Helper.clickItem(EregistryControls.backToFormButton);
	}
}
