package roza.week3;

public class reverseNegativeNumber {

    public static int reverseNegativeNumber(int number) {
        // Initialize reversedNumber to 0
        int reversedNumber = 0;

        // Check if the number is zero to handle the edge case
        if (number == 0) {
            return number;
        }

        // Loop till the number is not zero
        while (number != 0) {
            // Get the last digit by taking modulus with 10
            int lastDigit = number % 10;

            // Append lastDigit to reversedNumber
            reversedNumber = (reversedNumber * 10) + lastDigit;

            // Remove the last digit by integer division
            number = number / 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = -53;
        System.out.println("Reversed Number: " + reverseNegativeNumber(number)); // Output: -35
    }
}


    //Write a return method that can reverse negative number and return it as int
    //ex: given int is ==> -53
    //  the output will be ==> -35



