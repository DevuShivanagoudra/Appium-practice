package com.testing.mobile.base;

import com.testing.mobile.common.screenFactory.AndroidScreenFactory;
import com.testing.mobile.common.screenFactory.IScreenFactory;
import com.testing.mobile.screens.chooseyourlanguage.ChooseYourLanguageScreenAndroid;
import com.testing.mobile.screens.home.HomeScreenAndroid;
import com.testing.mobile.screens.login.LoginScreenAndroid;
import com.testing.mobile.screens.welcome.WelcomeScreenAndroid;
import io.appium.java_client.android.AndroidDriver;

/**
 * This is 'AndroidTestBase' class.
 */
public class AndroidTestBase extends MobileTestBase<AndroidDriver> {


    @Override
    public IScreenFactory getScreenFactory(AndroidDriver myDriver) {
        return new AndroidScreenFactory(myDriver);
    }

    @Override
    protected AndroidDriver createDriver() {
        return new AndroidDriver(getEndPoint(), getCapabilities());
    }

    public WelcomeScreenAndroid getWelcomeScreen() {
        return screenRegistry.get(WelcomeScreenAndroid.class);
    }

    /**
     * Gets login screen.
     *
     * @return login screen
     */
    public LoginScreenAndroid getLoginScreen() {
        return screenRegistry.get(LoginScreenAndroid.class);
    }

    /**
     * Gets choose your language screen.
     *
     * @return choose your language screen
     */
    public ChooseYourLanguageScreenAndroid getChooseYourLanguageScreen() {
        return screenRegistry.get(ChooseYourLanguageScreenAndroid.class);
    }

    /**
     * Gets home screen.
     *
     * @return home screen
     */
    public HomeScreenAndroid getHomeScreen() {
        return screenRegistry.get(HomeScreenAndroid.class);
    }

}
