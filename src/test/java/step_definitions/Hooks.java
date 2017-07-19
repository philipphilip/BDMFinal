package step_definitions;

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

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class Hooks {
	public static WebDriver driver;
	private String nodrul = "http://10.8.8.62:4444/wd/hub";

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
		// System.setProperty("webdriver.gecko.driver","drivers/geckodriver-v0.16.1-win64/geckodriver.exe");
		// driver = new FirefoxDriver();

		// -----Run locally on Chrome Browser------//
		//System.setProperty("webdriver.chrome.driver",
		//		"C:/work/ConnectedBdmRIO/automation-selenium/src/drivers/chrome-2.29-winx32/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",
		//		"C:/work/ConnectedBdmRIO/automation-selenium/src/drivers/chrome-2.29-winx32/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",
		//		"/usr/lib/node_modules/chromedriver/lib/chromedriver/chromedriver");

		//driver = new ChromeDriver();

		//driver.manage().deleteAllCookies();
		//driver.manage().window().setPosition(new Point(1600, 70));
		//driver.manage().window().maximize();
	}

	@After
	public void closeDriver(Scenario scenario) {
		//driver.quit(); //disable temporarily
	}

	@After
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	public void embedScreenshot(Scenario scenario) {

		if (scenario.isFailed()) {
			try {
				scenario.write("Current Page URL is " + driver.getCurrentUrl());
				// byte[] screenshot = getScreenshotAs(OutputType.BYTES);
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}

		}
		// driver.quit();

	}

}