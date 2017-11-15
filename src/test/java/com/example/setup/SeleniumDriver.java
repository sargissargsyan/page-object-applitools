package com.example.setup;

import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Selenium driver wrapper
 *
 * Created by Sargis on 11/11/17.
 */
public class SeleniumDriver {

	private static WebDriver driver;
	private static Eyes eyes;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-fullscreen");
			driver = new ChromeDriver(options);
			eyes = new Eyes();
			eyes.setApiKey("<API Key here>"); //todo replace with your API key

			eyes.open(driver, "Visual Testing Intro!", "My Visual Selenium Java test!");
		}

		return driver;
	}

	public static Eyes getEyes() {
		return eyes;
	}

	public static void resetDriver() {
		driver.quit();
		driver = null;
	}

}
