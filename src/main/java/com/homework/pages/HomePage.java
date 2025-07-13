package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/javascript_alerts']")
    WebElement alertsLink;

    public HomePage openAlertsPage() {
        click(alertsLink);
        return this;
    }

    @FindBy(css = "a[href='/horizontal_slider']")
    WebElement horizontalSlider;

    public HomePage selectHorizontalSlider() {
        click(horizontalSlider);
        return this;
    }

    @FindBy(css = "a[href='/hovers']")
    WebElement hovers;

    public HomePage openHoversPage() {
        click(hovers);
        return this;
    }
}
