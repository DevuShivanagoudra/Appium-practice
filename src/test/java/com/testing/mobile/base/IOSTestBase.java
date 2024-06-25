package com.testing.mobile.base;

import com.testing.mobile.common.screenFactory.IOSScreenFactory;
import com.testing.mobile.common.screenFactory.IScreenFactory;
import com.testing.mobile.screens.home.HomeScreenIOS;
import com.testing.mobile.screens.me.MeScreenIOS;
import com.testing.mobile.screens.widgets.tabbar.TabBarIOS;
import io.appium.java_client.ios.IOSDriver;

/**
 * This is 'IOSTestBase' class.
 */
public class IOSTestBase extends MobileTestBase<IOSDriver> {

    @Override
    public IScreenFactory getScreenFactory(final IOSDriver myDriver) {
        return new IOSScreenFactory(myDriver);
    }

    @Override
    protected IOSDriver createDriver() {
        return new IOSDriver(getEndPoint(), getCapabilities());
    }

    /**
     * Gets home screen.
     *
     * @return home screen
     */
    public HomeScreenIOS getHomeScreen() {
        return screenRegistry.get(HomeScreenIOS.class);
    }

    /**
     * Gets TabBar screen.
     *
     * @return tab-bar screen object
     */
    public TabBarIOS getTabBarScreen() {
        return screenRegistry.get(TabBarIOS.class);
    }

    /**
     * Gets Me screen.
     *
     * @return me screen object
     */
    public MeScreenIOS getMeScreen() {
        return screenRegistry.get(MeScreenIOS.class);
    }

    public void login() {
        getMeScreen().waitForEmailTextFieldToDisplay();
        getMeScreen().enterEmailOrPhoneNumber("reddeppapc1@gmail.com");
        getMeScreen().tapContinue();
        getMeScreen().waitForPasswordTextFieldToDisplay();
        getMeScreen().enterPassword("Reddeppa@3");
        getMeScreen().tapOnSignInButton();
    }
}
