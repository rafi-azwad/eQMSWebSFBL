package EQMSStepDefinition;

import Core.ScreenShotUtil;
import SearchPage.FactoryHeadPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static EQMSStepDefinition.LoginStepDefinition.driver;

public class FactoryHeadStepDefinition {
    FactoryHeadPage fh;
    @Given("click on factory head option")
    public void clickOnFactoryHeadOption() {
        fh = new FactoryHeadPage(driver);
        fh.clickOnFactoryHead();
    }


    @When("select factory reference number")
    public void selectFactoryReferenceNumber() throws InterruptedException {
        fh.selectRefNo();
    }
    @And("fill in the status information")
    public void fillInTheStatusInformation() {
        fh.selectFurtherStatus();
    }

    @Then("save and submit factory head information")
    public void saveAndSubmitFactoryHeadInformation() throws InterruptedException {
        fh.selectProcessStatus();
        ScreenShotUtil.getScreenshot("factory head details");
    }


}
