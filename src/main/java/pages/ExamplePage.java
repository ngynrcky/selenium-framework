package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExamplePage extends BasePage {

    private By signInButton = By.cssSelector("[aria-label='Sign in']");

    public ExamplePage(WebDriver driver) {
        super(driver);
    }

    public String getTitleText() {
        return driver.getTitle();
    }

    public String getSignInButtonText() {
        return findVisibleElement(signInButton, 2).getText();
    }
}
