package config;

import com.browserup.bup.BrowserUpProxy;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.apache.log4j.Logger;
import org.testng.ITest;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest implements ITest {

    private static final Logger LOG = Logger.getLogger(BaseTest.class);

    protected String mTestCaseName;
    protected BrowserUpProxy proxy;


    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(Method method) {
        this.mTestCaseName = method.getName();
        config.DriverManagerHelper.init(mTestCaseName);
        proxy = Objects.requireNonNull(WebDriverRunner.getSelenideProxy()).getProxy();
        clearBrowserCookies();
        clearBrowserLocalStorage();

        Configuration.baseUrl = "https://www.saucedemo.com/";
        open();
        LOG.info("@@ Open url: " + Configuration.baseUrl);
    }


    @Override
    public String getTestName() {
        return this.mTestCaseName;
    }
}