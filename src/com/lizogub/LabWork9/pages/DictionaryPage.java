package com.lizogub.LabWork9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DictionaryPage {

    WebDriver driver;
    String searchBoxInputXPath = "//*[@data-search-word-form]//child::*[@data-search-input]";
    String addWordButtonXPath = "//*[@data-search-word-form]//child::button[@data-search-submit]";
    String transwordTextXPath = "//div[@data-tran-item]";

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
        return ExpectedConditions.presenceOfElementLocated(By.xpath(searchBoxInputXPath));
    }

    public ExpectedCondition translationLoaded(){
        return ExpectedConditions.presenceOfElementLocated(By.xpath(transwordTextXPath));
    }

}
