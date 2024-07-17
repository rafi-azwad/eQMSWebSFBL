package EQMSStepDefinition;

import Core.ScreenShotUtil;
import SearchPage.MarketingRepresentativePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.monte.screenrecorder.ScreenRecorder;

import static EQMSStepDefinition.LoginStepDefinition.driver;

public class MarketingRepresentativeStepDefinition {

    MarketingRepresentativePage mr;


    @Given("click on customer complain option option")
    public void clickOnCustomerComplainOptionOption() {
        mr = new MarketingRepresentativePage(driver);

    }

    @When("select marketing representative")
    public void selectMarketingRepresentative() {
        mr.selectMarketing();
    }

    @And("fill in the required marketing information")
    public void fillInTheRequiredMarketingInformation() throws InterruptedException {
        mr.selectRefNO();
        mr.assessmentComment();
        mr.selectFurtherStatus();

    }

    @Then("save and submit IMD information")
    public void saveAndSubmitIMDInformation() throws InterruptedException {
        mr.selectProcessStatus();
        ScreenShotUtil.getScreenshot("marketing representative details");
    }
}