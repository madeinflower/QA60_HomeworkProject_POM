package com.homework.pages.widgets;

import com.homework.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SliderPage extends BasePage {
    public SliderPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input")
    WebElement sliderInput;
    public SliderPage moveSliderInHorizontalDir() {
        pause(1000);
        moveWithJS(0,200);
        new Actions(driver).dragAndDropBy(sliderInput, 60, 0).perform();
        return this;

    }
    @FindBy(id = "range")
    WebElement range;
    public SliderPage verifySliderValue(String number) {
        Assert.assertEquals(range.getText(), number);
        return this;
    }
}
