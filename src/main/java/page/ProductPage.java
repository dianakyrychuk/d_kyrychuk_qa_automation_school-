package page;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class ProductPage {

    private final ElementsCollection productList = $$x("//*[@id=\"inventory_container\"]");
    private final SelenideElement sauceLabsOneSize = $("#add-to-cart-sauce-labs-onesie");
    private final SelenideElement sauceLabsBikeLight = $("#add-to-cart-sauce-labs-bike-light");

    private final SelenideElement shoppingCardContainer = $("#shopping_cart_container");

    public ProductPage checkProductList() {
        productList.shouldHave(CollectionCondition.size(6));
        return this;
    }

    public ProductPage addSauceLabsOneSize() {
        sauceLabsOneSize.click();
        return this;
    }

    public ProductPage addSauceLabsBikeLight() {
        sauceLabsBikeLight.click();
        return this;
    }

    public ProductPage goToShoppingCart() {
        shoppingCardContainer.click();
        return this;
    }

}