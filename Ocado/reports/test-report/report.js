$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Offers.feature");
formatter.feature({
  "line": 2,
  "name": "Logged in customer should have item on promo correctly accrued.",
  "description": "",
  "id": "logged-in-customer-should-have-item-on-promo-correctly-accrued.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test2"
    }
  ]
});
formatter.before({
  "duration": 8675083945,
  "status": "passed"
});
formatter.before({
  "duration": 2452558857,
  "status": "passed"
});
formatter.before({
  "duration": 2242386513,
  "status": "passed"
});
formatter.before({
  "duration": 2030876338,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add items from Offers page to basket",
  "description": "",
  "id": "logged-in-customer-should-have-item-on-promo-correctly-accrued.;add-items-from-offers-page-to-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "a logged in customer",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Offers page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "add items met promo conditions to trolley",
  "keyword": "Then "
});
formatter.match({
  "location": "OffersSteps.a_logged_in_customer()"
});
formatter.result({
  "duration": 7512229186,
  "status": "passed"
});
formatter.match({
  "location": "OffersSteps.Offers_page_is_displayed()"
});
formatter.result({
  "duration": 4909966121,
  "status": "passed"
});
formatter.match({
  "location": "OffersSteps.add_items_met_promo_conditions_to_trolley()"
});
formatter.result({
  "duration": 1838753088,
  "status": "passed"
});
formatter.after({
  "duration": 1240775508,
  "status": "passed"
});
formatter.uri("Promo.feature");
formatter.feature({
  "line": 2,
  "name": "Logged out customer is able to add items on promo to basket",
  "description": "",
  "id": "logged-out-customer-is-able-to-add-items-on-promo-to-basket",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test1"
    }
  ]
});
formatter.before({
  "duration": 7359369288,
  "status": "passed"
});
formatter.before({
  "duration": 1901854254,
  "status": "passed"
});
formatter.before({
  "duration": 1402222168,
  "status": "passed"
});
formatter.before({
  "duration": 1789646858,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add items on offer \u0027Buy any XX for XX\u0027 to the basket",
  "description": "",
  "id": "logged-out-customer-is-able-to-add-items-on-promo-to-basket;add-items-on-offer-\u0027buy-any-xx-for-xx\u0027-to-the-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "a customer on Browse Shop page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "\u0027Buy any XX for XX\u0027 promo is available",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "promotion conditions are met",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "total amount in basket is calculated correct",
  "keyword": "Then "
});
formatter.match({
  "location": "PromoSteps.a_customer_on_Browse_Shop_page()"
});
formatter.result({
  "duration": 5620184651,
  "status": "passed"
});
formatter.match({
  "location": "PromoSteps.buy_any_XX_for_XX_promo_is_available()"
});
formatter.result({
  "duration": 340853592,
  "status": "passed"
});
formatter.match({
  "location": "PromoSteps.promotion_conditions_are_met()"
});
formatter.result({
  "duration": 1206860724,
  "status": "passed"
});
formatter.match({
  "location": "PromoSteps.total_amount_in_basket_is_calculated_correct()"
});
formatter.result({
  "duration": 1182976723,
  "status": "passed"
});
formatter.after({
  "duration": 1027181014,
  "status": "passed"
});
formatter.uri("Savings.feature");
formatter.feature({
  "line": 2,
  "name": "Savings feature in top menu display correct value",
  "description": "",
  "id": "savings-feature-in-top-menu-display-correct-value",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test3"
    }
  ]
});
formatter.before({
  "duration": 7824773153,
  "status": "passed"
});
formatter.before({
  "duration": 1868408442,
  "status": "passed"
});
formatter.before({
  "duration": 1659338261,
  "status": "passed"
});
formatter.before({
  "duration": 1919346345,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As logged out customer add Half price item to basket",
  "description": "",
  "id": "savings-feature-in-top-menu-display-correct-value;as-logged-out-customer-add-half-price-item-to-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "a customer on Browse Shop page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "customer add item in Half price promo to basket",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "saving field is updated",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "contains correct savings value",
  "keyword": "And "
});
formatter.match({
  "location": "PromoSteps.a_customer_on_Browse_Shop_page()"
});
formatter.result({
  "duration": 6994865392,
  "status": "passed"
});
formatter.match({
  "location": "SavingsSteps.customer_add_item_in_Half_price_promo_to_basket()"
});
formatter.result({
  "duration": 1517020751,
  "status": "passed"
});
formatter.match({
  "location": "SavingsSteps.saving_field_is_updated()"
});
formatter.result({
  "duration": 879036098,
  "status": "passed"
});
formatter.match({
  "location": "SavingsSteps.contains_correct_savings_value()"
});
formatter.result({
  "duration": 313959565,
  "status": "passed"
});
formatter.after({
  "duration": 1014269292,
  "status": "passed"
});
});