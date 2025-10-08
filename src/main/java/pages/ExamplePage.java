package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExamplePage extends BasePage {

    private By demoButton = By.xpath("//button[contains(@class,'demo_header_btn')]");
    private By signUpButton = By.xpath("//a[contains(@class,'signup')]");

    public ExamplePage(WebDriver driver) {
        super(driver);
    }

    public ExamplePage(WebDriver driver, String customPath) {
        super(driver, customPath);
    }

    public String getTitleText() {
        return driver.getTitle();
    }

    public WebElement getDemoButton() {
        return findElementLeftOf(getSignUpButton(), demoButton);
    }

    public WebElement getSignUpButton() {
        return findVisibleElement(signUpButton);
    }

    public String getSignUpButtonText() {
        return getSignUpButton().getText();
    }
}
