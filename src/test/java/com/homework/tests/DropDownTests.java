package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.interactions.DropDownPage;
import com.homework.pages.widgets.ContextMenuPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTests extends TestBase{

    DropDownPage dropDownPage;

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).openDropDownPage();
        dropDownPage = new DropDownPage(driver);
    }


    @Test
    public void option1SelectTest(){
        dropDownPage.option1Select();
        Assert.assertEquals("Option 1", dropDownPage.getSelectedOptionText());
    }

    @Test
    public void option2SelectTest(){
        dropDownPage.option2Select();
        Assert.assertEquals("Option 2", dropDownPage.getSelectedOptionText());
    }

}
