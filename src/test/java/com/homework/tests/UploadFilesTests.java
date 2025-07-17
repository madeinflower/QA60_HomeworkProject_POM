package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.UploadFilesPage;
import com.homework.pages.interactions.DragAndDropPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.Paths;

public class UploadFilesTests extends TestBase {
    UploadFilesPage uploadFilesPage;

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).openUploadFilesPage();
        uploadFilesPage = new UploadFilesPage(driver);
    }

/*@Test
    public void fileUploadTest(){

}
*/

}