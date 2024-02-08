package page;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement userNameField = $("#user-name");
    private final SelenideElement passwordField = $("#password");
    private final SelenideElement loginButton = $("#login-button");


    @Step("Open url")
    public LoginPage openUrl(){
        Selenide.open("https://www.saucedemo.com/");
        return this;
    }

    @Step("Set {userName}")
    public LoginPage setLogin(String userName) {
        userNameField.setValue(userName);
        return this;
    }

    @Step("Set {password}")
    public LoginPage setPassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    @Step("Click login button")
    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }
}