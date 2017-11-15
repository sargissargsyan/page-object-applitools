package com.example.setup;

import org.testng.annotations.AfterTest;

import static com.example.setup.SeleniumDriver.getDriver;
import static com.example.setup.SeleniumDriver.getEyes;
import static com.example.setup.SeleniumDriver.resetDriver;

/**
 * SeleniumBaseTest
 *
 * Created by Sargis on 11/11/17.
 */
public class SeleniumBaseTest {
    @AfterTest
    public static void tearDown() {
        if (getDriver() != null) {
            getEyes().close();
            resetDriver();
        }
    }
}
