package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigReader;

public abstract class BasePage {
    protected WebDriver driver;
    protected String baseUrl;
    protected String path;
    protected Wait<WebDriver> wait;

    // Default timeout (in seconds)
    private static final int DEFAULT_TIMEOUT = 5;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.baseUrl = ConfigReader.get("baseUrl");
        this.path = "/";
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
    }

    public BasePage(WebDriver driver, String customPath) {
        this(driver);
        this.path = customPath;
    }

    public void open() {
        String url = baseUrl + path;
        System.out.println("Navigating to page: " + url);
        driver.get(url);
    }

    protected WebElement findVisibleElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement findVisibleElement(By locator, int timeoutSeconds) {
        Wait<WebDriver> customWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        return customWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement findClickableElement(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected WebElement findClickableElement(By locator, int timeoutSeconds) {
        Wait<WebDriver> customWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        return customWait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
