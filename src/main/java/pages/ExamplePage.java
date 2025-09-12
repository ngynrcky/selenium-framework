package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExamplePage extends BasePage {

    private By appsButton = By.cssSelector("[aria-label='Google apps']");
    private By signInButton = By.cssSelector("[aria-label='Sign in']");

    public ExamplePage(WebDriver driver) {
        super(driver);
    }

    public String getTitleText() {
        return driver.getTitle();
    }

    public WebElement getAppsButton() {
        return findElementLeftOf(getSignInButton(), appsButton);
    }

    public WebElement getSignInButton() {
        return findVisibleElement(signInButton);
    }

    public String getSignInButtonText() {
        return getSignInButton().getText();
    }
}
