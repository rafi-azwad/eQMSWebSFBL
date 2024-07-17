package EQMSStepDefinition;

import Core.ScreenShotUtil;
import SearchPage.HeadOfPDPage;
import SearchPage.HeadOfProductionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static EQMSStepDefinition.LoginStepDefinition.driver;

public class HeadOfProductionStepDefinition {
   HeadOfProductionPage hp;
    @Given("click on head of production option")
    public void clickOnHeadOfProductionOption() {
        hp = new HeadOfProductionPage(driver);
        hp.clickOnHeadOfProduction();
    }
    @When("select the production reference number")
    public void selectTheProductionReferenceNumber() throws InterruptedException {
        hp.selectRefNo();
    }

    @And("fill in the production comment information")
    public void fillInTheProductionCommentInformation() {
        hp.comment();
    }

    @Then("save and submit head of production information")
    public void saveAndSubmitHeadOfProductionInformation() {
        hp.saveAndSubmit();
        ScreenShotUtil.getScreenshot("head of production details");
    }
}
