package modules;

import helpers.Helper;
import org.openqa.selenium.WebDriver;
import pageobjects.EregistryLoginPage;

import java.util.HashMap;

public class EregistrySignInAction {

	public static void Execute(WebDriver driver, HashMap<String, String> map) throws Throwable {

		Helper.inputItem(EregistryLoginPage.username,"admin");
		Helper.inputItem(EregistryLoginPage.password,"a");

		System.out.println(" before click login button ");
		Helper.clickItem(EregistryLoginPage.signin_button);
		System.out.println(" after click login button ");


	}
}