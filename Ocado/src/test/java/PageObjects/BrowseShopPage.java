package PageObjects;

import Setup.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Justyna on 27/09/2015.
 */
public class BrowseShopPage {

    final WebDriver driver;


    public BrowseShopPage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(xpath = "//li[contains(.,'Buy any 2 for')]")
    private WebElement buyAnyForPromoLocator;

    @FindBy(xpath = "//li[contains(.,'Half Price, was')]")
    private WebElement halfPricePromoLocator;

    @FindBy (id = "basketSummaryTotal")
    private  WebElement basketSummaryTotalLocator;

    @FindBy (id = "basketSummarySavings")
    private  WebElement basketSummarySavingsLocator;

    @FindBy (id = "basketSummaryCount")
    private  WebElement basketSummaryCountLocator;

    private WebElement quantity_product_locator(int promoType){
        WebElement element = null;
        switch(promoType) {
            case 0:
            element = driver.findElement(By.xpath("//*[@id=\"" + buyAnyForPromoLocator.getAttribute("id") + "-form\"]/label/input"));
            break;
            case 1:
            element = driver.findElement(By.xpath("//*[@id=\"" + halfPricePromoLocator.getAttribute("id") + "-form\"]/label/input"));
            break;
        }
        return element;
    }

    private WebElement add_product_button(int promoType){
        WebElement element = null;
        switch(promoType) {
            case 0:
                element = driver.findElement(By.xpath("//*[@id=\"" + buyAnyForPromoLocator.getAttribute("id") + "-form\"]/span[2]/input"));
                break;
            case 1:
                element = driver.findElement(By.xpath("//*[@id=\"" + halfPricePromoLocator.getAttribute("id") + "-form\"]/span[2]/input"));
                break;
        }
        return element;
    }

    private WebElement promo_type_locator(int promoType){
        WebElement element = null;
        switch(promoType) {
            case 0:
                element = driver.findElement(By.xpath("//*[@id=\"" + buyAnyForPromoLocator.getAttribute("id") + "\"]/div[1]/p/a/span"));
                break;
            case 1:
                element = driver.findElement(By.xpath("//*[@id=\"" + halfPricePromoLocator.getAttribute("id") + "\"]/div[1]/p/a/span"));
                break;
        }
        return element;
    }

    public BrowseShopPage find_promo(int promoType){
        Actions actions = new Actions(driver);
        WebElement element = null;
        switch(promoType) {
            case 0:
                actions.moveToElement(buyAnyForPromoLocator);
                actions.perform();
                break;
            case 1:
                actions.moveToElement(halfPricePromoLocator);
                actions.perform();
                break;
        }
        return this;
    }

    public BrowseShopPage add_to_the_basket(int promoType,String productNum){
        switch(promoType) {
            case 0:
                quantity_product_locator(0).clear();
                quantity_product_locator(0).sendKeys(productNum);
                add_product_button(0).click();
                break;
            case 1:
                quantity_product_locator(1).clear();
                quantity_product_locator(1).sendKeys(productNum);
                add_product_button(1).click();
                break;
        }
        return this;
    }

    public double promotion_price(int promoType){
        double promotionPrice = 0;
        switch(promoType) {
            case 0:
                promotionPrice = Double.valueOf(promo_type_locator(0).getText().substring(15));
                break;
            case 1:
                promotionPrice = Double.valueOf(promo_type_locator(1).getText().substring(17));
                break;
        }
        return promotionPrice;
    }

    public double basket_summary_total(){
        Double basket_summary_total = Double.valueOf(basketSummaryTotalLocator.getText().substring(1));
        return basket_summary_total;
    }

    public double basket_summary_savings(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("basketSummaryCount"), new PropertyReader().readProperty("productNum")));
        Double basket_summary_savings = Double.valueOf(basketSummarySavingsLocator.getText().substring(1));
        return basket_summary_savings;
    }

}
