package StepsDefinition;

import PageObjects.ShopPage;
import PageObjects.HomePage;
import Setup.PropertyReader;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Justyna on 30/09/2015.
 */
public class SavingsSteps {

    private WebDriver driver = new SetupSteps().beforeScenario();
    PageObjects.HomePage HomePage;
    ShopPage ShopPage;
    StringBuffer verificationErrors;

    public void initialize() {
        verificationErrors = new StringBuffer();
    }

    @Before
    public void init() {
        HomePage = PageFactory.initElements(driver, HomePage.class);
        ShopPage = PageFactory.initElements(driver, ShopPage.class);
    }

    @When("^customer add item in Half price promo to basket$")
    public void customer_add_item_in_Half_price_promo_to_basket() {
        try {
            ShopPage.find_promo(1);
        }
        catch (Exception ae) {
            verificationErrors.append(ae.getMessage());
        }
        ShopPage.add_to_the_basket(1,new PropertyReader().readProperty("productNum2"));
    }

    @Then("^saving field is updated$")
    public void saving_field_is_updated() {
        Assert.assertNotEquals(ShopPage.basket_summary_savings(), 0, 0);
    }

    @And("^contains correct savings value$")
    public void contains_correct_savings_value() {
        Double productNum = Double.valueOf(new PropertyReader().readProperty("productNum2"));
        Assert.assertEquals((ShopPage.promotion_price(1) / 2) * productNum, ShopPage.basket_summary_savings(), 0);
    }
}
