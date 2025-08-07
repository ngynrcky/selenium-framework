# Selenium UI Automation Project

## Overview

This project demonstrates UI automation using Selenium WebDriver with Java and JUnit 5.  
It follows a clean, minimal structure with separation between reusable framework code and test cases.

---

## Project Structure

- `src/main/java` – Contains reusable framework classes such as base test setup and page objects.  
- `src/test/java` – Contains test classes with JUnit 5 test methods.

---

## Prerequisites

- Java JDK 17 or later installed and configured in your `PATH`.  
- Maven installed and configured in your `PATH`.  
- Chrome browser installed.  
- ChromeDriver executable downloaded and its path configured in `BaseTest.java` (`System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver")`).

> **Note:** Make sure to download the ChromeDriver version matching your Chrome browser version and OS architecture.  
> [ChromeDriver downloads](https://chromedriver.chromium.org/downloads)

---

## Running Tests

1. Open a terminal at the project root directory.  
2. Run the following Maven command to clean, compile, and execute all tests:

```bash
mvn clean test
