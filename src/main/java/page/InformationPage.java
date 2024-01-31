package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class InformationPage {

    private final SelenideElement firstNameField = $("#first-name");
    private final SelenideElement lastnameField = $("#last-name");
    private final SelenideElement zipCodeField = $("#postal-code");

    private final SelenideElement continueButton = $("#continue");

    public InformationPage setFirstName(String firstName) {
        firstNameField.setValue(firstName);
        return this;
    }

    public InformationPage setLastName(String lastName) {
        lastnameField.setValue(lastName);
        return this;
    }

    public InformationPage setZipCode(String zipCode) {
        zipCodeField.setValue(zipCode);
        return this;
    }

    public InformationPage clickContinue() {
        continueButton.click();
        return this;
    }
}