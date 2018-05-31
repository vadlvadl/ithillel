package com.lizogub.LabWork9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class DictionaryPage {

    WebDriver driver;
    String searchBoxInputXPath = "//*[@data-search-word-form]//child::*[@data-search-input]";
    String addWordButtonXPath = "//*[@data-search-word-form]//child::button[@data-search-submit]";
    String transwordTextXPath = "//div[@data-tran-item]";
    String currentURL = "https://lingualeo.com/ru/glossary/learn/dictionary";

    public DictionaryPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterTextToSearchBox(String text){
        driver.findElement(By.xpath(searchBoxInputXPath)).sendKeys(text);
    }

    public void clickAddButton(){
        driver.findElement(By.xpath(addWordButtonXPath)).click();
    }

    public void clickTranslationWord(){
        driver.findElement(By.xpath(transwordTextXPath)).click();
    }

    public ExpectedCondition dictionaryLoaded(){
        return ExpectedConditions.urlToBe(currentURL);
    }

    public ExpectedCondition translationLoaded(){
        return ExpectedConditions.presenceOfElementLocated(By.xpath(transwordTextXPath));
    }

    public ExpectedCondition checkAddButtonClickable(){
        return ExpectedConditions.elementToBeClickable(By.xpath(addWordButtonXPath));
    }

    public void checkSearchBoxVisibility(){
        assertEquals(driver.findElement(By.xpath(searchBoxInputXPath)).isDisplayed(),true,"Search box not visible");
    }
}
