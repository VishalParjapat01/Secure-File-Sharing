📂 Secure File Sharing - E2E Testing Project
✅ Project Overview
This repository contains End-to-End (E2E) testing for the Secure File Sharing App. It includes:

📋 Manual Testing Artifacts

🤖 Automation Testing using Selenium (Java)

🧱 POM Design Pattern + Page Factory

🧪 TestNG Integration

📸 Screenshots included

📌 Manual Testing
📁 Deliverables:
Component	Description
🔹 Test Plan	Strategy, Scope, Test Types & Tools
🔹 Test Cases	Login & Signup features - positive/negative
🔹 Bug Report	Documented with severity, status, and summary
🔹 Summary Report	Final testing conclusion with status matrix
🔹 Mind Map	Visual coverage of testing modules
✅ Manual testing ensured all critical paths like SignUp, Login, and Validation scenarios were verified.

⚙️ Automation Testing
🔨 Tech Stack:
Language: Java

Framework: Selenium WebDriver + TestNG

Design Pattern: Page Object Model (POM)

Page Initialization: Page Factory

Build Tool: Maven

Version Control: GitHub

🚀 Features Automated:
Login Functionality

Signup Functionality

Validations & Alerts

Screenshot Capture on Failure

📸 Sample Screenshots
🔐 Login Page

📝 Signup Page

You can find more screenshots in the screenshots/ folder.

🧪 Test Execution
bash
Copy
Edit
# Clone the project
git clone https://github.com/your-username/secure-file-sharing-e2e.git

# Navigate into project
cd secure-file-sharing-e2e

# Run with Maven
mvn clean test
Test reports and screenshots will be generated under /test-output and /screenshots.

📁 Folder Structure
bash
Copy
Edit
secure-file-sharing-e2e/
│
├── manual/
│   ├── TestPlan.docx
│   ├── TestCases.xlsx
│   ├── BugReport.xlsx
│   ├── SummaryReport.docx
│   └── MindMap.png
│
├── src/test/java/
│   ├── pages/
│   ├── tests/
│   └── utils/
│
├── screenshots/
│   ├── Screenshot_Login.png
│   └── Screenshot_Signup.png
│
├── pom.xml
└── README.md
🧠 Learnings
Used POM for code reusability and clarity

Applied PageFactory for element initialization

Practiced assertion handling & failure screenshot captures

Simulated real-world QA cycle (Test Planning → Bug Reporting)


📬 Contact
For queries or feedback, connect on LinkedIn or raise an issue in the repo.
