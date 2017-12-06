package com.instigatemobile.vivus.web;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {

    private WebDriver webDriver;
    private final String url="https://www.armath.am/";
    private WebElement homeButton;
    private WebElement aboutButton;
    private WebElement labsButton;
    private WebElement resourcesButton;
    private WebElement eventsButton;
    private WebElement partnersButton;
    private WebElement galleryButton;
    private WebElement contactsButton;
    private WebElement donateButton;

    private final String homeButtonText="Home";
    private final String aboutButtonText="About";
    private final String labsButtonText="Armath Labs";
    private final String resourcesButtonText="Online Resources";
    private final String eventsButtonText="Events";
    private final String partnersButtonText="Partners";
    private final String galleryButtonText="Gallery";
    private final String contactsButtonText="Contacts";
    private final String donateButtonText="Donate";

    private final String homeButtonUrl="index.html";
    private final String aboutButtonUrl="about.html";
    private final String labsButtonUrl="labs.html";
    private final String resourcesButtonUrl="https://ggg.nairi.education/#1";
    private final String eventsButtonUrl="events.html";
    private final String partnersButtonUrl="partners.html";
    private final String galleryButtonUrl="gallery.html";
    private final String contactsButtonUrl="contacts.html";
    private final String donateButtonUrl="donate.html";



    public HomePage(WebDriver driver) {
        webDriver = driver;
        webDriver.get(getUrl());
    }


    public WebDriver getWebDriver() {
        return webDriver;
    }
    public String getUrl() {
        return url;
    }

    public WebElement getHomeButton(WebDriver driver) {

        homeButton=driver.findElement(By.id("id_home"));
        return homeButton;
    }
    public WebElement getAboutButton(WebDriver driver){
        aboutButton=driver.findElement(By.id("id_about"));
        return aboutButton;
    }
    public WebElement getLabsButton(WebDriver driver) {
        labsButton= driver.findElement(By.id("id_labs"));
        return  labsButton;
    }
    public WebElement getResourcesButton(WebDriver driver) {
        resourcesButton=driver.findElement(By.id("id_online_resources"));
        return resourcesButton;
    }
    public WebElement getEventsButton(WebDriver driver) {
        eventsButton= driver.findElement(By.id("id_events"));
        return eventsButton;
    }
    public WebElement getPartnersButton(WebDriver driver) {
        partnersButton=driver.findElement(By.id("id_partners"));
        return  partnersButton;
    }
    public WebElement getGalleryButton(WebDriver driver) {
        galleryButton=driver.findElement(By.id("id_gallery"));
        return  galleryButton;
    }
    public WebElement getContactsButton(WebDriver driver) {
        contactsButton=driver.findElement(By.id("id_contacts"));
        return  contactsButton;
    }
    public WebElement getDonateButton(WebDriver driver) {
        donateButton=driver.findElement(By.id("id_donate"));
        return  donateButton;
    }

    public String getHomeButtonText() {
        return homeButtonText;
    }
    public String getAboutButtonText() {
        return aboutButtonText;
    }
    public String getLabsButtonText() {
        return labsButtonText;
    }
    public String getResourcesButtonText() {
        return resourcesButtonText;
    }
    public String getEventsButtonText() {
        return eventsButtonText;
    }
    public String getPartnersButtonText() {
        return partnersButtonText;
    }
    public String getGalleryButtonText() {
        return galleryButtonText;
    }
    public String getContactsButtonText() {
        return contactsButtonText;
    }
    public String getDonateButtonText() {
        return donateButtonText;
    }

    public String getHomeButtonUrl() {
        return homeButtonUrl;
    }
    public String getAboutButtonUrl() {
        return aboutButtonUrl;
    }
    public String getLabsButtonUrl() {
        return labsButtonUrl;
    }
    public String getResourcesButtonUrl() {return resourcesButtonUrl;}
    public String getEventsButtonUrl() {
        return eventsButtonUrl;
    }
    public String getPartnersButtonUrl() {
        return partnersButtonUrl;
    }
    public String getGalleryButtonUrl() {
        return galleryButtonUrl;
    }
    public String getContactsButtonUrl() {
        return contactsButtonUrl;
    }
    public String getDonateButtonUrl() {
        return donateButtonUrl;
    }
}
