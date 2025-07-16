package com.homework.pages.widgets;

import com.homework.pages.AlertsPage;
import com.homework.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContextMenuPage extends BasePage {
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "hot-spot")
    WebElement box;

    public void rightClickInTheBox() {
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent()).accept();
    }
}
