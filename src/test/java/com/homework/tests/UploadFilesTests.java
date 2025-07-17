package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.UploadFilesPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadFilesTests extends TestBase {
    UploadFilesPage uploadFilesPage;

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).openUploadFilesPage();
        uploadFilesPage = new UploadFilesPage(driver);
    }

    @Test
    public void fileUploadTest(){
        uploadFilesPage.uploadFile("C:/Tools/Kotovnik.jpg")
                .submitFile();

        Assert.assertTrue(uploadFilesPage.isSuccessMessageDisplayed(), "'File Uploaded!' message is not displayed");
}


}