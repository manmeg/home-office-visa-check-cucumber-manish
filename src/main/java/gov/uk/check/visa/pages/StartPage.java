package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility
{
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Hide this message')]")
    WebElement hideMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;

    public void clickStartNow(){
        log.info("Clicking on login link" + startNowButton.toString());
        clickOnElement(startNowButton);
    }
    public void acceptCookies()
    {
        log.info("Clicking on Accept button" + acceptCookies.toString());
        log.info("Clicking on Hide button" + hideMessage.toString());
        clickOnElement(acceptCookies);
        clickOnElement(hideMessage);
    }


}
