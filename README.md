# Selenium Framework

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

⚡ Note on WebDrivers:
Since Selenium 4.6+, manual driver setup is no longer required.
Selenium Manager
 automatically downloads and configures the correct browser driver (ChromeDriver, GeckoDriver, etc.) at runtime.

---

## Running Tests

1. Open a terminal at the project root directory.  
2. Run the following Maven command to clean, compile, and execute all TestNG tests (UI and API):

```bash
mvn clean test
