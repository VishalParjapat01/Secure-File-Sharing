# 🔐 Secure File Sharing - E2E Testing Project
This repository contains comprehensive End-to-End (E2E) testing for a Secure File Sharing Application. It includes both manual and automation testing using the Selenium framework in Java, along with detailed test documentation and reports.

## 📽️ Demo Video
👉 Watch Project Demo  https://drive.google.com/file/d/1uVXck3sP49q7OgtXr4hYo6LDCkUNoHuH/view?usp=sharing

## ✅ Project Overview
This project simulates a real-world QA cycle, covering everything from test planning to bug reporting and automated test execution.

## 📋 Manual Testing Artifacts
## 📁 Deliverables:

🔹 Test Plan – Strategy, Scope, Types of Testing, Tools Used

🔹 Test Cases – Covering Login, Signup, Dashboard, Logout (Positive & Negative Scenarios)

🔹 Bug Report – Documented with severity, status, and detailed descriptions

🔹 Summary Report – Final test summary with test status matrix

🔹 Mind Map – Visual overview of testing coverage and modules

## 🤖 Automation Testing
⚙️ Tech Stack:

Language: Java

Framework: Selenium WebDriver + TestNG

Design Pattern: Page Object Model (POM)

Page Initialization: Page Factory

Build Tool: Maven

Version Control: GitHub

```
## 🚀 Automated Features
✅ Login Functionality
✅ Signup Functionality
✅ Dashboard Interactions
✅ Logout Functionality
✅ Validations & Alert Handling
✅ Screenshot Capture on Test Failure

```

## 🧪 How to Run
Clone the repository

Navigate to the project directory

Run the tests using Maven:

bash
Copy
Edit
mvn clean test
View the reports in /test-output and screenshots in /screenshots

## 📁 Project Structure
```
secure-file-sharing-e2e/
│
├── manual/                          # All manual testing artifacts
│   ├── Test Plan for File Sharing Application.docx
│   ├── Test Plan + Bug report (1).xlsx
│   ├── Test Summary Report.docx
│   ├── Secure File Sharing Mind map.jpeg
│
├── src/                             # Source folder for automation code
│   └── test/java/
│       ├── pages/                   # Page Object Model (POM) classes
│       ├── tests/                   # Test cases for different modules
│       └── utils/                   # Utility classes (e.g., config, helpers)
│
├── screenshots/                     # Screenshots captured during test execution
├── test-output/                     # TestNG reports and outputs
├── pom.xml                          # Maven project file for dependencies and config
└── README.md                        # Project documentation and setup guide


```


```
## 🧠 Key Learnings
✅ Implemented Page Object Model (POM) for clean, maintainable code
✅ Used PageFactory for efficient WebElement initialization
✅ Practiced assertion handling and screenshot capture on failure
✅ Simulated a full QA lifecycle: Planning → Execution → Bug Reporting

```
