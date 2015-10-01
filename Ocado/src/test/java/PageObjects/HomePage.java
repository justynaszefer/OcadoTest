package PageObjects;

import Setup.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

    final WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

//    Page Objects
    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "simpleLoginForm")
    private WebElement loginPopup;

    @FindBy(id = "js-popupLoginButton")
    private WebElement submitloginButton;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(className = "shopLink")
    private WebElement browseShopLocator;

    @FindBy(xpath = "//*[@id=\"offers\"]/a")
    private WebElement offersLocator;

    @FindBy(id = "breadcrumb")
    private WebElement tabNotificationLocator;

    @FindBy(xpath = "//span[contains(.,\"Welcome back,\")]")
    private WebElement loggedUserNotificationLocator;

//
    public WebElement getLoggedUserNotificationLocator(){
        return loggedUserNotificationLocator;
    }

    public WebElement getTabNotificationLocator() {
        return tabNotificationLocator;
    }

    public HomePage login() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOf(loginPopup));
        usernameField.sendKeys(new PropertyReader().readProperty("username"));
        passwordField.sendKeys(new PropertyReader().readProperty("password"));
        submitloginButton.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loginButton")));
        return this;
    }

    public HomePage go_to_Browse_Shop_page() {
        browseShopLocator.click();
        return this;
    }

    public HomePage go_to_Offers_page() {
        offersLocator.click();
        return this;
    }
}
