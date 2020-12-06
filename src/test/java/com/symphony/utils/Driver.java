package com.symphony.utils;

import org.openqa.selenium.WebDriver;

public  class Driver {

    public static WebDriver driver;

    public static void CloseDriver()
    {
        driver.quit();
    }

}
