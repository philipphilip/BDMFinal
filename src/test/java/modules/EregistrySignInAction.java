package modules;

import org.openqa.selenium.WebDriver;
import pageobjects.EregistryLoginPage;

import java.util.HashMap;

public class EregistrySignInAction {

	public static void Execute(WebDriver driver, HashMap<String, String> map) throws Exception {

		EregistryLoginPage.username.sendKeys("admin");
		EregistryLoginPage.password.sendKeys("a");

		System.out.println(" before click login button ");
		EregistryLoginPage.signin_button.click();
		System.out.println(" after click login button ");


	}
}