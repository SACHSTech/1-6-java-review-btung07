package gr11review.part1;

import java.io.*;
import java.util.Scanner;


public class Review7 {

    public static void main(String[] args) throws IOException {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
       
        // Ask user to enter a sentence
        System.out.print("Enter a sentence: ");
        String theSentence = scanner.nextLine();
       
        // Initialize counters
        int numCharacters = theSentence.length();
        int numSpaces = 0;
        int numLetterA = 0;
       
        // Variable to build the odd indexed characters string
        StringBuilder oddChars = new StringBuilder();
       
        // Repeat over each character in the sentence
        for (int i = 0; i < numCharacters; i++) {
            char currentChar = theSentence.charAt(i);
           
            // Count spaces
            if (currentChar == ' ') {
                numSpaces++;
            }
           
            // Count letter 'a' (both uppercase and lowercase)
            if (currentChar == 'a' || currentChar == 'A') {
                numLetterA++;
            }
           
            // Add the characters from odd positions to the result string
            if (i % 2 != 0) {
                oddChars.append(currentChar);
            }
        }
       
        // Output results
        System.out.println("There are " + numCharacters + " characters in the sentence.");
        System.out.println("There are " + numSpaces + " spaces in the sentence.");
        System.out.println("There are " + numLetterA + " letter a in the sentence.");
        System.out.println(oddChars.toString());
       
        // Close scanner
        scanner.close();
    }
}