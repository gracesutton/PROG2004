// Activity 1.5

// In this activity, you will create a Java program to perform a simple calculation. 
// In particular, the program will read a simple two-operand math expression such as 1 + 2, 4 - 3, and 5 * 6 from the keyboard, 
// evaluate it and print the result. You will read the expression in as a string, process it to get the operands and operator, 
// convert the operands to number, perform the calculation based on the operator and print the result on the screen.

// import the Scanner class
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        
        // create a new object of Scanner
        Scanner input = new Scanner(System.in);

        //  read expression from the keyboard as a string, then close the Scanner object
        System.out.print("Enter your expression: ");
        String expression = input.nextLine();
        input.close();

        // split expression into tokens for calculation
        String[] tokens = expression.split(" ");

        // assign tokens to variables, convert operands to numbers
        double operand1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double operand2 = Double.parseDouble(tokens[2]);

        // create new variable for the calculation result
        double result = 0;

        // switch case for the operators
        switch (operator) {
            case "+" -> result = operand1 + operand2;
            case "-" -> result = operand1 - operand2;
            case "*" -> result = operand1 * operand2;
            case "/" -> result = operand1 / operand2;
        }

        // print the result
        System.out.println(result);
    }
}
