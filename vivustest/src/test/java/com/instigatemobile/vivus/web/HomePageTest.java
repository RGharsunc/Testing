
package com.instigatemobile.vivus.web;

import static com.instigatemobile.vivus.web.mthods.MethodsOfTesting.assertHomePage;
import static com.instigatemobile.vivus.web.mthods.MethodsOfTesting.assertNewPageAndGoBackToHome;
import static com.instigatemobile.vivus.web.mthods.MethodsOfTesting.getElementByState;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;




public class HomePageTest {



    @Test
    void checkManueButtons() {
        System.setProperty("webdriver.chrome.driver", "E:\\GitRepository\\Testing\\vivustest\\src\\test\\java\\com\\instigatemobile\\vivus\\web\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(driver, "https://www.armath.am/");


        //HOME button's assertion
        assertHomePage(driver, "id_home", "HOME", "index.html");


        //ABOUT button's assertion
        assertHomePage(driver, "id_about", "ABOUT", "about.html");

        //ARMATH LABS buttons assertion
        assertHomePage(driver, "id_labs", "ARMATH LABS", "labs.html");


        //ONLINE RESOURCES buttons assertion
        assertNewPageAndGoBackToHome(driver, "id_online_resources", "ONLINE RESOURCES", "ggg.nairi.education");

        //EVENTS buttons assertion
        assertHomePage(driver, "id_events", "EVENTS", "events.html");

        //PARTNERS buttons assertion
        assertHomePage(driver, "id_partners", "PARTNERS", "partners.html");

        //GALLERY buttons assertion
        assertHomePage(driver, "id_gallery", "gallery", "gallery.html");

        //CONTACTS buttons assertion
        assertHomePage(driver, "id_contacts", "CONTACTS", "contacts.html");

        //DONATE buttons assertion
        assertHomePage(driver, "id_donate", "donate", "donate.html");


        driver.close();
    }




    @Test
    void chekStatesNames() {
//        System.setProperty("webdriver.chrome.driver", "/chromeDriver.exe");

        String[] statArray = {"Yereven", "Aragacotn", "Ararat", "Armavir", "Vajots Dzor", "Gegharkunik", "Koyayk", "Lori", "Shirak", "Syunik", "Tavush", "Arcakh"};
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage2 = new HomePage(driver, "https://armath.am/labs.html");
        getElementByState(statArray, "id_states", driver);
        driver.close();
    }


}
