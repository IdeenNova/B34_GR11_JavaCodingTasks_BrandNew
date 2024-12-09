package nasiba.week6;

public class passwordValidation {
    /*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
*/

public static boolean isValidPassword(String password){
    // checking if password contains empty space or length is at least 6 characters.
   if(password.length() < 6 || password.contains(" ")){
       return false;
   }
   boolean hasUpperCaseLetter = false;
   boolean hasLowerCaseLetter = false;
   boolean hasSpecialChar = false;
   boolean hasDigit = false;

  for (char each : password.toCharArray()){
      if(Character.isUpperCase(each)){
          hasUpperCaseLetter = true;
      } else if (Character.isLowerCase(each)) {
          hasLowerCaseLetter = true;
      } else if (Character.isDigit(each)) {
          hasDigit = true;
      } else if (!Character.isLetterOrDigit(each)) {
          hasSpecialChar = true;

      }
  }
  // checking all conditions are met as required
  return hasUpperCaseLetter && hasLowerCaseLetter && hasDigit && hasSpecialChar;
}

    public static void main(String[] args) {
        System.out.println("isValidPassword(\"Magtymguly50\") = " + isValidPassword("Magtymguly50"));
        System.out.println("isValidPassword(\"Magtymguly-50\") = " + isValidPassword("Magtymguly-50"));

        System.out.println("isValidPassword(\"Cydeo+123\") = " + isValidPassword("Cydeo+123"));
        System.out.println("isValidPassword(\"Cydeo23\") = " + isValidPassword("Cydeo23"));
    }
}
