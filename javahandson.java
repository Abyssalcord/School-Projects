import java.util.Scanner; 

public class javahandson {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Problem 1
        System.out.println("==========================");
        System.out.println("  Celsius to Fahrenheit");
        System.out.println("==========================");
        System.out.println(" ");
        
        System.out.print("Enter the Temperature in °C: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 1.8) + 32; // Fixed: 1.8 instead of 1.9
        
        System.out.println("The value of °C to °F is: " + fahrenheit + "°F");
        System.out.println(" ");
        
        // Problem 2
        System.out.println("==========================");
        System.out.println("    Discount Applier");
        System.out.println("==========================");
        System.out.println(" ");
        
        System.out.println("Bill with 100$ amount will get additional 10$ Discount");
        System.out.print("Input the total bill $: ");
        double totalBill = scanner.nextDouble();
        
        double discounted = (totalBill - 10);
           
        if (totalBill >= 100) {
            System.out.println("Your total bill is: $" + discounted);
        } else {
            System.out.println("Your total bill is: $" + totalBill);
        }
        System.out.println(" ");
        
        // Problem 3
        System.out.println("==========================");
        System.out.println("    Sign Checker");
        System.out.println("==========================");
        System.out.println(" ");
        
        System.out.print("Enter a number to determine if its Positive or Negative: ");
        int integer = scanner.nextInt();
        
        if (integer >= 0) {
            System.out.println("The number you entered is a Positive Integer");
        } else {
            System.out.println("The number you entered is a Negative Integer");
        }
        System.out.println(" ");
 
        // Problem 4
        System.out.println("============================");
        System.out.println(" Multiplication Calculator");
        System.out.println("============================");
        System.out.println(" ");
        
        System.out.print("Enter The First Value: ");
        int fValue = scanner.nextInt();
        System.out.print("Enter The Second Value: ");
        int sValue = scanner.nextInt();
        
        int totalMultiplication = (fValue * sValue);
        
        System.out.println("The total is: " + totalMultiplication);
        System.out.println(" ");
        
        // Problem 5
        System.out.println("============================");
        System.out.println("      Area Calculator");
        System.out.println("============================");
        System.out.println(" ");
        
        System.out.print("Enter the length of your square: ");
        double length = scanner.nextDouble(); // Fixed: nextDouble() matches double variable
        
        double area = (length * length);
        
        System.out.println("The area of your square is: " + area);
        
        scanner.close();
    }
}