# Appium_Contacts-App

This repository contains automated test cases for the Contacts App, ensuring that all functionalities work as expected.

## Table of Contents
1. [Test Framework Structure](#test-framework-structure)
   - [Framework Design](#framework-design)
   - [Configuration](#configuration)
2. [Test Cases](#test-cases)
   - [1. Add Valid Contact](#add-valid-contact)
3. [Setup Instructions](#setup-instructions)

## Test Framework Structure

### Framework Design
The test automation framework is built using **Appium** for mobile automation and **TestNG** for structuring test cases and managing test execution. The framework is designed to be modular and maintainable, supporting easy addition of new test cases.

**Key Components:**
- **Base Classes**: Provides common functionalities for all tests, such as Appium driver setup and teardown.
- **Page Object Model (POM)**: Each screen of the application has a corresponding class, encapsulating its elements and actions.
- **Test Suites**: Organized by features, with separate XML files for execution.
- **Utilities**: Contains helper functions for common operations like reading data from files or generating random data.

### Configuration
The framework is configured with the necessary dependencies, ensuring that it can run independently on any machine. All local dependencies are bundled within the project. The following libraries are included:

- **Appium Java**: For mobile automation
- **TestNG**: For test management
- **Java Properties**: For configuration management
- **Extent Reports**: For generating detailed test reports

## Test Cases

### 1. Add Valid Contact
#### Test Case ID: TC_ADD_VALID_CONTACT_001

**Description**: Validate that a user can successfully create a contact by entering valid data in all fields and saving it.

#### Preconditions
- The user is logged into the Contacts App.
- The app is functioning properly.

#### Test Steps
1. Open the Contacts app on the mobile device.
2. Tap on the **"Add Contact"** button.
3. Fill in the following fields with valid data:
   - **First Name**: "John"
   - **Last Name**: "Doe"
   - **Phone Number**: "1234567890"
   - **Email**: "john.doe@example.com"
4. Tap on the **"Save"** button.
5. Confirm that a success message appears.

#### Expected Result
- The contact should be successfully created, and the user should see a success message (e.g., "Contact saved successfully").
- The new contact should appear in the contacts list with the correct details.

## Setup Instructions

### 1. Clone the Repository
Clone the project repository from your version control system (e.g., Git).

### 2. Install Java and Maven
Ensure that you have Java (JDK 8 or higher) and Maven installed on your machine.

### 3. Import the Project
Import the project into your IDE (e.g., IntelliJ IDEA or Eclipse) as a Maven project.

### 4. View Reports
After execution, reports will be generated in the specified output directory (e.g., `target/surefire-reports` for TestNG and `extent-reports` for Extent Reports).

#### Dependencies
Ensure that the following is added to your `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>io.appium</groupId>
        <artifactId>java-client</artifactId>
        <version>8.x.x</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.x.x</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>com.aventstack</groupId>
        <artifactId>extentreports</artifactId>
        <version>5.x.x</version>
    </dependency>
</dependencies>
