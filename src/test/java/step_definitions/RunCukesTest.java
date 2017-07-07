package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		//plugin = {"pretty", "html:target/cucumber-html-report"},
		plugin = {"json:target/report.json"},
		tags = {"@eregistry"}
		)

public class RunCukesTest{
	
}