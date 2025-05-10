package Goorm.기초알고리즘챌린지;

import java.io.*;

public class Q2 {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(br.readLine());

            if (isPrime(A)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}