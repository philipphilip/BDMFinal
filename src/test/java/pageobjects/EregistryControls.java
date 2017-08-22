package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EregistryControls extends BaseClass {

	public EregistryControls(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html/body/app/stakeholder/div/div/form/div[1]/select")
	//changed xpath from "/html/body/app/stakeholder/div/form/div/select" to "/html/body/app/stakeholder/div/div/form/div[1]/select"
	public static WebElement stakeholderList;

	@FindBy(xpath = "/html/body/app/stakeholder/div/div/form/div[2]/input")
	//changed xpath from "/html/body/app/stakeholder/div/form/div/input" to "/html/body/app/stakeholder/div/div/form/div[2]/input"
	public static WebElement submit;

	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/a")
	public static WebElement deathsLink;

	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/ul/li[1]/a")
	public static WebElement drsLink;


	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/a")
	public static WebElement codLink;

	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/ul/li[1]/a")
	public static WebElement newCodLink;

	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/ul/li[2]/a")
	public static WebElement codDraftList;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/drs/div/div[2]/form/alert/div")
	public static WebElement drsMessage;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/cod/div/div[2]/form/alert/div")
	public static WebElement codMessage;

	@FindBy(id = "cod-draftList-deceasedFamilyName")
	public static WebElement codSearchFamilyName;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/ng-component/div/div[2]/form/div/div/input[1]")
	public static WebElement codSearchRefreshButton;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/ng-component/div/div[2]/form/div/div/div/table/tbody/tr[2]/td[1]/input")
	public static WebElement codSearchResult1;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/ng-component/div/div[2]/form/div/div/div/input[2]")
	public static WebElement submitCodButton;

	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/ul/li[2]/a")
	public static WebElement drsDraftList;

	@FindBy(id = "drs-draftList-deceasedFamilyName")
	public static WebElement drsSearchFamilyName;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/draft-drs/div/div[2]/form/div/div/input[1]")
	public static WebElement drsSearchRefreshButton;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/draft-drs/div/div[2]/form/div/div/div/table/tbody/tr[2]/td[1]/input")
	public static WebElement drsSearchResult1;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/draft-drs/div/div[2]/form/input[2]")
	public static WebElement submitDrsButton;

	@FindBy(xpath = "//*[@id=\"compliantList\"]/div/div[2]/div/div[2]/input[1]")
	public static WebElement submitConfirmButton;

	@FindBy(xpath = "//*[@id=\"compliantCodList\"]/div/div[1]/div/div/div")
	public static WebElement submitResultMessage;









}
