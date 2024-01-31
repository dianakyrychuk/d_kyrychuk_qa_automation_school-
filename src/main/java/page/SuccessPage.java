package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SuccessPage {

    private final SelenideElement sauceLabsOneSize = $(byText("Thank you for your order!"));


    public SuccessPage checkSuccessText() {
        sauceLabsOneSize.shouldBe(visible);
        return this;
    }
}


