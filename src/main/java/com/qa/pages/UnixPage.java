package com.qa.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$$;

public class UnixPage {

    private final SelenideElement pageHeading = $x("//h1");
    private final SelenideElement breadcrumb  = $("ol.breadcrumb, .breadcrumb");

    public UnixPage verifyUrl() {
        String url = WebDriverRunner.url();
        Assert.assertTrue(url.contains("unix"), "URL should contain 'unix', but was: " + url);
        return this;
    }

    public UnixPage verifyTitle() {
        String title = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertTrue(title.contains("Unix"), "Title should contain 'Unix', but was: " + title);
        return this;
    }

    public UnixPage verifyHeading() {
        pageHeading.shouldBe(visible).shouldHave(text("Unix"));
        return this;
    }

    public UnixPage verifySidebar() {
        $$("a").findBy(text("Unix / Linux - Home"))
                .shouldBe(visible);
        return this;
    }

    public UnixPage verifyBreadcrumb() {
        $$("a, span, li")
                .findBy(text("Unix"))
                .shouldBe(visible);
        return this;
    }

    public UnixPage verifyAll() {
        return verifyUrl()
                .verifyTitle()
                .verifyHeading()
                .verifySidebar()
                .verifyBreadcrumb();
    }
}