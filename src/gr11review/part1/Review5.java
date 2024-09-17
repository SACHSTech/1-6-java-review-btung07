package gr11review.part1;

import java.io.*;
import java.util.Scanner;


public class Review5 {

    public static void main(String[] args) throws IOException {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);


        // Get yearly investment amount from user
        System.out.print("Enter the yearly invested amount: ");
        double yearlyAmount = scanner.nextDouble();
       
        // Get the annual compound interest rate from user
        System.out.print("Enter the compound interest rate: ");
        double interestRate = scanner.nextDouble();
       
        // Get the target amount from user
        System.out.print("Enter the target amount: ");
        double targetAmount = scanner.nextDouble();
       
        // Initialize variables for the calculation
        double totalAmount = 0.0;
        int years = 0;
       
        // Loop until the total amount reaches or exceeds the target amount
        while (totalAmount < targetAmount) {
            // Add the yearly amount to the total
            totalAmount += yearlyAmount;
           
            // Calculate interest for the current total amount
            double interest = (interestRate / 100) * totalAmount;
           
            // Add interest to the total amount
            totalAmount += interest;
           
            // Increase the year count
            years++;
        }
       
        // Output result
        System.out.println("The target amount will be earned in " + years + " years.");
       
        // Close scanner
        scanner.close();
    }
}