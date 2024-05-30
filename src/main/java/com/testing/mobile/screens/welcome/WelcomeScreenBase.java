package com.testing.mobile.screens.welcome;

import com.testing.mobile.screens.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

/**
 * This is 'WelcomeScreenBase' class.
 */
public class WelcomeScreenBase extends BaseScreen<AppiumDriver> {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign In\")")
    private WebElement signIn;


    public WelcomeScreenBase(final AppiumDriver driver) {
        super(driver);
    }

    /**
     * Taps on sign in button.
     */
    public void tapSignIn() {
        signIn.click();
    }

    @Override
    public void waitToLoad() {
        waitForElementToDisplay(signIn, driver, 20);
    }

}
