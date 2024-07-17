package EQMSStepDefinition;

import Core.ScreenRecorderUtil;
import Core.ScreenShotUtil;
import SearchPage.ApprovalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static EQMSStepDefinition.LoginStepDefinition.driver;

public class ApprovalStepDefinition {
    ApprovalPage ap;
    @Given("click on qa head approval option")
    public void clickOnQaHeadApprovalOption() {
       ap = new ApprovalPage(driver);
       ap.clickOnQAApproval();

    }

    @When("select reference number of qa head approval")
    public void selectReferenceNumberOfQaHeadApproval() throws InterruptedException {
        ap.selectRefNO();
    }

    @And("fill in the comment field")
    public void fillInTheCommentField() {
        ap.approvalComment();
    }

    @Then("save and submit the all information")
    public void saveAndSubmitTheAllInformation() {
        ap.saveAndSubmit();
        ScreenShotUtil.getScreenshot("head of qa/pd/production/factory/marketing... approval details");

    }

    @Given("click on pd head approval option")
    public void clickOnPdHeadApprovalOption() {
        ap = new ApprovalPage(driver);
        ap.clickOnPDApproval();
    }

    @Given("click on production head approval option")
    public void clickOnProductionHeadApprovalOption() {
        ap = new ApprovalPage(driver);
        ap.clickOnProductionApproval();
    }

    @Given("click on factory head approval option")
    public void clickOnFactoryHeadApprovalOption() {
        ap = new ApprovalPage(driver);
        ap.clickOnFactoryApproval();
    }

    @Given("click on marketing head acknowledgement option")
    public void clickOnMarketingHeadAcknowledgementOption() {
        ap = new ApprovalPage(driver);
        ap.clickOnMarketingHead();
    }

    @Given("click on action taken report option")
    public void clickOnActionTakenReportOption() {
        ap = new ApprovalPage(driver);
        ap.clickOnActionTaken();
    }

    @Given("click on sales head acknowledgement option")
    public void clickOnSalesHeadAcknowledgementOption() {
        ap = new ApprovalPage(driver);
        ap.clickOnSalesHead();
    }
    @Given("click on complaint close option")
    public void clickOnComplaintCloseOption() {
        ap = new ApprovalPage(driver);
        ap.clickOnComplaintClose();
    }


    @Then("save and submit the complaint close information")
    public void saveAndSubmitTheComplaintCloseInformation() {
        ap.saveAndSubmit();
        ScreenRecorderUtil.stopRecord();
    }
}
