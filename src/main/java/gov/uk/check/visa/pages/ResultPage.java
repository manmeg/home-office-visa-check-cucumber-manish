package gov.uk.check.visa.pages;


import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement heathcarevisaText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You may need a visa')]")
    WebElement needVisaMessage;

    public String getResultMessage(){
        log.info("Getting You will not need a visa to come to the UK  Message");
        return getTextFromElement( resultMessage);
    }

    public String confirmResultMessage(){
        log.info("Getting You need a visa to work in health and care Message");
        return getTextFromElement(heathcarevisaText);

    }
    public String getResulstMessage(){
        log.info("Getting You may need a visa Message");
        return getTextFromElement(needVisaMessage);
    }

}
