package cn.yzd3008.java.javase.algorithm.exercise;

public class Exercise_1_1_27_Binomial {

    private static final int N = 100;
    private static final int K = 50;
    private static final double P = 0.25;
    private static int counter = 0;

    public static void main(String[] args) {
        System.out.println("Binomial: " + binomial(N, K, P));
    }

    private static double binomial(int n, int k, double p) {
        System.out.println("computing binomial(" + n + ", " + k + ", " + p + "） for " + (++counter) + " times");


        if (n == 0 && k == 0) {
            return 1.0;
        }

        if (n < 0 || k < 0) {
            return 0.0;
        }

        double result = (1.0 - p) * binomial(n - 1, k, p) + p * binomial(n - 1, k - 1, p);



        return result;
    }
}
