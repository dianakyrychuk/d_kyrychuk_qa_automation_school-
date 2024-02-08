package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SuccessPage {

    private final SelenideElement sauceLabsOneSize = $(byText("Thank you for your order!"));


    @Step("Check success text")
    public SuccessPage checkSuccessText() {
        sauceLabsOneSize.shouldBe(visible);
        return this;
    }
}


