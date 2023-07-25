package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkTypePage extends Utility
{
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Health and care professional')]")
    WebElement selectJobtypeList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectJobType(String job) {
        log.info("Clicking on Health and care professional Radio Button" + selectJobtypeList.toString());
        clickOnElement(selectJobtypeList);
    }

    public void clickNextStepButton() {
        log.info("Clicking on Continue Button" + nextStepButton.toString());
        clickOnElement(nextStepButton);

    }
}
