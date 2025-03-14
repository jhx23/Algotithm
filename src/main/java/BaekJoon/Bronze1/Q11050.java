package BaekJoon.Bronze1;

/*
 * 문제 번호: 11050
 * 문제 이름: 정수 N개의 합
 */

import java.util.Scanner;

public class Q11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(nck(n,k));
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static int nck(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n-k));
    }
}