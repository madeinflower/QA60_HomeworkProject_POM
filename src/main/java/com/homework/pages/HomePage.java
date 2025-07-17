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

    @FindBy(css = "a[href='/context_menu']")
    WebElement contextMenu;

    public HomePage openContextMenuPage() {
        click(contextMenu);
        return this;
    }

    @FindBy(css = "a[href='/dropdown']")
    WebElement dropDown;

    public HomePage openDropDownPage() {
        click(dropDown);
        return this;
    }

    @FindBy(css = "a[href='/drag_and_drop']")
    WebElement dragAndDrop;

    public HomePage openDragAndDropPage() {
        click(dragAndDrop);
        return this;
    }

    @FindBy(css = "a[href='/upload']")
    WebElement uploadFiles;

    public HomePage openUploadFilesPage() {
        click(uploadFiles);
        return this;
    }



}
