
package com.mycompany.studentgradeevaluationsystem;
//Mari, Niel Cedrick P. BSCOME 1stYear Sir. Gole Programming
import java.util.Scanner;

public class Studentgradeevaluationsystem {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("      Welcome Students!      ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter your Information");
        
        //used string to input the things that doesn't require number with the except of student id 
        //as student id includes dashes in uphsd
        
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter Course/Program: ");
        String courseProgram = scanner.nextLine();
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine(); // Clear buffer after age
        
        System.out.print("Enter Student Id: ");
        String studentId = scanner.nextLine();
        
        System.out.print("Enter Year Level: ");
        int yearLevel = scanner.nextInt();
        
        scanner.nextLine(); 
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("      Enter Your Grades        ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        //used double as grades may contain 2 or more decimal places
        System.out.print("Enter Prelim Grade: ");
        double pgrade = scanner.nextDouble();
        
        System.out.print("Enter Midterm Grade: ");
        double mgrade = scanner.nextDouble();
        
        System.out.print("Enter Final Grade: ");
        double fgrade = scanner.nextDouble();
        
        // Calculation of grade
        double totalGrade = (pgrade + mgrade + fgrade) / 3.0;
        
        String performance;
        String status;

        if (totalGrade >= 90) {
            performance = "Outstanding";
            status = "Passed";
        } else if (totalGrade >= 85) {
            performance = "Very Good";
            status = "Passed";
        } else if (totalGrade >= 80) {
            performance = "Good";
            status = "Passed";
        } else if (totalGrade >= 75) {
            performance = "Passed";
            status = "Passed";
        } else {
            performance = "Failed";
            status = "Failed";
        }
        
        String eligibility;
        if (totalGrade >= 75 && pgrade >= 70 && mgrade >= 70 && fgrade >= 70) {
            eligibility = "Eligible";
        } else {
            eligibility = "Not Eligible";
        }

        // Print of all the data
        System.out.println("=========================");
        System.out.println("    Student Evaluation    ");
        System.out.println("=========================");
        
        System.out.println("Name               :  " + studentName);
        System.out.println("Course/Program     :  " + courseProgram);
        System.out.println("Age                :  " + age);
        System.out.println("Student No         :  " + studentId);
        System.out.println("Year Level         :  " + yearLevel);
        
        System.out.println("                   :  ");
        
        System.out.printf("Prelim Grade       :  %.2f%n", pgrade);
        System.out.printf("Midterm Grade      :  %.2f%n", mgrade);
        System.out.printf("Finals Grade       :  %.2f%n", fgrade);
        
        System.out.println("                   :  ");
        
        System.out.printf("Final Average      :  %.2f%n", totalGrade);
        System.out.println("Performance        :  " + performance);
        System.out.println("Status             :  " + status);
        System.out.println("Eligibility        :  " + eligibility);
        
        //to stop the entry of codes
        scanner.close();
        
    }
}

//reflection

/*

1. What did you learn from this performance task about the Scanner class?
Answer:

I learned how to use the Scanner class to read different inputs directly from the console. The most important thing I discovered was how the input buffer works—specifically that reading numbers with nextInt() leaves a newline character in memory that will skip the next text input unless you clear it with an extra nextLine().


2. Why is it important to use the correct Scanner method such as nextLine(), nextInt(), and nextDouble()?
Answer:
Using the correct Scanner method is critical because each method matches a specific data type. If you try to use nextInt() for text or enter non-numeric input into nextDouble(), Java throws an InputMismatchException and crashes the program.


3. Why did you use different data types such as String, int, and double?
Answer:
I used different data types because each piece of information serves a different purpose. Strings are necessary for text like names, student IDs, etc., where calculations aren't performed. Integers are for whole numbers like age and year level, while doubles are essential for grades so we can calculate and display accurate decimal averages.


4. Why is the computation for the Final Average necessary in the program?
Answer:
Computing the Final Average is essential because it condenses all three major term grades into a single benchmark score. Without calculating this total average, the program wouldn't have a reliable numerical basis to evaluate performance, assign a status, or check eligibility.


5. Why did you use if, else if, and else statements in your program?
Answer:

I used statements like if, else if, and else so the program could make logical decisions based on the calculated data. The if-else structure allows the system to check values against grade boundaries to automatically assign the right performance, pass/fail status, and eligibility result.


6. Which part of the program was the most challenging for you, and why?
Answer:

The most challenging part was dealing with the order of execution and fixing the Scanner buffer issue. At first, my program skipped reading the Student ID input right after entering age, and my output tried to print variables before they were declared. One thing that also made coding difficult was assigning eligibility correctly.


7. Choose one code from your program that you think is important. Explain in your own words why the program needs that code.
Answer:

Code: if (totalGrade >= 75 && pgrade >= 70 && mgrade >= 70 && fgrade >= 70)
This code is very important because it enforces eligibility. It ensures a student isn't marked eligible based on a passing average alone if they scored below 70 in any individual term.


8. What did you learn from this activity that you can apply to your future Java programs?
Answer:

I learned how to order the code properly, handle user input without crashing the console, clean up Scanner buffer issues, and structure conditional statements cleanly. These debugging habits and techniques will definitely help me write cleaner Java applications in the future.
*/
        
        
  
