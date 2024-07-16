package EQMSStepDefinition;

import SearchPage.CustomerComplaintsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static EQMSStepDefinition.LoginStepDefinition.driver;

public class CustomerComplaintsStepDefinition {
    CustomerComplaintsPage cc;


    @Given("click on complaint management option")
    public void clickOnComplaintManagementOption() {
        cc = new CustomerComplaintsPage(driver);
        cc.clickOnComplaintManagement();
    }

    @When("select customer complaints")
    public void selectCustomerComplaints() {
        cc.selectCustomerComplaints();
    }

    @And("fill in the required information")
    public void fillInTheRequiredInformation() {
       cc.fillTheRequireField();

    }

    @Then("save and submit the information")
    public void saveAndSubmitTheInformation() throws InterruptedException {
        cc.saveInformation();
        cc.submitInformation();

    }


}
