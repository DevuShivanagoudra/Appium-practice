package com.testing.mobile.screens.home;

import com.testing.mobile.screens.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreenBase extends BaseScreen {

    @AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/qtips_framelayout")
    private WebElement home;

    public HomeScreenBase(final AppiumDriver driver) {
        super(driver);
    }

    @Override
    public void waitToLoad() {
        waitForElementToDisplay(home, getDriver(),20);
    }

    /**
     * Checks home screen is displayed or not.
     *
     * @return true if home screen is displayed else false
     */
    public boolean isHomeScreenDisplayed() {
        return isDisplayed(home);
    }
}
