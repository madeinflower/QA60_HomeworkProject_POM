package com.homework.pages.interactions;

import com.homework.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement boxA;

    @FindBy(id = "column-b")
    WebElement boxB;

    @FindBy(css = "#column-a header")
    WebElement headerA;

    @FindBy(css = "#column-b header")
    WebElement headerB;

    public DragAndDropPage dragAtoBWithActions() {
        pause(1000);
        moveWithJS(0, 200);

        Actions actions = new Actions(driver);
        actions.clickAndHold(boxA)
                .moveToElement(boxB)
                .release()
                .build()
                .perform();

        return this;
    }

    public boolean isSwapped() {
        return headerA.getText().equals("B") && headerB.getText().equals("A");
    }
}

