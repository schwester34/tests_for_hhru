package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.CredentialsConfig;
import helpers.Attach;

import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        String login = config.login();
        String password = config.password();
        String remote = System.getProperty("remote", "selenoid.autotests.cloud/wd/hub");
        String browserSize = System.getProperty("browserSize", "1920x1080");
        String browser = System.getProperty("browser", "chrome");


        Configuration.baseUrl = "https://ekaterinburg.hh.ru/";
        Configuration.browserSize = browserSize;
        Configuration.remote = "https://" + login + ":" + password + "@" + remote;
        Configuration.browser = browser;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("my screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();
    }
}
