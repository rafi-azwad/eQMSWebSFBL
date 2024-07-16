package EQMSStepDefinition;

import Core.ScreenRecorderUtil;
import SearchPage.RCAndCAPATeamPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static EQMSStepDefinition.LoginStepDefinition.driver;

public class RCAndCAPAStepDefinition {
    RCAndCAPATeamPage rc;

    @Given("click on rc and capa team option")
    public void clickOnRcAndCapaTeamOption() {
        rc = new RCAndCAPATeamPage(driver);
        rc.clickOnRCAndCAPA();
    }

    @When("select reference number of rc and capa team")
    public void selectReferenceNumberOfRcAndCapaTeam() throws InterruptedException {
        rc.selectRefNO();
    }
    @And("fill in the required rc and capa information")
    public void fillInTheRequiredRcAndCapaInformation() {
        rc.selectStatus();
        rc.rootCause();
        rc.complainControlType();
        
    }

    @Then("save and submit rc and capa information")
    public void saveAndSubmitRcAndCapaInformation() {
        rc.saveAndSubmit();

    }


}
