# Selenium UI Automation Project

## Overview

This project demonstrates UI and API automation using Java with Selenium WebDriver and RestAssured, along with TestNG for test management.
It follows a clean, minimal structure with separation between reusable framework code and test cases.

---

## Project Structure

- `src/main/java` – Contains reusable framework classes such as page objects and utility classes.
- `src/test/java` – Contains base test setup and test classes with TestNG test methods for both UI and API tests, including BaseTest and BaseApiTest.

---

## Prerequisites

- Java JDK 17 or later installed and configured in your `PATH`.  
- Maven installed and configured in your `PATH`.  
- Chrome browser installed (for UI tests).
- ChromeDriver executable downloaded and its path configured in `BaseTest.java` (`System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver")`).

> **Note:** Make sure to download the ChromeDriver version matching your Chrome browser version and OS architecture.  
> [ChromeDriver downloads](https://chromedriver.chromium.org/downloads)

---

## Running Tests

1. Open a terminal at the project root directory.  
2. Run the following Maven command to clean, compile, and execute all TestNG tests (UI and API):

```bash
mvn clean test
