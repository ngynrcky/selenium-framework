package com.ricky.seleniumtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest 
{
    protected WebDriver driver;

    @BeforeEach
    public void setUp(TestInfo testInfo) {
        System.out.println("===== Starting test: " + testInfo.getDisplayName() + " =====");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        // driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("===== Ending test =====\n");
        if (driver != null) {
            driver.quit();
        }
    }
}
