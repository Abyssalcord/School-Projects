package com.mycompany.ArrayBasicsProject;
//Mari, Niel Cedrick P. BSCOME 1stYear Sir. Gole Programming

public class ExpenseLogger {

    public static void main(String[] args) {
        
        // introduction splash screen
        System.out.println("*==================================*");
        System.out.println("        Weekly Expense Logger");
        System.out.println("*==================================*");
        System.out.println("");
        
        // declare and instantiate expenses array of size 5
        int[] expenses = new int[5];

        // assign daily expenses
        expenses[0] = 15;
        expenses[1] = 20;
        expenses[2] = 10;
        expenses[3] = 25;
        expenses[4] = 30;

        // Update Wednesday Day 2 expense from $10 to $12
        expenses[2] = 12;

        // Part 2: Array literal initialization for day names
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        // Print daily expense breakdown using parallel array traversal
        System.out.println("~~~~ Daily Expense Breakdown ~~~~");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + ": $" + expenses[i]);
        }
        System.out.println("");

        // Calculate total expenses using loop 
        int totalExpenses = 0;
        for (int i = 0; i < expenses.length; i++) {
            totalExpenses += expenses[i];
            
        }
        System.out.println("*==================================*");
        System.out.println("");

        // Explicit type casting to double to avoid integer division truncation
        double averageExpense = (double) totalExpenses / expenses.length;

        // Prints out the data gathered and shows it below
        System.out.println("~~~~ Expense Summary ~~~~");
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Average Expense: $" + averageExpense);
        System.out.println("");
        System.out.println("*==================================*");
    }
}
    

