package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.EregistryLoginPage;

public class EregistrySignInAction {

	public static void Execute(WebDriver driver) throws Throwable {

		EregistryLoginPage.username.sendKeys("eadmin");
		EregistryLoginPage.password.sendKeys("Friday17");
		EregistryLoginPage.signin_button.click();
	}
}