package com.testing.mobile.screens.login;

import com.testing.mobile.screens.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

/**
 * This is 'LoginScreenBase' class.
 */
public class LoginScreenBase extends BaseScreen<AppiumDriver> {

    @AndroidFindBy(xpath = "\"//android.view.View[@class='android.view.View' and @text='Email or phone number']/following-sibling::android.view.View//android.widget.EditText[@class='android.widget.EditText']\"")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"Email or phone number\"`]")
    private WebElement emailID;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='ap_password']")
    @iOSXCUITFindBy(accessibility = "Amazon password")
    private WebElement password;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='signInSubmit']")
    @iOSXCUITFindBy(accessibility = "Continue")
    private WebElement signInButton;

    public LoginScreenBase(final AppiumDriver driver) {
        super(driver);
    }

    @Override
    public void waitToLoad() {
    }

    /**
     * Enters user name.
     *
     * @param userName user name
     */
    public void enterUserName(final String userName) {
        emailID.sendKeys(userName);
    }

}
