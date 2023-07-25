package gov.uk.check.visa;


import gov.uk.check.visa.propertyreader.PropertyReader;
import gov.uk.check.visa.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends Utility {

    @Before
    public void setUp(){


        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    @After
    public void tearDown(){
       closeBrowser();
    }
}
