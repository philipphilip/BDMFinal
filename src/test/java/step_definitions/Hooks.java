package step_definitions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class Hooks {
	public static WebDriver driver;
	private String nodrul = "http://10.8.8.62:4444/wd/hub";
	public static ExtentReports extent;
	public static ExtentTest logger;

	// @BeforeClass
	// public static void startReporting() {
	// boolean reportingStarted = false;
	// if (!reportingStarted) {
	// // Start the reporting name, pathway,...
	// extent = new ExtentReports();
	// // extent.addSystemInfo("Environment","Environment Name")
	// extent.addSystemInfo("Host Name", "SoftwareTestingMaterial")
	// .addSystemInfo("Environment", "Automation
	// Testing").addSystemInfo("UserName", "Rajkumar SM");
	// loading the external xml file (i.e., extent-config.xml) which was
	// placed under the base directory
	// You could find the xml file below. Create xml file in your
	// project and copy past the code mentioned below
	// extent.loadConfig(new File(System.getProperty("user.dir") +
	// "\\extent-config.xml"));
	// Once report started by first scenario set reportingStarted to
	// true
	// reportingStarted = true;
	// }
	// }

	@Before
	/**
	 * Delete all cookies at the start of each scenario to avoid shared state
	 * between tests
	 */
	public void openBrowser() throws MalformedURLException {

		// -----Run on a node------//
		// DesiredCapabilities caps = DesiredCapabilities.chrome();
		// caps.setBrowserName("chrome");
		// caps.setPlatform(Platform.ANY);
		// driver = new RemoteWebDriver(new URL(nodrul), caps);

		// -----Run locally on FireFox Browser------//
		// System.setProperty("webdriver.gecko.driver",
		// "drivers/geckodriver-v0.16.1-win64/geckodriver.exe");
		// driver = new FirefoxDriver();

		// -----Run locally on Chrome Browser------//
		// System.setProperty("webdriver.chrome.driver","C:/work/ConnectedBdmRIO/automation-selenium/src/drivers/chrome-2.29-winx32/chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver","C:/work/ConnectedBdmRIO/automation-selenium/src/drivers/chrome-2.29-winx32/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "drivers/chrome-2.29-winx32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		// driver.manage().window().setPosition(new Point(1600, 70));
		// driver.manage().window().maximize();
	}

	@After
	public void closeDriver(Scenario scenario) {
		// driver.quit(); //disable temporarily
	}

	@After
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	public void embedScreenshot(Scenario scenario) {
		//
		// if (scenario.isFailed()) {
		//
		// logger.log(LogStatus.FAIL, "Test Case Failed is"+result.getName());
		// logger.log(LogStatus.FAIL, "Test Case Failed
		// is"+result.getThrowable());
		//
		// try {
		// scenario.write("Current Page URL is " + driver.getCurrentUrl());
		// // byte[] screenshot = getScreenshotAs(OutputType.BYTES);
		// byte[] screenshot = ((TakesScreenshot)
		// driver).getScreenshotAs(OutputType.BYTES);
		// scenario.embed(screenshot, "image/png");
		// } catch (WebDriverException somePlatformsDontSupportScreenshots) {
		// System.err.println(somePlatformsDontSupportScreenshots.getMessage());
		// }
		//
		// } else if (scenario.getStatus().equals("pass")){
		// logger.log(LogStatus.SKIP, "Test Case Skipped is"+result.getName());
		// } else if(){}
		// driver.quit();

	}

}
