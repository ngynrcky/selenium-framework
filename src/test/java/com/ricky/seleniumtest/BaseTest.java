package com.ricky.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(ITestResult result) {
        System.out.println("===== Starting test: " + result.getMethod().getMethodName() + " =====");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        System.out.println("===== Ending test: " + result.getMethod().getMethodName() + " =====");
        if (driver != null) {
            driver.quit();
        }
    }
}
