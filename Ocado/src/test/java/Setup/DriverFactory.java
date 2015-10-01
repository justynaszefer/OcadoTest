package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Justyna on 27/09/2015.
 */

public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory() {
            initialize();
        }

    public void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }

    private void createNewDriverInstance() {
        String browser = new PropertyReader().readProperty("browser");
        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("unknown browser type");
        }
    }

    public WebDriver getDriver() {
            return driver;
        }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
}
