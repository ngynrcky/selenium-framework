package tests;

import org.testng.annotations.Test;

import pages.ExamplePage;

import static org.testng.Assert.assertEquals;

public class ExampleTest extends BaseTest {

    @Test
    public void titleShouldBeCorrect() {
        String expectedTitle = "Google";

        ExamplePage page = new ExamplePage(driver);
        page.open();
        
        String titleText = page.getTitleText();
        System.out.println("Page title: " + titleText);
        assertEquals(titleText, expectedTitle, "Page title should be '" + expectedTitle + "'");
    }

    @Test
    public void signInButtonShouldBeCorrect() {
        String expectedSignInButtonText = "Sign in";

        ExamplePage page = new ExamplePage(driver);
        page.open();

        String signInButtonText = page.getSignInButtonText();
        System.out.println("Sign in button text: " + signInButtonText);
        assertEquals(signInButtonText, expectedSignInButtonText, "Sign in button text should be '" + expectedSignInButtonText + "'");
    }
}
