package com.ricky.seleniumtest.tests;

import com.ricky.seleniumtest.pages.ExamplePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExampleTest extends BaseTest {

    @Test
    public void titleShouldBeCorrect() {
        String expectedTitle = "Google";

        System.out.println("Navigating to page...");
        driver.get("https://www.google.com/");

        ExamplePage page = new ExamplePage(driver);
        String titleText = page.getTitleText();
        System.out.println("Page title: " + titleText);

        System.out.println("Asserting page title...");
        assertEquals(titleText, expectedTitle, "Page title should be '" + expectedTitle + "'");
    }
}
