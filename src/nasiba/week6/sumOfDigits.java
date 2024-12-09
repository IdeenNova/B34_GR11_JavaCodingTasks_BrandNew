package nasiba.week6;

public class sumOfDigits {


    //Write a method that can return the sum of the digits in a string

    public static int sumOfDigits(String input) {
        int sum = 0;

        // iterating through each character in the String
        for (char each : input.toCharArray()) {

            // checking if the character is digit
            if (Character.isDigit(each)) {

                // converting the char to the integer and adding to the sum
                sum += Character.getNumericValue(each);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String TC1 = "absfbjn4364";
        String TC2 = "abcd123";

        System.out.println(sumOfDigits(TC1));//17

        System.out.println(sumOfDigits(TC2));//6
    }
}
