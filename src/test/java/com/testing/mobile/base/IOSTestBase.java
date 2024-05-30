package com.testing.mobile.base;

import com.testing.mobile.common.screenFactory.IOSScreenFactory;
import com.testing.mobile.common.screenFactory.IScreenFactory;
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

}
