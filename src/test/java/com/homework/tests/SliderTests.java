package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.SliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectHorizontalSlider();
    }

    @Test
    public void sliderTest() {
        new SliderPage(driver).moveSliderInHorizontalDir().verifySliderValue("5");
    }

}
