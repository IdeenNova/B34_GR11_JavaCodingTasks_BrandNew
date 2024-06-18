package jale.week4;

import java.util.*;

public class RemoveDuplicates {
     /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/



    public static String[] removeDup (String[] str){

        Set<String> unique = new HashSet<>();
        for (String each : str){
            unique.add(each);
        }

        String [] uniqueArr = new String[unique.size()];
        int index = 0;

        for (String each : unique){
            uniqueArr[index++] = each;
        }
        return uniqueArr;
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A","A","A","B","B","B","C","C","C"));

        //  Set<Integer> list2 = new TreeSet<>(list);  en kolay hali ve boyle cozebiliriz
        //  System.out.println(list2);


        List<String> unique = new ArrayList<>();


        for (String each : list) {
            if (!unique.contains(each)) {
                unique.add(each);
            }else {
                unique.remove(each);
            }

        }
        System.out.println(unique);



    }

}



