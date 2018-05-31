package com.lizogub.LabWork9.test;

import com.lizogub.LabWork9.pages.DashboardPage;
import com.lizogub.LabWork9.pages.DictionaryPage;
import com.lizogub.LabWork9.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LinguaLeoAddWordTest {

    @Test
    public void addWordTest() {

        String word = "narrow";

        System.setProperty("webdriver.gecko.driver","C:\\Users\\vadim\\IdeaProjects\\stdyHillel\\src\\com\\lizogub\\LabWork9\\geckodriver.exe");
//        System.setProperty("webdriver.gecko.driver","/opt/geckodriver");

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        DashboardPage dashboardPage = new DashboardPage(driver);
        DictionaryPage dictionaryPage = new DictionaryPage(driver);

        login(driver);
        wait.until(dashboardPage.isLoggedIn());

        dashboardPage.checkCurrentPage();
        dashboardPage.openDictionary();
        wait.until(dictionaryPage.dictionaryLoaded());

        dictionaryPage.checkSearchBoxVisibility();
        dictionaryPage.enterTextToSearchBox(word);
//        wait.until(dictionaryPage.checkAddButtonClickable());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dictionaryPage.clickAddButton();
        wait.until(dictionaryPage.translationLoaded());

        dictionaryPage.clickTranslationWord();

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
