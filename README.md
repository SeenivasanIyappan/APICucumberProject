# APICucumberProject

## Features
- BDD-Style API Testing: Leverages Cucumber for plain language feature files, making tests accessible and readable for everyone involved in the development process.
- REST Assured Integration: Employs REST Assured for simplifying HTTP calls and assertions in Java.
- Modular Structure: Organized package layout for features, step definitions, runners, and utilities, following industry best practices.
- Junit Support: Test execution managed via Junit and Maven.
- Extensible Design: Easily add new endpoints, scenarios, and step definitions as your API evolves.
- Reporting: Integrates with reporting tools for clear test results (with options like ExtentReports).

  Project Structure
  APICucumberProject
├── src
│   ├── main/java                # Application code (if any)
│   └── test/java
│       ├── features             # Gherkin .feature files
│       ├── stepdefinitions      # Step Definitions
│       ├── runners              # Test Runner classes (JUnit)
│       └── utils                # Utility/helper classes
├── src/test/resources           # Additional resources/data
├── pom.xml                      # Maven build configuration
└── README.md                    # Documentation

Getting Started

Prerequisites:
- Java 8 or newer
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse, etc.)
