package step_definitions;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Hooks {
	public static WebDriver driver;

	@Before
	/**
	 * Delete all cookies at the start of each scenario to avoid shared state
	 * between tests
	 */
	public void openBrowser() throws MalformedURLException {
		System.out.println("Called openBrowser");

		// System.setProperty("webdriver.gecko.driver",
		// "drivers/geckodriver-v0.16.1-win64/geckodriver.exe");
		// System.setProperty("webdriver.gecko.driver",
		// "drivers/geckodriver-v0.16.1-linux64/geckodriver.exe");
		// driver = new FirefoxDriver();
		// ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.setBinary("C:/Users/PPhilip/Projects/core-automation-testing/drivers/chrome-61.0.3-Canary");
		// chromeOptions.addArguments("--headless");

		// System.setProperty("webdriver.chrome.driver",
		// "C:/Users/PPhilip/Projects/core-automation-testing/drivers/chrome-2.29-winx32/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
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
		driver.quit();

	}

}