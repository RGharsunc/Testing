
package com.instigatemobile.vivus.web;

import static com.instigatemobile.vivus.web.methodsOfTesting.MethodsOfTesting.assertHomePage;
import static com.instigatemobile.vivus.web.methodsOfTesting.MethodsOfTesting.assertNewPageAndGoBackToHome;
import static com.instigatemobile.vivus.web.methodsOfTesting.MethodsOfTesting.getElementByState;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class HomePageTest {

String driverPath="E:\\GitRepository\\Testing\\vivustest\\src\\test\\java\\com\\instigatemobile\\vivus\\web\\resources\\chromedriver.exe";
    @Test
    void checkManueButtons() {
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(driver);


        //HOME button's assertion
        assertHomePage(homePage.getWebDriver(), homePage.getHomeButton(driver), homePage.getHomeButtonUrl(), homePage.getHomeButtonText(), 2000);


        //ABOUT button's assertion
        assertHomePage(homePage.getWebDriver(), homePage.getAboutButton(driver), homePage.getAboutButtonUrl(), homePage.getAboutButtonText(), 2000);

        //ARMATH LABS buttons assertion
        assertHomePage(homePage.getWebDriver(), homePage.getLabsButton(driver), homePage.getLabsButtonUrl(), homePage.getLabsButtonText(), 2000);


        //ONLINE RESOURCES buttons assertion
        assertNewPageAndGoBackToHome(driver, homePage.getResourcesButton(driver), homePage.getResourcesButtonUrl(), homePage.getResourcesButtonText(), 2000);

        //EVENTS buttons assertion
        assertHomePage(homePage.getWebDriver(), homePage.getEventsButton(driver), homePage.getEventsButtonUrl(), homePage.getEventsButtonText(), 2000);

        //PARTNERS buttons assertion
        assertHomePage(homePage.getWebDriver(), homePage.getPartnersButton(driver), homePage.getPartnersButtonUrl(), homePage.getPartnersButtonText(), 2000);

        //GALLERY buttons assertion
        assertHomePage(homePage.getWebDriver(), homePage.getGalleryButton(driver), homePage.getGalleryButtonUrl(), homePage.getGalleryButtonText(), 2000);

        //CONTACTS buttons assertion
        assertHomePage(homePage.getWebDriver(), homePage.getContactsButton(driver), homePage.getContactsButtonUrl(), homePage.getContactsButtonText(), 2000);

        //DONATE buttons assertion
        assertHomePage(homePage.getWebDriver(), homePage.getDonateButton(driver), homePage.getDonateButtonUrl(), homePage.getDonateButtonText(), 2000);


        driver.close();
    }


    @Test
    void checkStatesNames() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        LabsPage labsPage = new LabsPage(driver);

        getElementByState(labsPage.getStatArray(), labsPage.getSelectTagId(), driver,2000);
        driver.close();
    }


}
