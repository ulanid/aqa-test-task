package com.qa.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class CategoriesModal {

    public DevOpsPage selectDevOps() {
        $$("div a, a")
                .findBy(text("DevOps"))
                .shouldBe(visible)
                .click();
        return new DevOpsPage();
    }
}