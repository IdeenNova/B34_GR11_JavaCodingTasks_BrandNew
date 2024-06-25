package nasiba.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
   public static void main(String[] args) {

       System.out.println("reversString(\"ABCD\") = " + reversString("ABCD"));


   }
public static String reversString(String str){
    // Checking if the input is null or empty
    if(str == null || str.isEmpty()){
        return str;
    }
    // create a char array to hold revered characters
    char[] reversedChar = new char[str.length()];

    // Filling the array with characters revers order
    for (int i=0; i < str.length();i++){
        reversedChar[i] = str.charAt(str.length()-1-i);
    }
    // convert the characters array back to a string
    return new String(reversedChar);
}
}
