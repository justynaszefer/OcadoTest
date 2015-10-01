package StepsDefinition;

import Setup.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

/**
 * Created by Justyna on 30/09/2015.
 */
public class SetupSteps {

    private WebDriver driver;

    @Before
    public WebDriver beforeScenario() {
        driver = new DriverFactory().getDriver();
        driver.get("http://www.ocado.com");
        driver.manage().window().maximize();
        return driver;
    }

    @After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
    }


}
