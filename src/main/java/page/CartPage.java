package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement sauceLabsOneSize = $(byText("7.99"));
    private final SelenideElement sauceLabsBikeLight = $(byText("9.99"));

    private final SelenideElement checkoutButton = $("#checkout");

    public CartPage checkSauceLabsOneSizeIsAdded() {
        sauceLabsOneSize.shouldBe(visible).click();
        return this;
    }

    public CartPage checkSauceLabsBikeLightIsAdded() {
        sauceLabsBikeLight.shouldBe(visible).click();
        return this;
    }

    public CartPage clickCheckoutButton() {
        checkoutButton.click();
        return this;
    }
}
