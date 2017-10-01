package modules;

import helpers.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.EregistryControls;


public class ValidateTheCODFormInEregistry {
	
	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryControls.class);
			
		WebDriverWait waitForValidateButton = new WebDriverWait(driver, 10000);
		EregistryControls.validateButton = waitForValidateButton
				.until(ExpectedConditions.elementToBeClickable(EregistryControls.validateButton));

		Helper.clickItem(EregistryControls.validateButton);
		
		WebDriverWait waitForBackToFormButton = new WebDriverWait(driver, 10000);
		EregistryControls.backToFormButton = waitForBackToFormButton
				.until(ExpectedConditions.elementToBeClickable(EregistryControls.backToFormButton));
		
		EregistryControls.validateItem(EregistryControls.validationErrorRow1,"Given Name is required.","Deceased Details - Given Names");
		EregistryControls.validateItem(EregistryControls.validationErrorRow2,"Was post mortem held? is required.","Supporting Information - Was post mortem held?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow3,"Is the current family name the same as the family name at birth? is required.",
				"Deceased Details - Is the current family name the same as the family name at birth?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow4,"Other is required.","Ability to accurately advise Cause of Death - Other");
		EregistryControls.validateItem(EregistryControls.validationErrorRow5,"Number of Disease or conditions directly leading to death is required.",
				"Cause of Death - Number of Disease or conditions directly leading to death");
		EregistryControls.validateItem(EregistryControls.validationErrorRow6,"I have referenced the cause of death with the deceased's complete medical history is required.",
				"Ability to accurately advise Cause of Death - I have referenced the cause of death with the deceased's complete medical history");
		EregistryControls.validateItem(EregistryControls.validationErrorRow7,"How did you confirm the name of the deceased? is required.",
				"Deceased Details - How did you confirm the name of the deceased?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow8,"Cause of Death Type is required.","Additional Notification Details - Cause of Death Type");
		EregistryControls.validateItem(EregistryControls.validationErrorRow9,"I have detailed knowledge of the circumstances surrounding this death is required.",
				"Ability to accurately advise Cause of Death - I have detailed knowledge of the circumstances surrounding this death");
		EregistryControls.validateItem(EregistryControls.validationErrorRow10,"Number of Antecedent causes is required.","Cause of Death - Number of Antecedent causes");
		EregistryControls.validateItem(EregistryControls.validationErrorRow11,"Date of Birth Type is required.","Deceased Details - Date of Birth Type");
		EregistryControls.validateItem(EregistryControls.validationErrorRow12,"Sex is required.","Deceased Details - Sex");
		EregistryControls.validateItem(EregistryControls.validationErrorRow13,"Who is organising the disposal of the deceased remains is required.",
				"Supporting Information - Who is organising the disposal of the deceased remains");
		EregistryControls.validateItem(EregistryControls.validationErrorRow14,
				"Is this death a reportable or reviewable death in accordance with sections 10 or 13 of the Coroners act 2008? is required.",
				"Eligibility to State Cause of Death - Is this death a reportable or reviewable death in accordance with sections 10 or 13 of the Coroners act 2008?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow15,"Where did Death occur? is required.","Place of Death - Where did Death occur?");
		EregistryControls.validateItem(EregistryControls.validationErrorRow16,"Date of birth is required.","Deceased Details - Date of birth");
		EregistryControls.validateItem(EregistryControls.validationErrorRow17,"Given Name is required.","Deceased Details - Given Names");
//		EregistryControls.assertAll();
		
		Helper.clickItem(EregistryControls.backToFormButton);
	}
}
