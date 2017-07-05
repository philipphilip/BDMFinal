package modules;

import org.openqa.selenium.WebDriver;
import pageobjects.EpublicLoginPage;

import java.util.HashMap;

public class EpublicSignInAction {

	public static void Execute(WebDriver driver, HashMap<String, String> map) throws Exception {

		EpublicLoginPage.username.sendKeys("a1");
		EpublicLoginPage.password.sendKeys("password");

		System.out.println(" before click login button ");
		EpublicLoginPage.signin_button.click();
		System.out.println(" after click login button ");
	}
}