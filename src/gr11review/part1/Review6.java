package gr11review.part1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Review6 {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
       
        // Create DecimalFormat object to format currency
        DecimalFormat df = new DecimalFormat("$0.00");
       
        // Initialize variables for subtotal calculation
        double subtotal = 0.0;
        double price;
       
        // Ask user to enter item prices until they enter 0
        do {
            System.out.print("Enter the price for an item: ");
            price = scanner.nextDouble();
           
            // Only add price if it is not 0
            if (price != 0) {
                subtotal += price;
            }
        } while (price != 0);
       
        // Calculate tax and total
        double tax = subtotal * 0.13;
        double total = subtotal + tax;
       
        // Output results
        System.out.println("Subtotal: " + df.format(subtotal));
        System.out.println("Tax: " + df.format(tax));
        System.out.println("Total: " + df.format(total));
       
        // Close scanner
        scanner.close();
    }
}