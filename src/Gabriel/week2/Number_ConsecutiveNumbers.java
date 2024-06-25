package Gabriel.week2;

public class Number_ConsecutiveNumbers {
    public static void main(String[] args) {
        printNumbers(30);
    }
    public static void printNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            String replace = "";
            if (i % 2 == 0) {
                replace += "Codility";
            }
            if (i % 3 == 0) {
                replace += "Test";
            }
            if (i % 5 == 0) {
                replace += "Coders";
            }
            if (replace.isEmpty()) {
                replace += i;
            }
            System.out.println(replace);
        }
    }
}
