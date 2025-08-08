package com.ricky.seleniumtest;

import com.ricky.seleniumtest.pages.ExamplePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
