package com.lizogub.LabWork9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage {

    WebDriver driver;
    String dictionaryButtonXPath = "//*[@data-a-target='topmenu-dict']";
    String accountMenuDivXPath = "//*[@data-a-target='topmenu-account']";

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void openDictionary(){
        String dictionaryURL = driver.findElement(By.xpath(dictionaryButtonXPath)).getAttribute("href");
        driver.get(dictionaryURL);
    }

    public ExpectedCondition isLoggedIn(){
        return ExpectedConditions.presenceOfElementLocated(By.xpath(accountMenuDivXPath));
    }
}
