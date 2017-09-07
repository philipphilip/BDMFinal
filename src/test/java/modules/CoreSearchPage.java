package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageobjects.BaseClass;

public class CoreSearchPage extends BaseClass {

	public CoreSearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "deceasedDetails-name-familyName")
	public static WebElement deceasedFamilyName;
	
	@FindBy(id = "deceasedDetails-name-deceasedName-familyName")
	public static WebElement deceasedFamilyNameCod;
	
	@FindBy (id = "childsDetails-name-familyName")
	public static WebElement brsChildFamilyName;
	
	@FindBy(xpath = ".//button-panel//input[@value='Search']")
	public static WebElement searchButton;
	
	@FindBy(xpath = ".//search-results//div/a")
	public static WebElement firstSearchResult;
	
	@FindBy(xpath = ".//id-search-results//div/a")
	public static WebElement firstIdSearchResult;
	
	@FindBy(xpath = "//*[@id=\"deceasedDetails\"]//name-group/cge-text-input[1]/div/div")
	public static WebElement deceasedFamilyNameCheck;
	
	@FindBy(xpath = "//*[@id=\"statusBox\"]/div[2]/a")
	public static WebElement notificationId;
	
	@FindBy(xpath = "//*[@id=\"statusBox\"]/div[3]")
	public static WebElement notificationStatus;
	
	@FindBy(id = "itemNumber")
	public static WebElement itemNumber;
	
	@FindBy(id = "itemYear")
	public static WebElement itemYear;

}
