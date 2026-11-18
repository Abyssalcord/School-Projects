package com.mycompany.guesstheword;
//Mari, Niel Cedrick P. BSCOME 1stYear Sir. Gole Programming
import java.util.Scanner;
public class GuessTheWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declared the secret word for guessing later to check if it would satisfy the answers of the contestantt
        String secretWord = "SuperSecretJavaToken#99";
        
        //Introductory splash screen
        System.out.println("*============================================================*");
        System.out.println("             Performance Task: Dynamic Guessing Word");
        System.out.println("*============================================================*");
        System.out.println("");

        // Initial setup and declaring of the clues. This would also be used below as mentioned
        int totalLength = secretWord.length();
        char firstChar = secretWord.charAt(0);
        char lastChar = secretWord.charAt(secretWord.length() - 1);

        System.out.println("~~~~~~~ INITIAL GAME CLUES ~~~~~~~");
        System.out.println("");
        System.out.println("Character Length   : " + totalLength + " Characters");
        System.out.println("First Character    : " + firstChar);
        System.out.println("Last Character     : " + lastChar);
        System.out.println("Allowed Attempts   : 8 Attempts only");
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");

        // State control variables for it to work properly
        int attempt = 1;
        int maxAttempts = 8;
        boolean isGuessed = false;

        /* while loop for guessing and continuosly check if its being correctly guessed,
        it will automatically cancel all the remaining guesses and continue on the next part if the 
        guess was satisfied
        */
        
        while (attempt <= maxAttempts && !isGuessed) {
            System.out.println("*============================================================*");
            System.out.println("");
            System.out.println("ATTEMPT " + attempt + " OF " + maxAttempts);

            // Will trigger if the attempt was 4 and will give a middle character clue
            if (attempt == 4) {
                int middleIndex = totalLength / 2;
                char middleChar = secretWord.charAt(middleIndex);
                System.out.println("[CLUE UPGRADE! - ATTEMPT 4]: Middle Character at index " + middleIndex + " is: '" + middleChar + "'");
            }

            // will trigger if the attempt was 6 and will give the final upgrade in guessing the answer. It will present a masked clue which is vowel words
            if (attempt == 6) {
                String maskedClue = secretWord.toUpperCase()
                        .replace("A", "*")
                        .replace("E", "*")
                        .replace("I", "*")
                        .replace("O", "*")
                        .replace("U", "*");
                System.out.println("[CLUE UPGRADE! - ATTEMPT 6]: Vowel Masked Word: " + maskedClue);
            }
            
            //used to print this continuosly untill all guesses are all exhausted
            System.out.print("Enter your guess: ");
            String playerGuess = scanner.nextLine().trim();

            /* word comparison if it would match it would change the first declared value of guess
            to true and it would automatically close the loop as it satisfied the needed secret word
            
            */
            if (playerGuess.equalsIgnoreCase(secretWord)) {
                isGuessed = true;
            } else {
                System.out.println("RESULT: Incorrect guess! Try again and think hard this time");
                attempt++;
            }
            System.out.println("");
        }

        // win or loss evaluation
        System.out.println("*============================================================*");
        System.out.println("");
        if (isGuessed) {
            System.out.println("CONGRATULATIONS! YOU GUESSED THE WORD! :D");
            System.out.println("");
            System.out.println("Total Attempts Used: " + attempt);
            System.out.println("Secret Word        : " + secretWord);
        } else {
            System.out.println("GAME OVER! You have no tries left :p ");
            System.out.println("");
            System.out.println("The secret word was: " + secretWord);
        }
        System.out.println("");
        System.out.println("*============================================================*");

        scanner.close();
    }
}       /*sir hindi po maattach ung mismong folder na naka lastname and firstname sir
         sa teams di siya maattach. mismong java code lang sir kaya yun nalang po inupload ko sir.

        */
        

       //maangas yan sir gui ko dyan kahit 2d lang, tapos gusto ko sana sir malagay sa gitna ung mismong initial na stuff kaso di ko lam pano un or bawala ata 