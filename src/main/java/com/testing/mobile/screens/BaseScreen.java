package com.testing.mobile.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import java.time.Duration;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseScreen<D extends AppiumDriver> {

    final AppiumFieldDecorator decorator;

    protected final D driver;

    public BaseScreen(final D driver) {
        this.driver = driver;
        this.decorator = new AppiumFieldDecorator(driver);
        PageFactory.initElements(this.decorator, this);
    }

    public abstract void waitToLoad();

    /**
     * Waits for element to display.
     *
     * @param element element
     * @param driver driver
     * @param duration duration
     */
    public static void waitForElementToDisplay(final WebElement element, final AppiumDriver driver, final int duration) {
        getWait(driver, duration).until(myDriver -> element.isDisplayed());
    }

    /**
     * Gets wait.
     *
     * @param driver driver
     * @param timeDuration time duration
     * @return web driver wait
     */
    public static WebDriverWait getWait(final AppiumDriver driver, final int timeDuration) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeDuration));
    }

    /**
     * Gets driver.
     *
     * @return driver
     */
    public D getDriver() {
        return driver;
    }

    public boolean isDisplayed(final WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NotFoundException exception) {
            return false;
        }
    }
}
