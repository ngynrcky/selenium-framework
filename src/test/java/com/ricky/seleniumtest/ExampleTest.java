package com.ricky.seleniumtest;

import com.ricky.seleniumtest.pages.ExamplePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExampleTest extends BaseTest {

    @Test
    public void headingShouldBeCorrect() {
        System.out.println("Navigating to login page...");
        driver.get("https://example.com");

        ExamplePage page = new ExamplePage(driver);
        System.out.println("Asserting page title...");
        assertEquals("Example Domain", page.getHeadingText());
    }
}
