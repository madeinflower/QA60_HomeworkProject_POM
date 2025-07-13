package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.widgets.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HoversTests extends TestBase{


    HoversPage hoversPage;

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).openHoversPage();
        hoversPage = new HoversPage(driver);
    }

    @DataProvider(name = "hoverData")
    public Object[][] hoverData() {
        return new Object[][]{
                {0, "name: user1", "View profile"},
                {1, "name: user2", "View profile"},
                {2, "name: user3", "View profile"},
        };
    }


    @Test(dataProvider = "hoverData")
    public void hoverUserTest(int index, String expectedName, String expectedLinkText) {
        hoversPage.hoverToUser(index)
                .verifyHovers(index, expectedName, expectedLinkText);
    }

}
