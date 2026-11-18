# Java School Projects & Programming Exercises

A compilation of Java console applications developed during 1st-year BS Computer Engineering (BSCOME) programming. These projects demonstrate core Java fundamentals including user input handling (`Scanner`), string manipulation, arrays, control flow, and modular program design.

---

## Projects & Activities Overview

### 1. Student Grade Evaluation System (`Studentgradeevaluationsystem.java`)
A console-based academic evaluation tool that collects student profile details and term grades (Prelim, Midterm, and Finals).
* **Key Concepts:** `Scanner` input buffer management, formatted console output (`printf`), conditional grading rubrics, and multi-condition eligibility checks.
* **Features:** Computes the final average, assigns performance ratings (*Outstanding* to *Failed*), determines pass/fail status, and verifies academic eligibility based on minimum term grade thresholds.

### 2. Dynamic Word Guessing Game (`GuessTheWord.java`)
An interactive command-line word guessing game where players have up to 8 attempts to uncover a hidden secret token.
* **Key Concepts:** `while` loops, boolean state flags, `String` indexing (`charAt`), and dynamic string replacement.
* **Features:** Provides initial hints (character length, first and last characters) and unlocks progressive clue upgrades on Attempt 4 (revealing the middle character) and Attempt 6 (displaying a vowel-masked version of the word).

### 3. String Manipulation Activities (`Activity_1-3.java`, `Activity_4.java`, `Activity_5.java`)
A series of five practical string-processing utilities:
* **Activity 1 — Social Media Text Cleaner:** Strips whitespace and unwanted `#` symbols while normalizing text to lowercase.
* **Activity 2 — File Upload Gatekeeper:** Validates uploaded filenames to ensure they end with `.pdf` and contain no spaces.
* **Activity 3 — Credit Card Privacy Masker:** Verifies 16-digit card numbers and masks the first 12 digits for security.
* **Activity 4 — Promo Code Matcher:** Trims whitespace and performs case-insensitive validation (`equalsIgnoreCase`) for discount codes.
* **Activity 5 — Full Name Formatter:** Splits full names into arrays to extract the first name and format the last name in uppercase.

### 4. Weekly Expense Logger (`ExpenseLogger.java`)
A financial tracking utility that logs and summarizes weekday expenses from Monday to Friday.
* **Key Concepts:** Single-dimensional arrays, parallel array traversal, array element modification, and explicit `double` type casting.
* **Features:** Displays a daily expense breakdown and calculates both the total weekly spend and average daily expense.

### 5. Array Score Tracker (`ScoreTracker.java`)
An introductory exercise demonstrating array instantiation, default value inspection, element updates, and loop-based traversal.

### 6. Java Hands-On Multi-Problem Suite (`javahandson.java`)
A 5-in-1 console utility script solving everyday arithmetic and conditional problems:
1. **Celsius to Fahrenheit Converter:** Converts temperature inputs from °C to °F.
2. **Discount Applier:** Applies an automatic $10 discount on bills totaling $100 or more.
3. **Sign Checker:** Identifies whether an entered integer is positive or negative.
4. **Multiplication Calculator:** Computes the product of two integers.
5. **Square Area Calculator:** Calculates the area of a square given its side length.

---

## How to Run

### Prerequisites
* Java Development Kit (JDK) 8 or higher installed on your system.
* Online Java Compiler (e.g Onlinegdb, programiz, onecompiler)
