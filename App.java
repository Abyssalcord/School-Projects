package com.mycompany.javahandson;
//Mari, Niel Cedrick P. BSCOME 1stYear Sir. Gole Programming

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //problem 1
        System.out.println("==========================");
        System.out.println("  Celsius to Fahrenheit");
        System.out.println("==========================");
        System.out.println(" ");
        
        System.out.print("Enter the Temperature in °C:");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 1.9 + 32);
        
        System.out.println("The value of °C to °F is: " + fahrenheit + "°F");
        System.out.println(" ");
        
        //problem 2
        System.out.println("==========================");
        System.out.println("    Discount Applier");
        System.out.println("==========================");
        System.out.println(" ");
        
        System.out.println("Bill with 100$ amount will get additional 10$ Discount");
        System.out.print("Input the total bill $:");
        double totalBill = scanner.nextDouble();
        
        double discounted = (totalBill - 10);
           
        if (totalBill >= 100) {
            System.out.println("Your total bill is: $" + discounted);
            
        } else {
            
            System.out.println("Your total bill is: $" + totalBill);
        }
        System.out.println(" ");
        
        //problem 3
        
        System.out.println("==========================");
        System.out.println("    Sign Checker");
        System.out.println("==========================");
        System.out.println(" ");
        
        System.out.print("Enter a number to determine if its Positive or Negative:");
        int integer = scanner.nextInt();
        
        if (integer >= 0) {
            System.out.println("The number you entered is a Positive Integer");
        } else {
            System.out.println("The number you entered is a Negative Integer");
        }
        System.out.println(" ");
 
            //problem 4
            
        System.out.println("============================");
        System.out.println(" Multiplication Calculator");
        System.out.println("============================");
        System.out.println(" ");
        
        System.out.print("Enter The First Value:");
        int fValue = scanner.nextInt();
        System.out.print("Enter The Second Value:");
        int sValue = scanner.nextInt();
        
        int totalMultiplication = (fValue * sValue);
        
        System.out.println("The total is:" + totalMultiplication);
        System.out.println(" ");
        
        //problem 5
        
        System.out.println("============================");
        System.out.println("      Area Calculator");
        System.out.println("============================");
        System.out.println(" ");
        
        System.out.println("Enter the length of your square:");
        double length = scanner.nextInt();
        
        double area = (length * length);
        
        System.out.println("The area of your square is:" + area);
        
        
          }
        
        }
    