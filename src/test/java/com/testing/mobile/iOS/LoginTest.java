package com.testing.mobile.iOS;

import com.testing.mobile.base.IOSTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.testing.mobile.common.TabBarOptions.ME;

public class LoginTest extends IOSTestBase {

    @Test
    public void testLogin() {
        getHomeScreen().waitToLoad();
        getTabBarScreen().tapTabBarOption(ME.getOption());
        getMeScreen().waitToLoad();
        getMeScreen().tapSignIn();
        login();
        getMeScreen().waitForUserNameToDisplay();
        Assert.assertTrue(getMeScreen().isUsernameDisplayed(), "User is not logged in.");
    }
}
