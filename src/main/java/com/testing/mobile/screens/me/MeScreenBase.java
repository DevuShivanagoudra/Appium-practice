package com.testing.mobile.screens.me;

import com.testing.mobile.screens.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class MeScreenBase extends BaseScreen<AppiumDriver> {

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"sib\"`]")
    private WebElement signIn;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Email or phone number\"")
    private WebElement emailOrPhoneNumber;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Continue\"")
    private WebElement continueButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`label == \"Amazon password\"`]")
    private WebElement password;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Sign in\"`]")
    private WebElement signInButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeLink[`label CONTAINS \"Hello\"`]")
    private WebElement username;

    public MeScreenBase(final AppiumDriver driver) {
        super(driver);
    }

    /**
     * Taps on sign in button.
     */
    public void tapSignIn() {
        signIn.click();
    }

    /**
     * Enters email or phone number.
     *
     * @param emailID email id
     */
    public void enterEmailOrPhoneNumber(final String emailID) {
        emailOrPhoneNumber.sendKeys(emailID);
    }

    /**
     * Enters user password.
     *
     * @param userPassword user password
     */
    public void enterPassword(final String userPassword) {
        password.sendKeys(userPassword);
    }

    /**
     * Taps on continue button.
     */
    public void tapContinue() {
        continueButton.click();
    }

    /**
     * Taps on sign in button.
     */
    public void tapOnSignInButton() {
        signInButton.click();
    }

    @Override
    public void waitToLoad() {
        waitForElementToDisplay(signIn, driver, 30);
    }

    public void waitForEmailTextFieldToDisplay() {
        waitForElementToDisplay(emailOrPhoneNumber, driver, 30);
    }

    public void waitForPasswordTextFieldToDisplay() {
        waitForElementToDisplay(password, driver, 30);
    }

    public void waitForUserNameToDisplay() {
        waitForElementToDisplay(username,driver, 50);
    }

    /**
     * Checks username is displayed or not.
     *
     * @return true if username is displayed else false
     */
    public boolean isUsernameDisplayed() {
        return isDisplayed(username);
    }
}
