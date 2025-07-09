package com.homework.tests;


import com.homework.pages.AlertsPage;
import com.homework.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).openAlertsPage();
    }

    @Test
    public void clickForJSAlertTest(){
        new AlertsPage(driver).jsAlert();
    }

    @Test
    public void clickForJSConfirmCancelTest(){
        new AlertsPage(driver).selectResult("Cancel").verifyResult("Cancel");
    }

    @Test
    public void sendMessageToAlert(){
        new AlertsPage(driver).sendMessageToAlert("Some message here").verifyMessage("Some message here");
    }



}
