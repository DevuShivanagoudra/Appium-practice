package com.testing.mobile.common.screenFactory;

import com.testing.mobile.screens.home.HomeScreenIOS;
import com.testing.mobile.screens.me.MeScreenIOS;
import com.testing.mobile.screens.widgets.tabbar.TabBarIOS;
import io.appium.java_client.ios.IOSDriver;

public class IOSScreenFactory implements IScreenFactory {

    private final IOSDriver driver;

    public IOSScreenFactory(IOSDriver driver) {
        this.driver = driver;
    }

    public HomeScreenIOS getHomeScreen() {
        return new HomeScreenIOS(driver);
    }

    public TabBarIOS getTabBar() {
        return new TabBarIOS(driver);
    }

    public MeScreenIOS getMeScreen() {
        return new MeScreenIOS(driver);
    }
}
