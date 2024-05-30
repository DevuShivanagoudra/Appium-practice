package com.testing.mobile.screens.chooseyourlanguage;

import com.testing.mobile.common.ChooseYourLanguage;
import com.testing.mobile.screens.BaseScreen;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

/**
 * This is 'ChooseYourLanguageScreenBase' class.
 */
public class ChooseYourLanguageScreenBase extends BaseScreen<AppiumDriver> {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.amazon.mShop.android.shopping:id/continue_button\")")
    private WebElement continueButton;

    public ChooseYourLanguageScreenBase(final AppiumDriver driver) {
        super(driver);
    }

    @Override
    public void waitToLoad() {
        waitForElementToDisplay(continueButton, driver, 20);
    }

    public void selectYourLanguage(final ChooseYourLanguage language) {
        driver.findElement(AppiumBy.accessibilityId(language.getLanguage())).click();
    }

    /**
     * Taps on Continue button.
     */
    public void tapContinue() {
        continueButton.click();
    }

}
