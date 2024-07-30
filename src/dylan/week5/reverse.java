package dylan.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
    public static String rev(String x){
        String[] arr = x.split("");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(rev("ABCD"));
    }
}
