package com.homework.pages.widgets;

import com.homework.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HoversPage extends BasePage {
    public HoversPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "(//img[@alt='User Avatar'])")
    List<WebElement> avatars;

    @FindBy(xpath = "(//div[@class='figcaption']/h5)")
    List<WebElement> names;

    @FindBy(xpath = "(//div[@class='figcaption']/a)")
    List<WebElement> links;


    public HoversPage hoverToUser(int index) {
        new Actions(driver).moveToElement(avatars.get(index)).perform();
        pause(500);
        return this;
    }


    public HoversPage verifyHovers(int index, String expectedName, String expectedLinkText) {
        Assert.assertTrue(names.get(index).isDisplayed(), "User name is not displayed!");
        Assert.assertEquals(names.get(index).getText(), expectedName);

        Assert.assertTrue(links.get(index).isDisplayed(), "User profile link is not displayed!");
        Assert.assertEquals(links.get(index).getText(), expectedLinkText);

        return this;
    }

}
