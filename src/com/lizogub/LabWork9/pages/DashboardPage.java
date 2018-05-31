package com.lizogub.LabWork9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class DashboardPage {

    WebDriver driver;
    String dictionaryButtonXPath = "//*[@data-a-target='topmenu-dict']";
    String accountMenuDivXPath = "//*[@data-a-target='topmenu-account']";

    String currentURL = "https://lingualeo.com/ru/dashboard";

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void openDictionary(){
        String dictionaryURL = driver.findElement(By.xpath(dictionaryButtonXPath)).getAttribute("href");
        driver.get(dictionaryURL);
    }

    public ExpectedCondition isLoggedIn(){
        return ExpectedConditions.visibilityOfElementLocated(By.xpath(accountMenuDivXPath));
    }

    public void checkCurrentPage(){
        assertEquals(driver.getCurrentUrl(),currentURL,"Current url doesn't match " + currentURL);
    }
}
