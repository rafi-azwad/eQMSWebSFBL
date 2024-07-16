package EQMSStepDefinition;

import SearchPage.HeadOfQAPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static EQMSStepDefinition.LoginStepDefinition.driver;

public class HeadOfQAStepDefinition {
    HeadOfQAPage hqa;

    @Given("click on head of qa option")
    public void clickOnHeadOfQaOption() {
        hqa = new HeadOfQAPage(driver);
        hqa.clickOnHeadOfQA();
    }

    @When("select qa reference number")
    public void selectQaReferenceNumber() throws InterruptedException {
        hqa.selectRefNo();
    }

    @And("fill in the required investigation information")
    public void fillInTheRequiredInvestigationInformation(){
        hqa.selectFurtherStatus();

    }

    @Then("save and submit the qa information")
    public void saveAndSubmitTheQaInformation() throws InterruptedException {
        hqa.selectProcessStatus();
    }
}
