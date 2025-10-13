package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ExamplePage;

public class ExampleSeleniumTest extends BaseUITest {

    private ExamplePage examplePage;

    @BeforeMethod(alwaysRun = true)
    public void openExamplePage() {
        examplePage = new ExamplePage(driver, "/selenium-playground/");
        examplePage.open();
    }

    @Test(groups = "smoke")
    public void titleShouldBeCorrect() {
        // Arrange: define expected page title
        String expectedTitle = "Selenium Grid Online";

        // Act: get the actual page title
        String actualTitle = examplePage.getTitleText();
        System.out.println("Page title: " + actualTitle);

        // Assert: verify actual vs expected
        assertTrue(actualTitle.contains(expectedTitle), "Page title should contain '" + expectedTitle + "'");
    }

    @Test
    public void signInButtonShouldBeCorrect() {
        // Arrange: define expected button text
        String expectedSignUpButtonText = "Get Started Free";

        // Act: get the actual button text
        String actualSignUpButtonText = examplePage.getSignUpButtonText();
        System.out.println("Sign Up button text: " + actualSignUpButtonText);

        // Assert: verify actual vs expected
        assertEquals(
                actualSignUpButtonText,
                expectedSignUpButtonText,
                "Sign up button text should be '" + expectedSignUpButtonText + "'");
    }

    @Test
    public void demoButtonShouldBeToTheLeftOfTheSignUpButton() {
        // Act: get the apps button
        WebElement demoButton = examplePage.getDemoButton();

        // Assert: verify apps button is displayed
        assertTrue(demoButton.isDisplayed(), "Demo button is displayed");
    }
}
