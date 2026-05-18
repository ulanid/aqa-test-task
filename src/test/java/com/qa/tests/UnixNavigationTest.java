package com.qa.tests;

import com.qa.pages.CategoriesModal;
import com.qa.pages.DevOpsPage;
import com.qa.pages.HomePage;
import com.qa.pages.UnixPage;
import com.qa.utils.JsonDataReader;
import com.qa.utils.NavigationData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UnixNavigationTest extends BaseTest {

    private NavigationData testData;

    @BeforeClass
    public void loadTestData() {
        testData = JsonDataReader.load("testdata/navigation.json", NavigationData.class);
    }

    @Test
    public void navigateToUnixPageViaCategories() {
        CategoriesModal modal = new HomePage()
                .open()
                .openCategories();

        DevOpsPage devOpsPage = modal.selectDevOps();

        UnixPage unixPage = devOpsPage.selectUnix();

        unixPage.verifyAll();
    }
}