package com.mycompany.activity_1-3;
//Mari, Niel Cedrick P. BSCOME 1stYear Sir. Gole Programming
import java.util.Scanner;
public class Activity_1 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Activity 1
        System.out.println("============================================");
        System.out.println(" Activity 1 (The Social Media Text Cleaner)");
        System.out.println("============================================");
        System.out.println("");
        
        System.out.println("The text unclean is: #J#a#v#a# #I#s# #F#u#n#!");
        System.out.println("");
        //declare raw post
        String rawPost = " #J#a#v#a# #I#s# #F#u#n#! ";

        String trimmedPost = rawPost.trim();
        //declaring what to replace
        String editorPost = trimmedPost.replace("#", "");
        //changing to lower case
        String cleanedPost = editorPost.toLowerCase();
        
        //print the cleaned post
        System.out.println("The post with clean text is: " + cleanedPost);
        System.out.println("");
        
        //Activity 2
        System.out.println("============================================");
        System.out.println("   Activity 2 (The File Upload Gatekeeper)");
        System.out.println("============================================");
        System.out.println("");
        
        //input of file name
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        
        
        //checking if the file nme satisfy with the following rules no space and .pdf
        if (fileName.endsWith(".pdf") && !fileName.contains(" ")) {
            System.out.println("Upload Successful!");
        } else {
            System.out.println("Invalid File Format!");
        }
        System.out.println("");

        scanner.close();
        
        System.out.println("");
        
        //Activity 3
        System.out.println("============================================");
        System.out.println(" Activity 3 (Credit Card Privacy Masker)");
        System.out.println("============================================");
        System.out.println("");
              
        System.out.println("The Card Number to be masked: 4532876509813421");
        System.out.println("");
        String cardNumber = "4532876509813421";

        if (cardNumber.length() == 16) {
            
            String lastFourDigits = cardNumber.substring(12);
            System.out.println("************" + lastFourDigits);
            
        } else {
            System.out.println("Invalid Card Number");
            
        System.out.println("");
        
        System.out.println("============================================");
            
        }
        
    }
}
//made with love and design yan sir hahahahha
