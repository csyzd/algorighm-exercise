package cn.yzd3008.java.javase.algorithm.exercise;

public class Exercise_1_1_19_FibonacciSequence {

    // in one hour, it will run to max N: 57

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            System.out.println(String.format("Fibonacci(%3d) = %d", i, F(i)));
        }
    }

    private static long F(long n) {
        if (n == 1) return 1;
        if (n == 2) return 1;

        return F(n - 1) + F(n - 2);
    }
}
