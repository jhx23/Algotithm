package Goorm.기초시뮬레이션;

/**
 * 나무꾼 구름이
 */

import java.io.*;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]) - 1;

        String[] treeStr = br.readLine().split(" ");
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(treeStr[i]);
        }

        int Q = Integer.parseInt(br.readLine());

        String[] D = br.readLine().split(" ");

        long wood = 0;

        for (int i = 0; i < Q; i++) {
            if (H[x] + i >= M) {
                wood += H[x] + i;
                H[x] -= H[x] + i;
            }

            if (D[i].equals("L")) {
                x = (x - 1 + N) % N;
            } else if (D[i].equals("R")) {
                x = (x + 1) % N;
            }
        }

        System.out.println(wood);
    }
}