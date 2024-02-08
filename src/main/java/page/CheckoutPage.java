package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;


public class CheckoutPage {

    private final SelenideElement finishButton = $("#finish");
    private final SelenideElement TAX_LABEL = $(".summary_tax_label");
    private final SelenideElement TOTAL_LABEL = $(".summary_total_label");

    @Step("Calculate tax percent")
    public void calculateAndPrintTaxPercentage() {
        double taxValue = extractValueFromLabel(TAX_LABEL);
        double totalValue = extractValueFromLabel(TOTAL_LABEL);
        double taxPercentage = (taxValue / totalValue) * 100;

        String formattedTaxPercentage = String.format(Locale.US, "%.2f", taxPercentage);
        System.out.println("Tax Percentage: " + formattedTaxPercentage + "%");
    }

    @Step("Extract value")
    private double extractValueFromLabel(SelenideElement label) {
        String labelText = label.getText().replaceAll("[^\\d.]", "");
        return Double.parseDouble(labelText);
    }

    @Step("Click finish")
    public void clickFinish() {
        finishButton.click();
    }

}
