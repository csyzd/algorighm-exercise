package cn.yzd3008.java.javase.algorithm.exercise;

public class Exercise_1_1_19_FibonacciSequence_BetterImplementation {

    /*
    * In one hour, without better algorithm, it will run to max N: 57
     But, if we store the calculated value each time, then we can improve the performance.
    *  */

    private static final int N = 100;
    private static long[] FibonacciCalculationResultArray = new long[N + 1];

    public static void main(String[] args) {

        for (int i = 1; i <= N; i++) {
            System.out.println(String.format("Fibonacci(%3d) = %d, array element value: %d", i, F(i), FibonacciCalculationResultArray[i]));
        }
    }

    private static long F(long n) {
        if (n == 1) {
            FibonacciCalculationResultArray[1] = 1;
            return 1;
        }

        if (n == 2) {
            FibonacciCalculationResultArray[2] = 1;
            return 1;
        }

        FibonacciCalculationResultArray[(int) n] = FibonacciCalculationResultArray[(int) (n - 1)] +
                FibonacciCalculationResultArray[(int) (n - 2)];

        return FibonacciCalculationResultArray[(int) n];
    }

}
