package com.qa.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class DevOpsPage {

    public UnixPage selectUnix() {
        $$("a, .tutorial-item a, .card a")
                .findBy(text("Unix"))
                .shouldBe(visible)
                .click();
        return new UnixPage();
    }
}