package com.qa.tests;

import com.qa.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        DriverManager.setUp();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverManager.tearDown();
    }
}