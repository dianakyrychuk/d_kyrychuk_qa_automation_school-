package SaucedemoTest;

import config.Browser;
import io.qameta.allure.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.*;
import static com.codeborne.selenide.Selenide.open;

public class SaucedemoTest {

    private final LoginPage loginPage = new LoginPage();
    private final ProductPage productPage = new ProductPage();
    private final CartPage cartPage = new CartPage();
    private final InformationPage informationPage = new InformationPage();
    private final CheckoutPage checkoutPage = new CheckoutPage();
    private final SuccessPage successPage = new SuccessPage();

    @BeforeTest
    public void setUpBrowser() {
        Browser.setBrowser();
    }

    @Test (description = "test that checks valid process of purchase")
    @Feature("Frontend tests")
    @Description("Check saucedemo bying")
    @TmsLink("TMS")
    @Link("https://www.saucedemo.com/")
    public void checkBuying() {
        loginPage.openUrl()
                .setLogin("standard_user")
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

    @AfterTest(alwaysRun = true)
    public void tearDownBrowser() {
        Browser.closeBrowser();
    }
}
