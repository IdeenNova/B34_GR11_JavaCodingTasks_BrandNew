package Gabriel.week2;

public class Number_DivisibleBy3_5_15 {
    public static void main(String[] args) {
        int n = 30;

        System.out.println("Divisible by 3:");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDivisible by 5:");
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDivisible by 15:");
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
