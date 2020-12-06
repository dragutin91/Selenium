package com.symphony.hooks;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import com.symphony.utils.Driver;

public class Hooks {

    @Before()
    public void beforeScenario()
    {
        System.setProperty("webdriver.chrome.driver", "/home/dragutin/driver/chromedriver");
        Driver.driver=new ChromeDriver();
        Driver.driver.manage().window().maximize();
    }

    @After
    public void afterScenario()
    {
        Driver.CloseDriver();
    }


}
