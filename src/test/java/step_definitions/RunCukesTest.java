package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/core/allCoreTests.feature",
		// glue = "step_definitions",
		// plugin = {"pretty", "html:target/cucumber-html-report"},
		plugin = { "pretty", "html:target/Destination" },
		// tags = {"@core-br"},
		// tags = {"@st3"},
		// tags = { "@core" },
		monochrome = true)

public class RunCukesTest {

}