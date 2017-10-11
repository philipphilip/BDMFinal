package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.CoreControls;

public class GotToNewProductForm {

	public static void Execute(WebDriver driver) throws Throwable {
		CoreControls.productsTab.click();
		CoreControls.newProduct.click();
	}

}
