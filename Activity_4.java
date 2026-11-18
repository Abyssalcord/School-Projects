
package com.mycompany.activity_4;
//Mari, Niel Cedrick P. BSCOME 1stYear Sir. Gole Programming
import java.util.Scanner;
public class Activity_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Activity 4
        System.out.println("============================================");
        System.out.println("     Activity 4 (Promo Code Matcher)");
        System.out.println("============================================");
        System.out.println("");

        // input of promo code
        System.out.print("Enter Promo Code: ");
        String enteredPromo = scanner.nextLine();

        // trimming extra spaces
        String cleanedPromo = enteredPromo.trim();

        // checking if promo matches JAVA2026 regardless of case
        if (cleanedPromo.equalsIgnoreCase("JAVA2026")) {
            System.out.println("20% Discount Applied!");
        } else {
            System.out.println("Invalid Promo Code");
        }
        System.out.println("");

        scanner.close();
    }
}
   
