package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class InformationPage {

    private final SelenideElement firstNameField = $("#first-name");
    private final SelenideElement lastnameField = $("#last-name");
    private final SelenideElement zipCodeField = $("#postal-code");

    private final SelenideElement continueButton = $("#continue");

    @Step("Set first name")
    public InformationPage setFirstName(String firstName) {
        firstNameField.setValue(firstName);
        return this;
    }

    @Step("Set last name")
    public InformationPage setLastName(String lastName) {
        lastnameField.setValue(lastName);
        return this;
    }

    @Step("Set zip code")
    public InformationPage setZipCode(String zipCode) {
        zipCodeField.setValue(zipCode);
        return this;
    }

    @Step("Click continue")
    public InformationPage clickContinue() {
        continueButton.click();
        return this;
    }
}