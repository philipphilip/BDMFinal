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
		
		EregistryControls.validateItem(EregistryControls.validationErrorRow1,"Sex is required.","Deceased Details - Sex");
		EregistryControls.validateItem(EregistryControls.validationErrorRow2,"Age at death is required.","Deceased Details - Age at death");
		EregistryControls.validateItem(EregistryControls.validationErrorRow3,"Suburb/Town/City is required.","Deceased Details - Suburb/Town/City");
		EregistryControls.validateItem(EregistryControls.validationErrorRow4,"Date of Death Type is required.","Deceased Details - Date of Death Type");
		EregistryControls.validateItem(EregistryControls.validationErrorRow5,"Units is required.","Deceased Details - Units");
		EregistryControls.validateItem(EregistryControls.validationErrorRow6,"Given Names is required.","Deceased Details - Given Names");
		EregistryControls.validateItem(EregistryControls.validationErrorRow7,"Occupation during working life is required.","Deceased Details - Occupation during working life");
		EregistryControls.validateItem(EregistryControls.validationErrorRow8,"Aboriginal or Torres Strait Islander Origin? is required.",
				"Deceased Details - Aboriginal or Torres Strait Islander Origin?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow9,"Number of Children is required.","Children of the Deceased - Number of Children");
		EregistryControls.validateItem(EregistryControls.validationErrorRow10,"Occupation is required.","Parents of the Deceased - Occupation");
		EregistryControls.validateItem(EregistryControls.validationErrorRow11,"Given Names is required.","Parents of the Deceased - Given Names");
		EregistryControls.validateItem(EregistryControls.validationErrorRow12,"Relationship Status at time of Death is required.",
				"Deceased's Relationship Details - Relationship Status at time of Death");
		EregistryControls.validateItem(EregistryControls.validationErrorRow13,"Where did Death occur? is required.","Deceased Details - Where did Death occur?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow14,"Relationship To Subject is required.","Informant Details - Relationship To Subject");
		EregistryControls.validateItem(EregistryControls.validationErrorRow15,"Number of previous Marriages/Relationships is required.",
				"Deceased's Previous Relationship Details - Number of previous Marriages/Relationships");
		EregistryControls.validateItem(EregistryControls.validationErrorRow16,"Death Certified by is required.","Death Certification - Death Certified by");
		EregistryControls.validateItem(EregistryControls.validationErrorRow17,"Given Names is required.","Parents of the Deceased - Given Names");
		EregistryControls.validateItem(EregistryControls.validationErrorRow18,"Date of Birth Type is required.","Deceased Details - Date of Birth Type");
		EregistryControls.validateItem(EregistryControls.validationErrorRow19,"Given Names is required.","Informant Details - Given Names");
		EregistryControls.validateItem(EregistryControls.validationErrorRow20,"Method of Disposal? is required.","Disposal Details - Method of Disposal?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow21,"Occupation is required.","Parents of the Deceased - Occupation");
		EregistryControls.validateItem(EregistryControls.validationErrorRow22,"Was the deceased under 18 years of age? is required.",
				"Siblings of the Deceased - Was the deceased under 18 years of age?");
		
		Helper.clickItem(EregistryControls.backToFormButton);
	}
}
