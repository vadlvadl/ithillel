package com.lizogub.LabWork9.test;
import com.lizogub.LabWork9.pages.DashboardPage;
import com.lizogub.LabWork9.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LinguaLeoLoginTest {

    @Test
    public void loginTest() {
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\vadim\\IdeaProjects\\stdyHillel\\src\\com\\lizogub\\LabWork9\\geckodriver.exe");
//        System.setProperty("webdriver.gecko.driver","/opt/geckodriver");
        System.setProperty("webdriver.chrome.driver","C:\\IdeaProjects\\Libraries\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
        LoginPage loginPage = new LoginPage(driver);

        driver.get("https://lingualeo.com/ru");
        driver.findElement(By.id("headEnterBtn")).click();
        loginPage.enterEmail("vadlvadl789@gmail.com");
        loginPage.enterPassword("pAsSw04dR");
        loginPage.clickSendButton();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DashboardPage dashboardPage = new DashboardPage(driver);

//        assertTrue(dashboardPage.isHomePage());
        assertEquals(dashboardPage.isLoggedIn(), true);

        // Close the driver
        driver.quit();
    }
}