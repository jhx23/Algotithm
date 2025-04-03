package BaekJoon.Bronze1;

/*
 * 문제 번호: 2748
 * 문제 이름: 피보나치 수 2
 */

import java.util.Scanner;

public class Q2748 {
    static long[] memo = new long[91];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(fibonacci(n));
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }
}