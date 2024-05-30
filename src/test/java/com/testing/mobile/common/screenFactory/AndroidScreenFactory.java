package com.testing.mobile.common.screenFactory;

import com.testing.mobile.screens.chooseyourlanguage.ChooseYourLanguageScreenAndroid;
import com.testing.mobile.screens.home.HomeScreenAndroid;
import com.testing.mobile.screens.login.LoginScreenAndroid;
import com.testing.mobile.screens.welcome.WelcomeScreenAndroid;
import io.appium.java_client.android.AndroidDriver;

public class AndroidScreenFactory implements IScreenFactory {

    private final AndroidDriver myDriver;

    public AndroidScreenFactory(AndroidDriver myDriver) {
        this.myDriver = myDriver;
    }

    public WelcomeScreenAndroid getWelcomeScreen() {
        return new WelcomeScreenAndroid(myDriver);
    }

    public LoginScreenAndroid getLoginScreen() {
        return new LoginScreenAndroid(myDriver);
    }

    public ChooseYourLanguageScreenAndroid getChooseYourLanguageScreen() {
        return new ChooseYourLanguageScreenAndroid(myDriver);
    }

    public HomeScreenAndroid getHomeScreen() {
        return new HomeScreenAndroid(myDriver);
    }
}
