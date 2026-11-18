package com.mycompany.activity_4to5;
//Mari, Niel Cedrick P. BSCOME 1stYear Sir. Gole Programming

import java.util.Scanner;

public class Activity_4to5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("============================================");
        System.out.println("      Activity 5 (Full Name Formatter)");
        System.out.println("============================================");
        System.out.println("");

        System.out.println("The default full name is: john michael doe");
        System.out.println("");

        // declaring given full name
        String fullName = "john michael doe";

        // splitting first name and last name
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1].toUpperCase();

        // print the formatted names
        System.out.println("First Name: " + firstName + " Last Name: " + lastName);
        System.out.println("");
    }
}


