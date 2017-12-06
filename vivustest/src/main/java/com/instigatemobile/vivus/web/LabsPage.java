package com.instigatemobile.vivus.web;

import org.openqa.selenium.WebDriver;

public class LabsPage {


    private WebDriver webDriver;
    private final String url = "https://www.armath.am/labs.html";
    private final String selectTagId="id_states";
    private final String[] statArray = {"Yerevan", "Aragatsotn", "Ararat", "Armavir", "Gegharkunik", "Kotayk", "Lori", "Shirak", "Syunik", "Vayots Dzor", "Tavush", "Artsakh"};


    public LabsPage(WebDriver driver) {
         webDriver = driver;
        webDriver.get(getUrl());
    }


    public WebDriver getWebDriver() {
        return webDriver;
    }

    public String getUrl() {
        return url;
    }

    public String[] getStatArray() {
        return statArray;
    }

    public String getSelectTagId() {
        return selectTagId;
    }
}
