package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility
{
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());
    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void nationalityDropDownList(String nationality){
        log.info("Select Nationality from dropdown" );
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }
    public void clickNextStepButton(){
        log.info("Clicking on Continue Button" + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }
}
