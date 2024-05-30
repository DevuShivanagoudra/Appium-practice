package com.testing.mobile.android;

import com.testing.mobile.base.AndroidTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.testing.mobile.common.ChooseYourLanguage.ENGLISH;

public class HomeTest extends AndroidTestBase {

    @Test
    public void testHomeScreen() {
        getChooseYourLanguageScreen().selectYourLanguage(ENGLISH);
        getChooseYourLanguageScreen().waitToLoad();
        getChooseYourLanguageScreen().tapContinue();
        getHomeScreen().waitToLoad();
        Assert.assertTrue(getHomeScreen().isHomeScreenDisplayed(), "Home screen is not displayed");
    }
}
