package com.instigatemobile.vivus.web;


import org.openqa.selenium.WebDriver;


public class HomePage {

    private WebDriver webDriver;

    public HomePage(WebDriver driver, String url) {
        webDriver = driver;
        webDriver.get(url);
    }
}
