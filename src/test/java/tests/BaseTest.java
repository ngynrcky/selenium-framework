package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(ITestResult result) {
        System.out.println("===== Starting test: " + result.getMethod().getMethodName() + " =====");
        System.out.println("[INFO] Initializing ChromeDriver...");
        ChromeOptions options = new ChromeOptions();

        // Detect if running in GitHub Actions
        String ci = System.getenv("CI");
        if (ci != null && ci.equalsIgnoreCase("true")) {
            options.addArguments("--headless=new");   // use new headless mode
            options.addArguments("--disable-gpu");   // required on some systems
        }

        // Always enforce a consistent viewport size
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);
        System.out.println("[INFO] ChromeDriver initialized.");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (driver != null) {
            System.out.println("[INFO] Quitting ChromeDriver...");
            driver.quit();
            System.out.println("[INFO] ChromeDriver quit successfully.");
        }
        System.out.println("===== Ending test: " + result.getMethod().getMethodName() + " =====");
    }
}
