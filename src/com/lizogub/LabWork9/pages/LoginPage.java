package com.lizogub.LabWork9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    String emailInputXPath = "//*[@id='loginForm']//child::*[@name='email']";
    String passwordInputXPath = "//*[@id='loginForm']//child::*[@name='password']";
    String sendButtonXPath = "//*[@id='loginForm']//child::*[@data-element='send']";


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email){
        driver.findElement(By.xpath(emailInputXPath)).sendKeys(email);
    }

    public void enterPassword(String password){
        driver.findElement(By.xpath(passwordInputXPath)).sendKeys(password);
    }

    public void clickSendButton(){
        driver.findElement(By.xpath(sendButtonXPath)).click();
    }

}
