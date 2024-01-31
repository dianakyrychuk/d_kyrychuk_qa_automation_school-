package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


public class CheckoutPage {

    private final SelenideElement finishButton = $("#finish");

    public CheckoutPage getTaxesPercent() {
        System.out.println("Total amount of taxes is 8%");
        return this;
    }

    public CheckoutPage clickFinish() {
        finishButton.click();
        return this;
    }

}
