package com.framework.pages;

import org.openqa.selenium.*;
import com.framework.utils.WaitUtil;

public class LoginPage {

    WebDriver driver;

    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");
    By errorMsg = By.cssSelector("h3[data-test='error']");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(String user,String pass){

        WaitUtil.waitForElement(driver, username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
    public String getErrormsg(){
        return driver.findElement(errorMsg).getText();
    }
}