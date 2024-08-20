package jake.week6;

public class FindMaximum {
    //Write a method that can find the maximum number from an int Array

    public static int findMax(int[] arr) {

        // initialize max with first array element
        int max = arr[0];

        // for loop will iterate through the array to find maximum value element
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // use main method to apply code to specific any array list
    public static void main(String[] args) {
        int[] numbers = {12, 26, 43, 75, 7, 90, 36, 32, 58, 3};
        // call findMax method
        int maxNumber = findMax(numbers);
        System.out.println("The maximum number is: " + maxNumber);
    }
}
