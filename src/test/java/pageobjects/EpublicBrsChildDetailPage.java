package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpublicBrsChildDetailPage extends BaseClass {

	public EpublicBrsChildDetailPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "brs-childDetails-name-familyName")
	public static WebElement familyName;

	@FindBy(id = "brs-childDetails-name-firstGivenName")
	public static WebElement firstName;

	@FindBy(id = "brs-childDetails-childDetails-dateOfBirth")
	public static WebElement dateOfBirth;

	@FindBy(id = "brs-childDetails-childDetails-sexOfChild")
	public static WebElement sex;

	@FindBy(id = "brs-childDetails-childDetails-multipleBirth1")
	public static WebElement  multipleBirthNO;

	@FindBy(id = "brs-childDetails-childDetails-bornAlive0")
	public static WebElement bornAliveYes;

	@FindBy(id = "brs-childDetails-childDetails-wasTheChildBornInHospital0")
	public static WebElement hospitalYes;

	//@FindBy(xpath = "//*[@id=\\\"childDetails\\\"]/div/div[2]/div/div[3]/cge-dropdown-ref[1]/div/div[2]/cge-wrapped-select2/select2/span")
	@FindBy(id = "select2-brs-childDetails-childDetails-hospitalName-container")
	public static WebElement hospital;

	//@FindBy(id = "select2-brs-childDetails-childDetails-hospitalName-results")//*[@id="select2-brs-childDetails-childDetails-hospitalName-results"]/li[4]
	@FindBy(xpath = "//*[@id=\"select2-brs-childDetails-childDetails-hospitalName-results\"]/li[5]")
	public static WebElement hospitallist;

	//@FindBy(xpath = "//*[@id=\"childDetails\"]/div/div[2]/div/div[3]/cge-dropdown-ref[2]/div/div[2]/cge-wrapped-select2/select2/span")
	@FindBy(id = "brs-childDetails-childDetails-hospitalTownSuburbCity")
	public static WebElement hospitalSuburb;

	//@FindBy(id = "select2-brs-childDetails-childDetails-hospitalTownSuburbCity-results")
	@FindBy(xpath = "//*[@id=\"brs-childDetails-childDetails-hospitalTownSuburbCity\"]/option[2]")
	public static WebElement hospitalSuburblist;



}
