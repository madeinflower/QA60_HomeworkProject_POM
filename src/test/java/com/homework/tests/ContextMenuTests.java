package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.widgets.ContextMenuPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContextMenuTests extends TestBase{

    ContextMenuPage contextMenuPage;

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).openContextMenuPage();
        contextMenuPage = new ContextMenuPage(driver);
    }

    @Test
    public void rightClickContextMenuTest(){
        contextMenuPage.rightClickInTheBox();
    }
}
