package dylan.week7;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    public static int min(int[] array){
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (temp > array[i]){
                temp = array[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {

    }
}
