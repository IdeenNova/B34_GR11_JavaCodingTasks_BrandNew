package dylan.week7;

import java.util.Arrays;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/
  public static int[] sort(int[] array) {
      for (int i = 0; i < array.length; i++) {
          for (int j = 0; j < array.length; j++) {
              if (array[i] > array[j]) {
                  int temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
              }

          }
      }

      return array;
  }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 2, 3, 4};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
