package page;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class ProductPage {

    private final SelenideElement sauceLabsOneSize = $("#add-to-cart-sauce-labs-onesie");
    private final SelenideElement sauceLabsBikeLight = $("#add-to-cart-sauce-labs-bike-light");
    private final SelenideElement shoppingCardContainer = $("#shopping_cart_container");

    @Step("Add product 1")
    public ProductPage addSauceLabsOneSize() {
        sauceLabsOneSize.click();
        return this;
    }

    @Step("Add product 2")
    public ProductPage addSauceLabsBikeLight() {
        sauceLabsBikeLight.click();
        return this;
    }

    @Step("Go to shopping cart")
    public ProductPage goToShoppingCart() {
        shoppingCardContainer.click();
        return this;
    }

}