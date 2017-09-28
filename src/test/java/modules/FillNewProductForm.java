package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.CoreControls;
import pageobjects.CoreProductsPage;

public class FillNewProductForm {

	public static String prodCode = RandomStringUtils.randomAlphabetic(4);
	public static String prodDescription = RandomStringUtils.randomAlphabetic(4);
	public static String prodAC = RandomStringUtils.random(5);

	public static void Execute(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, CoreProductsPage.class);

		CoreProductsPage.productCode.sendKeys("auto" + prodCode);
		CoreProductsPage.productDescription.sendKeys("auto" + prodDescription);
		CoreProductsPage.productGroup.sendKeys("Certificate");
		CoreProductsPage.productType.sendKeys("Birth");
		CoreProductsPage.underlyingRegistration.sendKeys("Birth");
		CoreProductsPage.costCentre.sendKeys("218");
		CoreProductsPage.aC.sendKeys("auto" + prodAC);
		CoreProductsPage.noTraceTemplate.sendKeys("BirthNoTrace");
		CoreProductsPage.gstRate.sendKeys("10");
		CoreControls.submitProduct.click();
		Thread.sleep(2000);
		String successMessage = CoreProductsPage.submitionAlert.getText();
		Assert.assertTrue("The success message is not as expected",
				successMessage.contains("Product Created/Saved successful"));
	}
}
