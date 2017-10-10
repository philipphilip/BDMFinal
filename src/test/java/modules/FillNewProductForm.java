package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreControls;
import pageobjects.CoreProductsPage;

public class FillNewProductForm {

	public static String prodCode = RandomStringUtils.randomAlphabetic(4);
	public static String prodDescription = RandomStringUtils.randomAlphabetic(4);
	public static String prodAC = RandomStringUtils.randomNumeric(5);

	public static void Execute(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, CoreProductsPage.class);

		CoreProductsPage.productCode.sendKeys("auto" + prodCode);
		CoreProductsPage.productDescription.sendKeys("auto" + prodDescription);
		Thread.sleep(1000);
		CoreProductsPage.productGroup.sendKeys("Certificate");
		CoreProductsPage.productType.sendKeys("Birth");
		CoreProductsPage.underlyingRegistration.sendKeys("Birth");
		CoreProductsPage.costCentre.sendKeys("218");
		CoreProductsPage.aC.sendKeys("auto" + prodAC);
		CoreProductsPage.noTraceTemplate.sendKeys("BirthNoTrace");
		CoreProductsPage.gstRate.sendKeys("10");
		Helper.clickItem(CoreControls.submitProduct);
		Thread.sleep(2000);
		String successMessage = CoreProductsPage.submitionAlert.getText();
		Assert.assertTrue("The success message is not as expected",
				successMessage.contains("Product Created/Saved successful"));
	}
}
