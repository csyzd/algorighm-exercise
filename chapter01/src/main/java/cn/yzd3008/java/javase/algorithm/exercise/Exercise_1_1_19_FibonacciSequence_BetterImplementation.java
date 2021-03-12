package cn.yzd3008.java.javase.algorithm.exercise;

public class Exercise_1_1_19_FibonacciSequence_BetterImplementation {

    /*
    * In one hour, without better algorithm, it will run to max N: 57
     But, if we store the calculated value each time, then we can improve the performance.
    *  */

    private static final int N = 100;
    private static boolean[] cacheIndicator = new boolean[N + 1];
    private static long[] cache = new long[N + 1];

    public static void main(String[] args) {

        for (int i = 1; i <= N; i++) {
            System.out.println(String.format("Fibonacci(%3d) = %d, array element value: %d", i, F(i), cache[i]));
        }
    }

    private static long F(int n) {

        if (cacheIndicator[n]) {
            return cache[n];
        }

        if (n == 1) {
            cache[1] = 1;
            cacheIndicator[1] = true;
            return cache[1];
        }

        if (n == 2) {
            cache[2] = 1;
            cacheIndicator[2] = true;
            return cache[2];
        }

        if(!cacheIndicator[n-1]){
            cache[n-1] = F(n-2) + F(n-3);
            cacheIndicator[n-1] = true;
        }
        if(!cacheIndicator[n-2]){
            cache[n-2] = F(n-3) + F(n-4);
            cacheIndicator[n-2] = true;
        }

        cache[n] = cache[n-1] + cache[n-2];
        cacheIndicator[n] = true;

        return cache[n];
    }

}
