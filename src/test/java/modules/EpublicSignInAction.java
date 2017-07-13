package modules;

import helpers.Helper;
import org.openqa.selenium.WebDriver;
import pageobjects.EpublicLoginPage;

import java.util.HashMap;

public class EpublicSignInAction {

	public static void Execute(WebDriver driver, HashMap<String, String> map) throws Throwable {

		Helper.inputItem(EpublicLoginPage.username,"a1");
		Helper.inputItem(EpublicLoginPage.password,"password");

		System.out.println(" before click login button ");
		Helper.clickItem(EpublicLoginPage.signin_button);
		System.out.println(" after click login button ");
	}
}