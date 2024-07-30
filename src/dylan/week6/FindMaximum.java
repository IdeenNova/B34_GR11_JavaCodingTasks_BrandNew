package dylan.week6;

public class FindMaximum {
    //Write a method that can find the maximum number from an int Array
    public static int max(int[] array){
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (temp < array[i]){
                temp = array[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};
        System.out.println(max(array));
    }

}
