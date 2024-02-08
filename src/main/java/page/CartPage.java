package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement sauceLabsOneSize = $(byText("7.99"));
    private final SelenideElement sauceLabsBikeLight = $(byText("9.99"));

    private final SelenideElement checkoutButton = $("#checkout");

    @Step("Check product 1 is added")
    public CartPage checkSauceLabsOneSizeIsAdded() {
        sauceLabsOneSize.shouldBe(visible).click();
        return this;
    }

    @Step("Check product 2 is added")
    public CartPage checkSauceLabsBikeLightIsAdded() {
        sauceLabsBikeLight.shouldBe(visible).click();
        return this;
    }

    @Step("Click checkout button")
    public CartPage clickCheckoutButton() {
        checkoutButton.click();
        return this;
    }
}
