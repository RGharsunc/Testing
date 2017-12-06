package com.instigatemobile.vivus.web.methodsOfTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;


public class MethodsOfTesting {

    private static void waitingForBrowser(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            System.out.println("oops");
        }
    }

    public static void assertHomePage(WebDriver driver, WebElement name, String currentUrl, String elementName, int timeOut) {
        waitingForBrowser(timeOut);
        assertTrue(name.getText().equalsIgnoreCase(elementName), "Expected: " + elementName + ", Actual: " + name.getText() + ";");
        name.click();
        waitingForBrowser(timeOut);
        assertTrue(driver.getCurrentUrl().contains(currentUrl));
        System.out.println("Test of " + elementName + " button passed ");
        if (!driver.getCurrentUrl().equals("https://armath.am")) {
            driver.navigate().back();

        }
    }


    public static void assertNewPageAndGoBackToHome(WebDriver driver, WebElement name, String newPageUrl, String element, int timeOut) {
        waitingForBrowser(timeOut);
        assertTrue(name.getText().equalsIgnoreCase(element), "Expected: " + element + ", Actual: " + name.getText() + ";");
        String parentHandle = driver.getWindowHandle();
        name.click();
        waitingForBrowser(timeOut);
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentHandle)) {
                driver.switchTo().window(windowHandle);
            }
        }
        waitingForBrowser(timeOut);
        assertTrue(driver.getCurrentUrl().contains(newPageUrl));
        System.out.println("Test of " + element + " button passed ");
        if (!driver.getCurrentUrl().equals("https://armath.am")) {
            driver.close();
            driver.switchTo().window(parentHandle);
        }

    }


    public static void getElementByState(String[] stateList, String elementId, WebDriver driver, int timeOut) {
        waitingForBrowser(timeOut);
        WebElement optionElement = driver.findElement(By.id(elementId));
        Select selectTag = new Select(optionElement);
        List<WebElement> options = selectTag.getOptions();
        List<String> optNameList = new ArrayList<>();
        for (WebElement opt : options) {
            optNameList.add(opt.getText());
        }
        for (int i = 0; i < stateList.length - 1; i++) {
            assertTrue(optNameList.contains(stateList[i]), "State list isn't contains state named: " + stateList[i] + ";");
            System.out.println(stateList[i] + " exists;");
        }
        System.out.println("test for checking  statName's passed");

    }


}
