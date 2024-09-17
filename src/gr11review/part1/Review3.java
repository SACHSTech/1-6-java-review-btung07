package gr11review.part1;

import java.io.*;
import java.util.Scanner;

public class Review3 {

    public static void main(String[] args) throws IOException {
        // Print odd numbers from 20 to 100
        System.out.println("Odd numbers from 20 to 100:");
        for (int i = 20; i <= 100; i++) {
            if (i % 2 != 0) {  // Check if the number is odd
                System.out.print(i + " ");
            }
        }
       
        // Seperate the 2 outputs
        System.out.println();
       
        // Print numbers from 29 to 2 in decreasing order
        System.out.println("Numbers from 29 to 2 in decreasing order:");
        for (int i = 29; i >= 2; i--) {
            System.out.print(i + " ");
        }
    }
}