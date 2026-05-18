package com.qa.driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.qa.config.AppConfig;

public class DriverManager {

    private DriverManager() {}

    public static void setUp() {
        AppConfig config = AppConfig.getInstance();

        Configuration.browser = config.getBrowser();
        Configuration.headless = config.isHeadless();
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.timeout = config.getTimeout();
        Configuration.pageLoadTimeout = config.getPageLoadTimeout();
        Configuration.screenshots = true;
        Configuration.savePageSource = false;
    }

    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}