package com.homework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    JavascriptExecutor js;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver; // ← Добавить вот эту строку
        PageFactory.initElements(driver, this);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    public void clickWithJS(WebElement element, int x, int y) {

        moveWithJS(x, y);
        click(element);
    }

    public void moveWithJS(int x, int y) {
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    public void typeWithJS(WebElement element, String text, int x, int y) {
        moveWithJS(x, y);
        type(element, text);
    }

    public boolean shouldHaveText(WebElement element, String text, int time) {

        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element, text));

    }
    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void hideAd() {
        js.executeScript(
                "var ad = document.getElementById('fixedban'); if (ad) { ad.style.display = 'none'; }"
        );
    }

    public void hideFooter() {
        js.executeScript(
                "var footer = document.querySelector('#page-footer'); if (footer) { footer.style.display = 'none'; }"
        );
    }


    public void hideIFrames() {
        hideAd();
        hideFooter();
    }
}

