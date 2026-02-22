package com.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.framework.utils.ConfigReader;

public class DriverFactory {

    static WebDriver driver;

    public static WebDriver initDriver() {

        String browser = ConfigReader.get("browser");

        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.get("url"));

        return driver;
    }

        public static WebDriver getDriver(){
        return driver;
        }
}