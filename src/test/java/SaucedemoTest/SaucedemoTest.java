package SaucedemoTest;

import config.BaseTest;
import org.testng.annotations.Test;
import page.*;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class SaucedemoTest extends BaseTest {

    private final LoginPage loginPage = new LoginPage();
    private final ProductPage productPage = new ProductPage();
    private final CartPage cartPage = new CartPage();
    private final InformationPage informationPage = new InformationPage();
    private final CheckoutPage checkoutPage = new CheckoutPage();
    private final SuccessPage successPage = new SuccessPage();


    @Test
    public void checkBuying() {
        open("https://www.saucedemo.com/");
        loginPage.setLogin("standard_user")
                .setPassword("secret_sauce")
                .clickLoginButton();
        productPage.addSauceLabsOneSize()
                .addSauceLabsBikeLight()
                .goToShoppingCart();
        cartPage.checkSauceLabsOneSizeIsAdded()
                .checkSauceLabsBikeLightIsAdded()
                .clickCheckoutButton();
        informationPage.setFirstName("Pes")
                .setLastName("Patron")
                .setZipCode("12345")
                .clickContinue();
        checkoutPage.calculateAndPrintTaxPercentage();
        checkoutPage.clickFinish();
        successPage.checkSuccessText();
    }
}
