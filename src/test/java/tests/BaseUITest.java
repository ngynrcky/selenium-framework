package tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;

public class BaseUITest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(ITestResult result) {
        System.out.println("===== Starting test: " + result.getMethod().getMethodName() + " =====");
        System.out.println("[INFO] Initializing WebDriver...");

        driver = DriverFactory.createDriver();

        System.out.println("[INFO] WebDriver initialized.");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (driver != null) {
            System.out.println("[INFO] Quitting WebDriver...");
            driver.quit();
            System.out.println("[INFO] WebDriver quit successfully.");
        }
        System.out.println("===== Ending test: " + result.getMethod().getMethodName() + " =====");
    }
}
