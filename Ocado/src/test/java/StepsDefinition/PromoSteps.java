package StepsDefinition;

import PageObjects.ShopPage;
import PageObjects.HomePage;
import Setup.PropertyReader;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Justyna on 27/09/2015.
 */
public class PromoSteps {

    private WebDriver driver = new SetupSteps().beforeScenario();
    HomePage HomePage;
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

    @Given("^a customer on Browse Shop page$")
    public void a_customer_on_Browse_Shop_page() {
        HomePage.go_to_Browse_Shop_page();
        Assert.assertTrue("Browse Shop page displayed", ("You are in:" + '\n' + "Shop").equals(HomePage.getTabNotificationLocator().getText()));
    }

    @When("'Buy any XX for XX' promo is available")
    public void buy_any_XX_for_XX_promo_is_available() {
           try {
               ShopPage.find_promo(0);
           }
           catch (Exception ae) {
               verificationErrors.append(ae.getMessage());
           }
   }

    @And("promotion conditions are met")
    public void promotion_conditions_are_met() {
        ShopPage.add_to_the_basket(0,new PropertyReader().readProperty("productNum1"));
    }

    @Then("total amount in basket is calculated correct")
    public void total_amount_in_basket_is_calculated_correct() {
        ShopPage.promotion_price(0);
        ShopPage.basket_summary_total();
        Double productNum = Double.valueOf(new PropertyReader().readProperty("productNum1"));
        Assert.assertEquals(ShopPage.promotion_price(0)*(productNum/2), ShopPage.basket_summary_total(),0);
    }

}
