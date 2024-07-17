package EQMSStepDefinition;

import Core.ScreenShotUtil;
import SearchPage.HeadOfPDPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static EQMSStepDefinition.LoginStepDefinition.driver;

public class HeadOfPDStepDefinition {
    HeadOfPDPage hpp;
    @Given("click on head of pd option")
    public void clickOnHeadOfPdOption() {
        hpp = new HeadOfPDPage(driver);
        hpp.clickOnHeadOfPD();
    }

    @When("select the reference number")
    public void selectTheReferenceNumber() throws InterruptedException {
       hpp.selectRefNo();
    }

    @And("fill in the comment information")
    public void fillInTheCommentInformation() {
        hpp.comment();
    }

    @Then("save and submit head of pd information")
    public void saveAndSubmitHeadOfPdInformation() {
        hpp.saveAndSubmit();
        ScreenShotUtil.getScreenshot("head of pd details");
    }

}
