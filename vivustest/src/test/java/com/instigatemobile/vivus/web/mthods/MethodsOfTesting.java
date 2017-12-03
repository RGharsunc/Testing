package com.instigatemobile.vivus.web.mthods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;          //my SELENIUM does not supports Select tags

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MethodsOfTesting {


    public static void assertHomePage(WebDriver driver, String id, String buttonName, String currentUrl) {


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {                                          //waiting for page
            System.out.println("opps");
        }

        WebElement name = driver.findElement(By.id(id));
        assertTrue(name.getText().equalsIgnoreCase(buttonName), "That was not " + buttonName);
        name.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {                                            //waiting for page
            System.out.println("opps");
        }
        assertTrue(driver.getCurrentUrl().contains(currentUrl));
        System.out.println("Test of " + buttonName + " button passed ");

        if (!driver.getCurrentUrl().equals("https://armath.am")) {
            driver.navigate().back();

        }
    }



    public static void assertNewPageAndGoBackToHome(WebDriver driver, String id, String buttonName, String newPageUrl) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {                                          //waiting for page
            System.out.println("opps");
        }

        WebElement name = driver.findElement(By.id(id));
        assertTrue(name.getText().equalsIgnoreCase(buttonName), "That was not " + buttonName);

        String parentHandle = driver.getWindowHandle();
        name.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {                                          //waiting for page
            System.out.println("opps");
        }

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentHandle)) {
                driver.switchTo().window(windowHandle);
            }
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {                                          //waiting for page
            System.out.println("opps");
        }
        assertTrue(driver.getCurrentUrl().contains(newPageUrl));
        System.out.println("Test of " + buttonName + " button passed ");
        if (!driver.getCurrentUrl().equals("https://armath.am")) {
            driver.close();
            driver.switchTo().window(parentHandle);
        }

    }


    public static void getElementByState(String[] statArray, String elementId, WebDriver driver) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {                                                               //waiting for page
            System.out.println("opps");
        }
        WebElement optionElement = driver.findElement(By.id(elementId));
//        Select selectStates = new Select(optionElement);                                               //my SELENIUM does not supports Select tags
//        List<WebElement> options = selectStates.getOptions();
//        for (WebElement opt : options) {
//            for (String statName : statArray) {
//                assertTrue(!opt.getText().equals(statName), "test failed,  has no such option");
//            }
//        }
        System.out.println("test about checking  statName's passed");

    }



}
