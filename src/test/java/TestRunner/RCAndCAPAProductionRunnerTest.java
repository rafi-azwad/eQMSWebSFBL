package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/eQMSFeatureFiles/"},
        tags = "@login or @customerComplaints or @marketing or @factoryHead or @qa or @pd or @production or @rc",
        glue = {"EQMSStepDefinition"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/headOfPDAndProductionFeature.html"
        })

@Test
public class RCAndCAPAProductionRunnerTest extends AbstractTestNGCucumberTests {


}
