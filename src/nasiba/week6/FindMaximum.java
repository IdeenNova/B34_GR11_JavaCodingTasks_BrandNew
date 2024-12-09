package nasiba.week6;

public class FindMaximum {
    //Write a method that can find the maximum number from an int Array

    public static int findMaxNumber(int[] numbers) {
        // checking if the array is empty or null
        if (numbers == null || numbers.length == 0) {
            throw new RuntimeException("Array cannot be empty or null");
        }
        // initializing the maximum number with the first element of array
        int maxNumber = numbers[0];

        // iterating through the array to find maximum number
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }

        }
        return maxNumber;

    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 67, 8, 90};
        int [] array2 = {100,269,876,45,324};

        System.out.println(findMaxNumber(array1));

        System.out.println(findMaxNumber(array2));
    }
}
