// Activity 1.7 (Optional)

// In this activity, you will develop a simple Java program to implement the bubble sort algorithm. 
// Your program will read in a series of numbers from a text file (numbers.txt), sort them in ascending (descending) 
// order and write them back to another file with the name numbers_sorted.txt.

import java.io.*;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Integer[] myNumbers; 

        try {
            // Reads the file using the Scanner class
            File myFile = new File("Week1/src/numbers.txt");
            Scanner input = new Scanner(myFile);

            while (input.hasNextLine()) {
                //  read expression from the keyboard as a string
                Integer number = input.nextInt();

                //???
                
            }
            input.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

    }
}
