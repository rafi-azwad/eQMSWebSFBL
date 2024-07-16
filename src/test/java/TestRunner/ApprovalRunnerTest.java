package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/eQMSFeatureFiles/"},
        tags = "@login " +
                "or @qaApproval or @pdApproval or @productionApproval or @factoryApproval " +
                "or @marketingHead or @actionTaken or @salesHead or @complaintClose",
        glue = {"EQMSStepDefinition"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/approvalFeature.html"
        })

@Test
public class ApprovalRunnerTest extends AbstractTestNGCucumberTests {


}
