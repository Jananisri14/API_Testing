package com.tests;
import java.net.URL;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppLaunchTest {

    public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("CPH2467");
        options.setUdid("a5621e7a");

        options.setAppPackage("com.oneplus.calculator");
        options.setAppActivity("com.android.calculator2.Calculator");
        options.setNoReset(true);

        AndroidDriver driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                options);

        System.out.println("App launched successfully");

        Thread.sleep(5000);

        WebElement two =
                driver.findElement(
                        AppiumBy.id("com.oneplus.calculator:id/digit_2"));

        WebElement plus =
                driver.findElement(
                        AppiumBy.id("com.oneplus.calculator:id/img_op_add"));

        WebElement one =
                driver.findElement(
                        AppiumBy.id("com.oneplus.calculator:id/digit_1"));

        WebElement equal =
                driver.findElement(
                        AppiumBy.id("com.oneplus.calculator:id/img_eq"));

        two.click();
        plus.click();
        one.click();
        equal.click();

        System.out.println("2 + 1 completed successfully");

        Thread.sleep(5000);

        driver.quit();
    }
}