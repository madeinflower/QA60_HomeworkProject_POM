package com.homework.pages.interactions;

import com.homework.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BasePage {
    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropDown;

    public DropDownPage option1Select() {
        Select select = new Select(dropDown);
        select.selectByVisibleText("Option 1");
        return this;
    }

    public DropDownPage option2Select() {
        Select select = new Select(dropDown);
        select.selectByVisibleText("Option 2");
        return this;
    }

    public String getSelectedOptionText() {
        Select select = new Select(dropDown);
        return select.getFirstSelectedOption().getText();
    }
}
