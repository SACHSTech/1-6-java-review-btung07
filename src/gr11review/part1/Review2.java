package gr11review.part1;

import java.io.*;
import java.util.Scanner;


public class Review2 {

    public static void main(String[] args) throws IOException {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
       
        // Print the menu options
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");
       
        // Get user input for the menu option
        int option = scanner.nextInt();
       
        // Reply with the selected option
        switch (option) {
            case 0:
                System.out.println("Why did the scarecrow become a successful hair stylist?");
                System.out.println("Because he was outstanding in his field!");
                break;
           
            case 1:
                System.out.println("Why did the foot go to school?");
                System.out.println("To improve their sole education.");
                break;
           
            case 2:
                System.out.println("Why did the scarecrow become a successful politician?");
                System.out.println("Because he was outstanding in his field!");
                break;
           
            case 3:
                System.out.println("Why did the teacher go to the beach?");
                System.out.println("To test the waters.");
                break;
           
            default:
                System.out.println("Invalid menu option.");
                break;
        }
       
        // Close scanner
        scanner.close();
    }
}
