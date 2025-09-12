package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ExamplePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;

public class ExampleSeleniumTest extends BaseTest {

    private ExamplePage examplePage;

    @BeforeMethod
    public void openExamplePage() {
        examplePage = new ExamplePage(driver);
        examplePage.open();
    }

    @Test
    public void titleShouldBeCorrect() {
        // Arrange: define expected page title
        String expectedTitle = "Google";
        
        // Act: get the actual page title
        String titleText = examplePage.getTitleText();
        System.out.println("Page title: " + titleText);

        // Assert: verify actual vs expected
        assertEquals(titleText, expectedTitle, "Page title should be '" + expectedTitle + "'");
    }

    @Test
    public void signInButtonShouldBeCorrect() {
        // Arrange: define expected button text
        String expectedSignInButtonText = "Sign in";

        // Act: get the actual button text
        String signInButtonText = examplePage.getSignInButtonText();
        System.out.println("Sign in button text: " + signInButtonText);

        // Assert: verify actual vs expected
        assertEquals(signInButtonText, expectedSignInButtonText, "Sign in button text should be '" + expectedSignInButtonText + "'");
    }

    @Test
    public void appButtonShouldBeToTheLeftOfTheSignInButton() {
        // Act: get the apps button
        WebElement appsButton = examplePage.getAppsButton();

        // Assert: verify apps button is displayed
        assertTrue(appsButton.isDisplayed(), "Apps button is displayed");
    }
}
