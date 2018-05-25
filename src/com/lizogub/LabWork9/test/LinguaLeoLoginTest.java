package com.lizogub.LabWork9.test;
import com.lizogub.LabWork9.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinguaLeoLoginTest {

    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\vadim\\IdeaProjects\\stdyHillel\\src\\com\\lizogub\\LabWork9\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver","/opt/geckodriver");
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        LoginPage loginPage = new LoginPage(driver);

        driver.get("https://lingualeo.com/ru");
        driver.findElement(By.id("headEnterBtn")).click();
        loginPage.enterEmail("vadlvadl789@gmail.com");
        loginPage.enterPassword("test");
        loginPage.clickSendButton();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the driver
        driver.quit();
    }
}