package Gabriel.week1;

public class Finra {
    public static void main(String[] args) {
        finra(67);
        finra2(45);
    }

    public static void finra(int n) {
        for (int i = 1; i < n; i++) {

            if (i % 15 == 0) {
                System.out.println("Finra");
            } else if (i % 3 == 0) {
                System.out.println("Fin");
            } else if (i % 5 == 0) {
                System.out.println("Ra");
            } else {
                System.out.println(i);
            }
        }


    }

    public static void finra2(int n) {

        for (int i = 1; i < n; i++) {
            String str = "";

            if (i % 3 == 0) {
                str += "Fin";
            }
            if (i % 5 == 0) {
                str += "Ra";
            }
            System.out.println(str.isEmpty() ? i : str);
        }
    }
}
