package pageobjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import step_definitions.Hooks;

public class EregistryControls extends BaseClass {

	public EregistryControls(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html/body/app/stakeholder/div/div/form/div[1]/select")
	public static WebElement stakeholderList;

	@FindBy(xpath = "//*/a[text()='Deaths']")
	public static WebElement deathsLink;

	@FindBy(xpath = "//*/a[text()='New Death Registration Statement']")
	public static WebElement drsLink;

	@FindBy(xpath = "//*/a[text()='Certificates']")
	public static WebElement certificatesLink;
	
	@FindBy(xpath = "//*/a[text()='New Certificate']")
	public static WebElement newCertificateLink;

	@FindBy(xpath = "//*/a[text()='Cause of Death']")
	public static WebElement codLink;

	@FindBy(xpath = "//*/a[text()='New Cause of Death']")
	public static WebElement newCodLink;

	@FindBy(xpath = "//*/a[text()='Draft List']")
	public static WebElement draftList;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/drs/div/div[2]/form/alert/div")
	public static WebElement drsMessage;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/cod/div/div[2]/form/alert/div")
	public static WebElement codMessage;
	
	@FindBy(xpath = "//error-list-display//alert/div")
	public static WebElement surrogacySaveMessage;

	@FindBy(id = "cod-draftList-deceasedFamilyName")
	public static WebElement codSearchFamilyName;
	
	@FindBy(id = "noticeOfBirth-draftList-birthMothersFamilyName")
	public static WebElement nobSearchFamilyName;

	@FindBy(id = "drs-draftList-deceasedFamilyName")
	public static WebElement drsSearchFamilyName;

	@FindBy(xpath = "//*[@id=\"compliantCodList\"]/div/div[1]/div/div/div")
	public static WebElement submitResultMessage;
	
	@FindBy(xpath = ".//input[@value = 'Next']")
	public static WebElement nextButton;
	
	@FindBy(xpath = ".//input[@value = 'Save']")
	public static WebElement saveButton;
	
	@FindBy(xpath = ".//input[@value = 'Refresh']")
	public static WebElement refreshButton;
	
	@FindBy(xpath = "//*[contains(@id, 'checkone')]")
	public static WebElement searchResult1;
	
	@FindBy(xpath = ".//input[@value = 'Submit']")
	public static WebElement submitButton;
	
	@FindBy(xpath = "//*[@id=\"compliantCodList\"]/div/div[1]/div/div/div")
	public static WebElement certificatesSubmitMessage;
	
	@FindBy(xpath = ".//input[@value = 'Make payment']")
	public static WebElement makePaymentButton;
	
	@FindBy(xpath = ".//input[@value = 'Make Payment']")
	public static WebElement makePaymentConfirmationButton;
	
	@FindBy(xpath = ".//input[@value = 'Start Payment']")
	public static WebElement startPaymentButton;
	
	@FindBy(xpath = ".//input[@value = 'Pay Now']")
	public static WebElement payNowButton;
	
	@FindBy(xpath = "//*/a[text()='Submitted List']")
	public static WebElement submitList;
	
	@FindBy(xpath = "//*/a[text()='Birth']")
	public static WebElement birthLink;
	
	@FindBy(xpath = "//*/a[text()='New Notice of Birth']")
	public static WebElement nobLink;
	
	@FindBy(xpath = ".//input[@value = 'Validate']")
	public static WebElement validateButton;
	
	@FindBy(xpath = "//*/a[text()='Adoption']")
	public static WebElement adoptionLink;
	
	@FindBy(xpath = "//*/a[text()='New Adoption Notification']")
	public static WebElement newAdoptionNotificationLink;
	
	@FindBy(id = "an-draftList-childsFamilyName")
	public static WebElement adoptionSearchFamilyName;
	
	@FindBy(xpath = "//*/a[text()='Surrogacy']")
	public static WebElement surrogacyLink;
	
	@FindBy(xpath = "//*/a[text()='New Surrogacy Notification']")
	public static WebElement newSurrogacyNotificationLink;
	
	@FindBy(id = "sn-draftList-childsFamilyName")
	public static WebElement surrogacySearchFamilyName;
	
	//Validation Page Objects
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[1]/td[3]")
	public static WebElement validationErrorRow1;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[2]/td[3]")
	public static WebElement validationErrorRow2;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[3]/td[3]")
	public static WebElement validationErrorRow3;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[4]/td[3]")
	public static WebElement validationErrorRow4;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[5]/td[3]")
	public static WebElement validationErrorRow5;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[6]/td[3]")
	public static WebElement validationErrorRow6;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[7]/td[3]")
	public static WebElement validationErrorRow7;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[8]/td[3]")
	public static WebElement validationErrorRow8;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[9]/td[3]")
	public static WebElement validationErrorRow9;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[10]/td[3]")
	public static WebElement validationErrorRow10;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[11]/td[3]")
	public static WebElement validationErrorRow11;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[12]/td[3]")
	public static WebElement validationErrorRow12;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[13]/td[3]")
	public static WebElement validationErrorRow13;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[14]/td[3]")
	public static WebElement validationErrorRow14;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[15]/td[3]")
	public static WebElement validationErrorRow15;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[16]/td[3]")
	public static WebElement validationErrorRow16;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[17]/td[3]")
	public static WebElement validationErrorRow17;

	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[18]/td[3]")
	public static WebElement validationErrorRow18;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[19]/td[3]")
	public static WebElement validationErrorRow19;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[20]/td[3]")
	public static WebElement validationErrorRow20;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[21]/td[3]")
	public static WebElement validationErrorRow21;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[22]/td[3]")
	public static WebElement validationErrorRow22;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[23]/td[3]")
	public static WebElement validationErrorRow23;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[24]/td[3]")
	public static WebElement validationErrorRow24;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[25]/td[3]")
	public static WebElement validationErrorRow25;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[26]/td[3]")
	public static WebElement validationErrorRow26;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[27]/td[3]")
	public static WebElement validationErrorRow27;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[28]/td[3]")
	public static WebElement validationErrorRow28;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[29]/td[3]")
	public static WebElement validationErrorRow29;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[30]/td[3]")
	public static WebElement validationErrorRow30;
	
	@FindBy(xpath = ".//input[@value = 'Back to Form']")
	public static WebElement backToFormButton;
	
	private static SoftAssert softAssert = new SoftAssert();
	
	public static void validateItem(WebElement item, String message, String sectionField) throws Throwable {
		String text = item.getText();
		if (text.equals(message)) {
			System.out.println("'" + sectionField + "'" + " field has passed the mandatory condition.");
		} else {
			softAssert.assertEquals(text, message, "'" + sectionField + "'" + " field has failed the mandatory condition.");
		}
	}
	
	public static void assertAll() throws Throwable {
		softAssert.assertAll();
	}
	
	public static void uploadAttachmentToLocal() throws Throwable {
		InputStream inputStream = EregistryControls.class.getClassLoader().getResourceAsStream("Attachment1.pdf");
	       System.out.println(inputStream);
	       
	       OutputStream outputStream;
	       try {
	             outputStream = new FileOutputStream(new File("C:/Tests/Attachment.pdf"));
	                          
	             
	             int read = 0;
	             byte[] bytes = new byte[1024];
	             
	             while ((read = inputStream.read(bytes)) != -1) {
	                    outputStream.write(bytes, 0, read);
	             }

	       } catch (FileNotFoundException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	       } catch (IOException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	       }

	}
}
