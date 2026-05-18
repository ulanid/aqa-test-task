package com.qa.utils;

/**
 * POJO that maps to testdata/navigation.json.
 */
public class NavigationData {

    private String category;
    private String expectedUrlFragment;
    private String expectedTitle;

    public String getCategory() { return category; }
    public String getExpectedUrlFragment() { return expectedUrlFragment; }
    public String getExpectedTitle() { return expectedTitle; }

    public void setCategory(String category) { this.category = category; }
    public void setExpectedUrlFragment(String expectedUrlFragment) { this.expectedUrlFragment = expectedUrlFragment; }
    public void setExpectedTitle(String expectedTitle) { this.expectedTitle = expectedTitle; }
}