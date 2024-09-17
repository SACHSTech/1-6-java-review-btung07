package gr11review.part1;

import java.io.IOException;
import java.util.Random;

public class Review8 {


    public static void main(String[] args) throws IOException {
        // Create Random object for generating random numbers
        Random rand = new Random();
       
        // Initialize counter for triples
        int tripleCount = 0;
       
        // Simulate 1000 pulls
        for (int i = 0; i < 1000; i++) {
            // Generate three random numbers between 0 and 8
            int num1 = rand.nextInt(9);
            int num2 = rand.nextInt(9);
            int num3 = rand.nextInt(9);
           
            // Print result of the pull
            System.out.println(num1 + " " + num2 + " " + num3);
           
            // Check if all three numbers are the same
            if (num1 == num2 && num2 == num3) {
                tripleCount++;
            }
        }
       
        // Output the count of triples
        System.out.println(tripleCount);
    }
}