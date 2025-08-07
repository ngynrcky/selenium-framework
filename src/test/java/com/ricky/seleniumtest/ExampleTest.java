package com.ricky.seleniumtest;

import com.ricky.seleniumtest.pages.ExamplePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest extends BaseTest {

    @BeforeEach
    public void setUpTest() {
        setUp(); // from BaseTest
    }

    @AfterEach
    public void tearDownTest() {
        tearDown(); // from BaseTest
    }

    @Test
    public void headingShouldBeCorrect() {
        driver.get("https://example.com");
        ExamplePage page = new ExamplePage(driver);
        assertEquals("Example Domain", page.getHeadingText());
    }
}
