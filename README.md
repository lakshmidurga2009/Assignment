# Assignment
# Assignment Automation Testing

## Overview

This project is an automation testing framework for verifying the insurance application process using Selenium WebDriver and Cucumber. The goal is to ensure that users can successfully complete the application flow, including all necessary validations and interactions.

## Technologies Used

- **Java**: The primary programming language used for test scripts.
- **Selenium WebDriver**: For browser automation.
- **Cucumber**: For behavior-driven development (BDD) testing framework.
- **JUnit**: For running tests and managing test suites.
- **Maven**: For dependency management.

## Project Structure

- `PageObjects/`: Contains the `AssignmentPage` class, which encapsulates the web elements and interactions for the insurance application.
- `io/step/definitions/`: Contains the step definitions for Cucumber scenarios, mapping feature steps to Java methods.
- `com/runner/`: Contains the test runner class to execute the Cucumber tests.
- `src/test/resources/Features/`: Contains the Cucumber feature files outlining the test scenarios.

## Prerequisites

- Java Development Kit (JDK) 11 or higher.
- Apache Maven 3.6.0 or higher.
- An IDE (e.g., IntelliJ IDEA, Eclipse) for Java development.
**Cucumber Features**

The main feature file is located at src/test/resources/Features/Assignment.feature. It outlines the following scenarios:

    User interactions for completing the insurance application.
    Verification of page navigation and input validations.

Reporting

Test results are generated in multiple formats. Check the Reports/ directory for:

    HTML report: report.html
    JSON report: report.json- 

## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/lakshmidurga2009/Assignment.git
2. **Install Dependencie**
3. mvn install
4. mvn test or run the runner file in eclipse directly

 
