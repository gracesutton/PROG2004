// Activity 1.3

// In this activity, you will write a Java program to create a class called MyProg1 with the main method. 
// In the main method, do the following:
    // Create an array to store 10 double numbers, for example, house prices
    // Create a loop to input 10 numbers from the keyboard
    // Print the 10 numbers to the screen after the input has been completed
    // Change the code to print only numbers greater than 500k
    // Calculate the average price and print the result
    // Print the least and the most expensive house prices

import java.util.Scanner;

public class MyProg1 {
    public static void main(String[] args) {

        // create a new object of Scanner
        Scanner input = new Scanner(System.in);

        // creates an array to store 10 double numbers
        double[] housePrices = new double[10];

        // Loop to input 10 numbers from the keyboard
        for (int i = 0; i < housePrices.length; i++) { // For Loop Syntax: for(initialisation; condition; increment/decrement)
            System.out.print("Enter house #" + (i+1) + " price (in millions): ");
            housePrices[i] = input.nextDouble(); // take input from the user and store in array
        }

        // closing the Scanner object
        input.close();

        // Print the 10 numbers to the screen
        System.out.println("House Prices:");
        for (int i = 0; i < housePrices.length; i++) { 
            System.out.println("House #" + (i+1) + ": $" + housePrices[i]);
        }

        // // An easier way could be this...
        // for (double price : housePrices) { //
        //     System.out.print(price + " ");
        // }

        // Print only numbers greater than 500k
        System.out.println("House Prices Greater Than 500k:");
        for (int i = 0; i < housePrices.length; i++) {
            if (housePrices[i] >= 0.5) {
                System.out.println("House #" + (i+1) + ": $" + housePrices[i]);
            }
        }

        // Calculate the average price and print the result
        double total = 0.0;
        for (double price : housePrices){  // creates new price variable and starts a for each loop
            total += price;
        }

        double avg = total / housePrices.length;

        System.out.printf("The average house price is: %.2f\n", avg); // %.2f formats average to 2 d.p.

        // Print the least and the most expensive house prices
        double min = housePrices[0];
        double max = housePrices[0];
        for (int i = 0; i < housePrices.length; i++) {
            if (housePrices[i] < min) {
                min = housePrices[i];
            }
            if (housePrices[i] > max) {
                max = housePrices[i];
            }
        }

        System.out.println("The house prices range from $" + min + " to $" + max + " million.");
        
    }

}
