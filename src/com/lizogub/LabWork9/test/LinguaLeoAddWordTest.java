package com.lizogub.LabWork9.test;

import com.lizogub.LabWork9.pages.DashboardPage;
import com.lizogub.LabWork9.pages.DictionaryPage;
import com.lizogub.LabWork9.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinguaLeoAddWordTest {

    public static void main(String[] args) {

        String word = "humanity";

        System.setProperty("webdriver.gecko.driver","/opt/geckodriver");

        WebDriver driver = new FirefoxDriver();
        DashboardPage dashboardPage = new DashboardPage(driver);
        DictionaryPage dictionaryPage = new DictionaryPage(driver);

        login(driver);

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(dashboardPage.isLoggedIn());

        dashboardPage.openDictionary();

        wait.until(dictionaryPage.dictionaryLoaded());

        dictionaryPage.enterTextToSearchBox(word);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dictionaryPage.clickAddButton();

        wait.until(dictionaryPage.translationLoaded());

        dictionaryPage.clickTranslationWord();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    protected static void login(WebDriver driver){

        LoginPage loginPage = new LoginPage(driver);

        driver.get("https://lingualeo.com/ru");
        driver.findElement(By.id("headEnterBtn")).click();
        loginPage.enterEmail("vadlvadl789@gmail.com");
        loginPage.enterPassword("pAsSw04dR");
        loginPage.clickSendButton();

    }
}
