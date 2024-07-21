package com.company;

// Import the Scanner class to allow for user input
import java.util.Scanner;

public class percentageCalculator {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter marks for each subject and store the input
        System.out.print("Enter sub1 marks: ");
        float a = sc.nextInt(); // Read marks for subject 1

        System.out.print("Enter sub2 marks: ");
        float b = sc.nextInt(); // Read marks for subject 2

        System.out.print("Enter sub3 marks: ");
        float c = sc.nextInt(); // Read marks for subject 3

        System.out.print("Enter sub4 marks: ");
        float d = sc.nextInt(); // Read marks for subject 4

        System.out.print("Enter sub5 marks: ");
        float e = sc.nextFloat(); // Read marks for subject 5

        // Calculate the percentage by summing up all the marks and dividing by the number of subjects
        float percentage = (a + b + c + d + e) / 5;

        // Print the calculated percentage
        System.out.print("Your percentage is: ");
        System.out.print(percentage);
    }
}
