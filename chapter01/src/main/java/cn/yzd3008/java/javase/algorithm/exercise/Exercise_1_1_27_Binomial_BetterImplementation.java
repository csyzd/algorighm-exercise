package cn.yzd3008.java.javase.algorithm.exercise;

public class Exercise_1_1_27_Binomial_BetterImplementation {

    private static final int N = 100;
    private static final int K = 50;
    private static final double P = 0.25;

    private static boolean[][] cacheIndicator = new boolean[N + 1][K + 1];
    private static double[][] cache = new double[N + 1][K + 1];

    public static void main(String[] args) {
        System.out.println("Binomial: " + binomial(N, K, P));
    }

    private static double binomial(int n, int k, double p) {

        if (cacheIndicator[n][k]) {
            return cache[n][k];
        }

        if (n == 0 && k == 0) {
            cache[0][0] = 1.0;
            cacheIndicator[0][0] = true;
            return cache[0][0];
        }

        if (n < 0 || k < 0) {
            return 0.0;
        }

        if (n - 1 < 0 || k - 1 < 0) {
            return 0.0;
        }

        if (!cacheIndicator[n - 1][k]) {
            cache[n - 1][k] = binomial(n - 1, k, p);
            cacheIndicator[n-1][k] = true;
        }

        if (!cacheIndicator[n - 1][k - 1]) {
            cache[n - 1][k - 1] = binomial(n - 1, k - 1, p);
            cacheIndicator[n-1][k-1] = true;
        }

        cache[n][k] = (1.0 - p) * cache[n - 1][k] + p * cache[n - 1][k - 1];
        cacheIndicator[n][k] = true;

        System.out.println(String.format("binomial(%d, %d, %f) = %f", n, k, p, cache[n][k]));

        return cache[n][k];
    }
}
