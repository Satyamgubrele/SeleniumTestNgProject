package com.framework.pages;

import org.openqa.selenium.*;

public class ProductPage {

    WebDriver driver;
    public String productPageUrl="https://www.saucedemo.com/inventory.html";
    By title = By.className("title");

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public String getPageTitle(){
        return driver.findElement(title).getText();
    }
    public String getPageUrl(){
        return productPageUrl;
    }
}