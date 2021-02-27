package cn.yzd3008.java.javase.algorithm.exercise;

import java.util.Scanner;

public class Exercise_1_1_20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
        * The following method will calculate ln(N!).
        *  Note that:
        *    Ln(N!) = Ln[Nx(N-1)x(N-2)...3x2x1] = Ln(N) + Ln(N-1) + Ln(N-2) + ... + Ln(3)+ Ln(2)+ Ln(1)
        */
        System.out.println(calculate(n));
    }

    private static double calculate(int n) {
        if(n == 1){
            return 0;
        }

        return Math.log(n) + calculate(n-1);
    }
}
