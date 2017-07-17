package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "step_definitions",
		//plugin = {"pretty", "html:target/cucumber-html-report"},
		plugin = {"json:target/report.json"},
		tags = {"@st3"},
		monochrome = true
		)

public class RunCukesTest{
	
}