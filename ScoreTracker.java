package com.mycompany.scoretracker;
//Mari, Niel Cedrick P. BSCOME 1stYear Sir. Gole Programming

public class ScoreTracker {

    public static void main(String[] args) {

        // 1. Declare an integer array of size 5
        String [] scores = new String[5];

        // 2. Print default values using a loop
        System.out.println("--- Default Values ---");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Index " + i + ": " + scores[i]);
        }

        // Assigning values to specific indexes
        scores[0] = "tine";
        scores[1] = "K";
        scores[2] = "l";
        scores[3] = "d";
        scores[4] = "p";

        // Modifying an existing value at index 2
        scores[2] = "o";

        System.out.println("--- Updated Scores ---");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }

        // Accumulate the total score using a loop
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; // Short for: sum = sum + scores[i]
        }

        // Explicit type casting to double to avoid integer division truncation
        double average = (double) sum / scores.length;

        System.out.println("--- Results ---");
        System.out.println("Total Sum: " + sum);
        System.out.println("Average Score: " + average);
    }
}
