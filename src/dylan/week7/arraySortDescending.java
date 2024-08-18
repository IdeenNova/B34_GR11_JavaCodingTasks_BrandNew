package dylan.week7;

import java.util.Arrays;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/
  public static int[] sort(int[] array){
      int[] ans = new int[array.length];
      for (int i = 0; i < array.length; i++) {
          int min = 0;
          for (int j = 0; j < array.length; j++) {
              if (array[i] < array[j] && !Arrays.asList(ans).contains(min)){
                  min = array[j];
              }

          }
          ans[i] = min;
      }
      return ans;
  }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 2, 3, 4};
        System.out.println(Arrays.toString(sort(array)));
    }
}
