package Goorm.기초알고리즘챌린지;

/**
 * 시간 복잡도
 */


import java.io.*;
class Q1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int c = 0;
        while (N > 0) {
            c += N / 5;
            N /= 5;
        }
        System.out.println(c);
    }
}
