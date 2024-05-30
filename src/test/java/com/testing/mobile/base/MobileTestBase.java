package com.testing.mobile.base;

import com.testing.mobile.common.ScreenRegistry;
import com.testing.mobile.common.screenFactory.IScreenFactory;
import io.appium.java_client.AppiumDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class MobileTestBase<AD extends AppiumDriver> {
    public ScreenRegistry screenRegistry = new ScreenRegistry();
    private AD myDriver;

    public abstract IScreenFactory getScreenFactory(AD myDriver);

    protected ScreenRegistry getScreenRegistry() {
        return screenRegistry;
    }

    /**
     * Gets end point.
     *
     * @return url
     */
    public URL getEndPoint() {
        try {
            return new URL("http://127.0.0.1:4723/");
        } catch (MalformedURLException exception) {
            throw new RuntimeException(exception);
        }
    }

    protected abstract AD createDriver();

    /**
     * Set up the driver.
     */
    @BeforeMethod
    protected void setUpDriver() {
        try {
            if (myDriver != null) {
                myDriver.quit();
            }
            myDriver = createDriver();
        } catch (final Exception exception) {
            throw exception;
        }
        getScreenRegistry().setScreenFactory(getScreenFactory(myDriver));
    }

    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        Properties properties = System.getProperties();
        for (String propertyName : properties.stringPropertyNames()) {
            if (propertyName.startsWith("appium:")) {
                desiredCapabilities.setCapability(propertyName, System.getProperty(propertyName));
            }
        }
        return desiredCapabilities;
    }

    /**
     * Gets driver
     *
     * @return driver
     */
    public AD getDriver() {
        return myDriver;
    }

    /**
     * Quits driver
     */
    @AfterMethod
    public void quit() {
        if (myDriver != null) {
            myDriver.quit();
        }
    }
}
