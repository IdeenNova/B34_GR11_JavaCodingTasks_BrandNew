package jale.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static String reverse(String str){

        String str2 = "";
        for (int i = str.length() - 1 ; i >= 0 ; i--) {
            str2 += str.charAt(i);
        }
        return str2;
    }

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
    }


}
