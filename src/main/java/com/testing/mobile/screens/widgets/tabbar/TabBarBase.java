package com.testing.mobile.screens.widgets.tabbar;

import com.testing.mobile.screens.BaseScreen;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class TabBarBase extends BaseScreen {

    public TabBarBase(AppiumDriver driver) {
        super(driver);
    }

    public void tapTabBarOption(String tabBarOption) {
        driver.findElement(By.name(tabBarOption)).click();
    }

    @Override
    public void waitToLoad() {

    }
}
