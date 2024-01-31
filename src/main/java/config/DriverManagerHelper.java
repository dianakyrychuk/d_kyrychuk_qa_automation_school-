package config;

import com.browserup.bup.BrowserUpProxy;
import com.browserup.bup.proxy.CaptureType;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
import com.codeborne.selenide.WebDriverRunner;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.net.NetworkUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.log4testng.Logger;

import java.time.Duration;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;

@UtilityClass
public class DriverManagerHelper {

    private static final Logger LOG = Logger.getLogger(DriverManagerHelper.class);


    public static void init(String testName) {
        initDriver(testName);
    }


    private static void initDriver(String testName) {
        LOG.info("### starting driver...");

        configSelenide(testName);
        var proxy = configProxy();
        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT);

        LOG.info("### driver is ready to work...");
    }

    public static BrowserUpProxy configProxy() {
        var proxy = Objects.requireNonNull(WebDriverRunner.getSelenideProxy()).getProxy();
        proxy.addRequestFilter((httpRequest, httpMessageContents, httpMessageInfo) -> {
            httpRequest.headers().remove("Accept-Language");
            httpRequest.headers().add("X-Forwarded-For", "179.60.183.228");
            httpRequest.headers().add("Accept-Language", "en");
            return null;
        });
        return proxy;
    }

    public static void configSelenide(String testName) {
        Configuration.proxyEnabled = true;
        Configuration.proxyHost = new NetworkUtils().getNonLoopbackAddressOfThisMachine();
        Configuration.fileDownload = FileDownloadMode.PROXY;
        Configuration.pageLoadTimeout = 120_000;
        setConfiguration(testName);

        open("https://www.saucedemo.com/");
        WebDriverRunner.getWebDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        WebDriverRunner.getWebDriver().manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
    }


    public static void setConfiguration(String testName) {
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.headless = false;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.screenshots = true;
        Configuration.savePageSource = true;
        Configuration.reportsFolder = "test-result/reports";
        Configuration.timeout = 4000;
        Configuration.browserCapabilities = capabilities(testName);}


    public static DesiredCapabilities capabilities(String testName) {
        var capabilities = new DesiredCapabilities();
        var options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        capabilities.setCapability("goog:chromeOptions", options);

        // Selenoid
        capabilities.setCapability("enableVideo", false);
        capabilities.setCapability("videoName", testName + ".mp4");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("sessionTimeout", "2m");
        capabilities.setCapability("timeZone", "Europe/Kiev");
        return capabilities;
    }


}