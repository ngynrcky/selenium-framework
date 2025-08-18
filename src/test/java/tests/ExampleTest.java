package tests;

import org.testng.annotations.Test;

import pages.ExamplePage;

import static org.testng.Assert.assertEquals;

public class ExampleTest extends BaseTest {

    @Test
    public void titleShouldBeCorrect() {
        String expectedTitle = "Google";
        String expectedSignInButtonText = "Sign in";

        System.out.println("Navigating to page...");
        driver.get("https://www.google.com/");

        ExamplePage page = new ExamplePage(driver);
        String titleText = page.getTitleText();
        System.out.println("Page title: " + titleText);
        assertEquals(titleText, expectedTitle, "Page title should be '" + expectedTitle + "'");

        String signInButtonText = page.getSignInButtonText();
        System.out.println("Sign in button text: " + signInButtonText);
        assertEquals(signInButtonText, expectedSignInButtonText, "Sign in button text should be '" + expectedSignInButtonText + "'");
    }
}
