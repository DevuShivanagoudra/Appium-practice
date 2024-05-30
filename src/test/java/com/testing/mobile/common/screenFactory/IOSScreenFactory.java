package com.testing.mobile.common.screenFactory;

import io.appium.java_client.ios.IOSDriver;

public class IOSScreenFactory implements IScreenFactory {

    private final IOSDriver driver;

    public IOSScreenFactory(IOSDriver driver) {
        this.driver = driver;
    }
}
