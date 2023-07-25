package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationSteps {
    @And("I Click on accept button")
    public void iClickOnAcceptButton() {
        new StartPage().acceptCookies();
    }


    @And("I Click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @When("I Select a Nationality of {string}")
    public void iSelectANationalityOfAustralia(String nationality) throws InterruptedException {
        new SelectNationalityPage().nationalityDropDownList(nationality);
        Thread.sleep(3000);
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I Select reason {string}")
    public void iSelectReasonTourismOrVisitingFamilyAndFriends(String reason) throws InterruptedException {
        new ReasonForTravelPage().selectReasonForVisit(reason);
        Thread.sleep(3000);
    }

    @Then("I Should see the result {string}")
    public void iShouldSeeTheResultYouWillNotNeedAVisaToComeToTheUK(String message) throws InterruptedException {
        Assert.assertEquals("text not match","You will not need a visa to come to the UK",new ResultPage().getResultMessage());
        Thread.sleep(3000);
    }

    @And("I Select a reason {string}")
    public void iSelectAReasonWorkAcademicVisitOrBusiness(String reason) throws InterruptedException {
        new ReasonForTravelPage().selectReasonForVisit(reason);
        Thread.sleep(3000);
    }

    @And("I Select intended to stay for {string}")
    public void iSelectIntendedToStayForLongerThanMonths(String moreOrless) throws InterruptedException {
        new DurationOfStayPage().selectLengthOfStay("2");
        Thread.sleep(3000);
    }

    @And("I Select have planning to work for {string}")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional(String message) throws InterruptedException {
        new WorkTypePage().selectJobType("Health and care professional");
        Thread.sleep(3000);
    }

    @Then("I should see the result {string}")
    public void iShouldSeeTheResultYouNeedAVisaToWorkInHealthAndCare(String message) throws InterruptedException {
        Assert.assertEquals("text not match","You need a visa to work in health and care",new ResultPage().confirmResultMessage());
        Thread.sleep(3000);
    }

    @Then("I should see the results {string}")
    public void iShouldSeeTheResultsYouMayNeedAVisa(String message) throws InterruptedException {
        Assert.assertEquals("text not match","You may need a visa",new ResultPage().getResulstMessage());
        Thread.sleep(2000);

    }

}
