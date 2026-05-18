package com.qa.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    public HomePage open() {
        Selenide.open("/");
        return this;
    }

    public CategoriesModal openCategories() {
        $$("a, button, span")
                .findBy(text("Categories"))
                .shouldBe(visible)
                .click();
        return new CategoriesModal();
    }
}