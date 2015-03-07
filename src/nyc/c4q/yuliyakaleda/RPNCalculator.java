package nyc.c4q.yuliyakaleda;

/**
 * Created by olgakoleda on 3/7/15.
 */

import java.util.Scanner;

public class RPNCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Please enter an operator: ");
        String operator = input.next();

        int result =0;
        if (operator .equals("+")) {
            result = firstNumber + secondNumber;
        }
         else if (operator .equals("-")) {
            result = firstNumber - secondNumber;
        }
        else if (operator .equals("*")) {
            result = firstNumber * secondNumber;
        }
        else if (operator .equals("/")) {
            result = firstNumber/ secondNumber;
        }
        else if (operator .equals("%")) {
            result = firstNumber % secondNumber;
        }

        System.out.println("Result: " + result);

    }
}
