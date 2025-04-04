package Goorm.기초수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 울타리 치기
 * 가로 방향 길이가 1인 직사각형 모양의 땅 N개가 주어진다.
 * 직사각형 모양의 땅을 주어지는 순서대로 이어 붙인다.
 * 이어 붙인 땅의 가장자리에 울타리를 두를 때의 필요한 울타리의 길이를 구하라.
 */

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        int perimeter = 0;

        perimeter += 2 * N;
        perimeter += A[0] + A[N - 1];

        for (int i = 0; i < N - 1; i++) {
            perimeter += Math.abs(A[i] - A[i + 1]);
        }

        System.out.println(perimeter);
    }
}