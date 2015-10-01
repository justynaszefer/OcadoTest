package StepsDefinition;

import PageObjects.ShopPage;
import Setup.PropertyReader;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Justyna on 30/09/2015.
 */
public class OffersSteps {

    private WebDriver driver = new SetupSteps().beforeScenario();
    String productNum3 = new PropertyReader().readProperty("productNum3");
    PageObjects.HomePage HomePage;
    ShopPage ShopPage;
    StringBuffer verificationErrors;

    public void initialize() {
        verificationErrors = new StringBuffer();
    }

    @Before
    public void init() {
        HomePage = PageFactory.initElements(driver, PageObjects.HomePage.class);
        ShopPage = PageFactory.initElements(driver, ShopPage.class);
    }

    @Given("^a logged in customer$")
    public void a_logged_in_customer() {
        HomePage.login();
        Assert.assertEquals("Welcome back,", HomePage.getLoggedUserNotificationLocator().getText());
    }

    @When("^Offers page is displayed$")
    public void Offers_page_is_displayed() {
        HomePage.go_to_Offers_page();
        Assert.assertTrue("Offers page displayed", ("You are in:" + '\n' + "Offers").equals(HomePage.getTabNotificationLocator().getText()));
    }

    @Then("^add items met promo conditions to trolley$")
    public void add_items_met_promo_conditions_to_trolley() {
        try {
            ShopPage.find_promo(0);
        }
        catch (Exception ae) {
            verificationErrors.append(ae.getMessage());
        }
        int productCount = Integer.parseInt(ShopPage.getBasketSummaryCountLocator().getText());
        int productNum = Integer.parseInt(productNum3);
        ShopPage.add_to_the_basket(0,productNum3);
        Assert.assertEquals(productNum3 + " in trolley", ShopPage.getProductCountLocator().getText());
        Assert.assertEquals(String.valueOf(productCount+productNum),ShopPage.getBasketSummaryCountLocator().getText());
    }
}
