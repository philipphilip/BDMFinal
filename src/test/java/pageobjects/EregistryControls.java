package pageobjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.JOptionPane;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

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
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[31]/td[3]")
	public static WebElement validationErrorRow31;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[32]/td[3]")
	public static WebElement validationErrorRow32;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[33]/td[3]")
	public static WebElement validationErrorRow33;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[34]/td[3]")
	public static WebElement validationErrorRow34;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[35]/td[3]")
	public static WebElement validationErrorRow35;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[36]/td[3]")
	public static WebElement validationErrorRow36;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[37]/td[3]")
	public static WebElement validationErrorRow37;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[38]/td[3]")
	public static WebElement validationErrorRow38;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[39]/td[3]")
	public static WebElement validationErrorRow39;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[40]/td[3]")
	public static WebElement validationErrorRow40;
	
	@FindBy(xpath = "//*[@id=\"errorsInDetail\"]/tr[41]/td[3]")
	public static WebElement validationErrorRow41;
	
	@FindBy(xpath = ".//input[@value = 'Back to Form']")
	public static WebElement backToFormButton;
	
	@FindBy(name = "File name:")
	public static WebElement uploadPathAttachments;
	
	@FindBy(id = "actionMenu")
	public static WebElement actionList;
	
	@FindBy(xpath = ".//button[text()='Go']")
	public static WebElement goButton;
	
	@FindBy(id = "add-document-document-type")
	public static WebElement addDocumentType;
	
	@FindBy(id = "add-document-document-name")
	public static WebElement addDocumentName;
	
	@FindBy(id = "std-file-uploader")
	public static WebElement chooseFileButton;
	
	@FindBy(xpath = "//document-detail-component//alert/div")
	public static WebElement documentUploadSuccessMessage;
	
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
		InputStream inputStream = EregistryControls.class.getClassLoader().getResourceAsStream("testData/Attachment1.pdf");
	       System.out.println(inputStream);
	       
	       OutputStream outputStream;
	       try {
	    	   String userHome = System.getProperty("user.home");
	             outputStream = new FileOutputStream(new File( userHome+"/Attachment.pdf"));
	                          
	             
	             int read = 0;
	             byte[] bytes = new byte[1024];
	             
	             while ((read = inputStream.read(bytes)) != -1) {
	                    outputStream.write(bytes, 0, read);
	             }

	       } catch (FileNotFoundException e) {
	             e.printStackTrace();
	       } catch (IOException e) {
	            e.printStackTrace();
	       }

	}
	public static void main(String[] args) throws Throwable {
		InputStream inputStream = EregistryControls.class.getClassLoader().getResourceAsStream("testData/Attachment1.pdf");
	       System.out.println(inputStream);
	       
	       OutputStream outputStream;
	       try {
	    	   String userHome = System.getProperty("user.home");
	             outputStream = new FileOutputStream(new File( userHome+"/Attachment.pdf"));
	                          
	             
	             int read = 0;
	             byte[] bytes = new byte[1024];
	             
	             while ((read = inputStream.read(bytes)) != -1) {
	                    outputStream.write(bytes, 0, read);
	             }

	       } catch (FileNotFoundException e) {
	             e.printStackTrace();
	       } catch (IOException e) {
	            e.printStackTrace();
	       }

	}
}
