package cn.yzd3008.java.javase.algorithm.exercise;

public class Exercise_1_1_28 {

    private static int[] arr = {1, 2, 2, 2, 5, 8, 13, 13, 13, 13, 13, 54, 67, 78, 79, 100};

    public static void main(String[] args) {
        int n = removeDuplicates(arr);

        int i;
        for (i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.print(arr[i] + "");
    }

    private static int removeDuplicates(int[] orig) {

        int i = 0;
        int j = 1;
        for (i = 0; i < orig.length - 1; i++) {
            if (orig[i + 1] != orig[i]) {
                orig[j] = orig[i + 1];
                j++;
            }
        }

        return j;
    }
}
