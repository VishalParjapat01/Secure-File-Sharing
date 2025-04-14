🔐 Secure File Sharing - E2E Testing Project
This repository contains comprehensive End-to-End (E2E) testing for a Secure File Sharing Application. It includes both manual and automation testing using the Selenium framework in Java, along with detailed test documentation and reports.

📽️ Demo Video
👉 Watch Project Demo

✅ Project Overview
This project simulates a real-world QA cycle, covering everything from test planning to bug reporting and automated test execution.

📋 Manual Testing Artifacts
📁 Deliverables:

🔹 Test Plan – Strategy, Scope, Types of Testing, Tools Used

🔹 Test Cases – Covering Login, Signup, Dashboard, Logout (Positive & Negative Scenarios)

🔹 Bug Report – Documented with severity, status, and detailed descriptions

🔹 Summary Report – Final test summary with test status matrix

🔹 Mind Map – Visual overview of testing coverage and modules

🤖 Automation Testing
⚙️ Tech Stack:

Language: Java

Framework: Selenium WebDriver + TestNG

Design Pattern: Page Object Model (POM)

Page Initialization: Page Factory

Build Tool: Maven

Version Control: GitHub

🚀 Automated Features
✅ Login Functionality
✅ Signup Functionality
✅ Dashboard Interactions
✅ Logout Functionality
✅ Validations & Alert Handling
✅ Screenshot Capture on Test Failure

🧪 How to Run
Clone the repository

Navigate to the project directory

Run the tests using Maven:

bash
Copy
Edit
mvn clean test
View the reports in /test-output and screenshots in /screenshots

secure-file-sharing-e2e/              Root directory of the project
│
├── manual/                           Manual testing artifacts
│   ├── Test Plan for File Sharing Application.docx      Test plan document
│   ├── Test Plan + Bug report (1).xlsx                  Combined plan & bugs
│   ├── Test Summary Report.docx                         Summary report
│   └── Secure File Sharing Mind map.jpeg                Mind map overview
│
├── src/test/java/                    Source code for automated tests
│   ├── pages/                        Page Object Model classes
│   ├── tests/                        Test case files
│   └── utils/                        Utility/helper functions
│
├── screenshots/                      Screenshots from failed test executions
├── test-output/                      TestNG HTML reports
├── pom.xml                           Maven project dependencies
└── README.md                         Project documentation and setup instructions




🧠 Key Learnings
✅ Implemented Page Object Model (POM) for clean, maintainable code
✅ Used PageFactory for efficient WebElement initialization
✅ Practiced assertion handling and screenshot capture on failure
✅ Simulated a full QA lifecycle: Planning → Execution → Bug Reporting

