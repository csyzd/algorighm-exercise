package cn.yzd3008.java.javase.algorithm.exercise;

public class Exercise1_1_1_to_1_1_25 {
    public static void main(String[] args) {

        System.out.println();

        // 1.1.1
        System.out.println(">>>>> Exercise 1.1.1");
        System.out.println("a = " + (0 + 15 / 2)); // 7
        System.out.println("b = " + 2.0e-6 * 100000000.1); //
        System.out.println("c = " + (true && false || true && true)); // true


        // 1.1.2
        System.out.println(">>>>> Exercise 1.1.2");
        System.out.println("a = " + (1 + 2.236 / 2));
        System.out.println("b = " + (1 + 2 + 3 + 4.0)); // 10/0
        System.out.println("c = " + (4.1 >= 4)); // true
        System.out.println("d = " + (1 + 2 + "3")); // 33

        // 1.1.16
        System.out.println(">>>>> Exercise 1.1.16");
        System.out.println("exR1(6)=" + exR1(6));

    }

    private static String exR1(int n) {
        if (n <= 0) {
            return "";
        }

        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
