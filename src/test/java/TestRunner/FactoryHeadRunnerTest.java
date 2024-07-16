
package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/eQMSFeatureFiles/"},
        tags = "@login or @customerComplaints or @marketing or @factoryHead",
        glue = {"EQMSStepDefinition"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/factoryHeadFeature.html"
        })

@Test
public class FactoryHeadRunnerTest extends AbstractTestNGCucumberTests {


}

