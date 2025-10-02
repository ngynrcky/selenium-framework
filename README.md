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

- Java JDK 21 or later installed and configured in your `PATH`.  
- Maven installed and configured in your `PATH`.  
- Chrome browser installed (for UI tests).

⚡ Note on WebDrivers:
Since Selenium 4.6+, manual driver setup is no longer required.
Selenium Manager
 automatically downloads and configures the correct browser driver (ChromeDriver, GeckoDriver, etc.) at runtime.

---

## Code Formatting

This project uses [Palantir Java Format](https://github.com/palantir/palantir-java-format) (via Spotless) for consistent code style.

**First-time setup (required):**
```bash
# Unix/Mac
./scripts/setup-hooks.sh

# Windows
scripts\setup-hooks.bat
```
This installs a Git pre-commit hook that validates formatting before each commit.

**Formatting your code:**
```bash
# Check formatting
mvn verify

# Auto-format all files
mvn spotless:apply
```
IDE Integration (optional): Install the Palantir Java Format plugin for your IDE (VS Code, IntelliJ, Eclipse) to enable format-on-save. The pre-commit hook will enforce formatting regardless of your IDE choice.

---

## Running Tests

1. Open a terminal at the project root directory.  
2. Run the following Maven command to clean, compile, and execute all TestNG tests (UI and API):

```bash
mvn clean test
```