package gr11review.part1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Review4 {

    public static void main(String[] args) throws IOException {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
       
        // Create DecimalFormat object to format currency
        DecimalFormat df = new DecimalFormat("$0.00");
       
        // Ask user how many items they want to purchase
        System.out.print("How many items do you want to buy? ");
        int numItems = scanner.nextInt();
       
        // Initialize variables to store subtotal
        double subtotal = 0.0;
       
        // Loop
        for (int i = 1; i <= numItems; i++) {
            System.out.print("Enter the price for item " + i + ": ");
            double price = scanner.nextDouble();
            subtotal += price;  // Add the price to the subtotal
        }
       
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

