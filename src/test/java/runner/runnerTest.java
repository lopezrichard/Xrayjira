package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Richard Lopez on 03/06/2022
 * Visit Linkedin https://www.linkedin.com/in/richard-lopez-/
 **/
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steep",
        plugin = { "pretty",
                "json:target/cucumber.json"
        }
)
public class runnerTest extends AbstractTestNGCucumberTests {
}
