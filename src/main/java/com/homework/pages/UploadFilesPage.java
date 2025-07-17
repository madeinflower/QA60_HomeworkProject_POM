package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadFilesPage extends BasePage{
    public UploadFilesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#file-upload")
    WebElement fileUploadButton;

    public UploadFilesPage uploadFile(String path){
        fileUploadButton.sendKeys(path);
        return this;
    }

    @FindBy(css = "#file-submit")
    WebElement fileSubmitButton;

    public UploadFilesPage submitFile() {
        clickWithJS(fileSubmitButton,0,300);
        return this;
    }

    @FindBy(xpath = "//h3[normalize-space()='File Uploaded!']")
    WebElement successMessage;

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }
}
