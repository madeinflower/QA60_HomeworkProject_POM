package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.interactions.DragAndDropPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTests extends TestBase{

    DragAndDropPage dragAndDropPage;

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).openDragAndDropPage();
        dragAndDropPage = new DragAndDropPage(driver);
    }

    @Test
    public void testDragAndDropWithActions() {
        DragAndDropPage page = new DragAndDropPage(driver);
        page.dragAtoBWithActions();
        Assert.assertTrue(page.isSwapped(), "Boxes are not swapped!");
    }

}
