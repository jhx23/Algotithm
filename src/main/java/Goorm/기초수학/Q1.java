package Goorm.기초수학;

/**
 * 운동 중독 플레이어
 * 정수 W와 R이 주어지면 문제의 요구한 식대로 계산하는 수학문제
 * 나오는 결과에 대해서, 소수 이하의 값을 버리는 점을 고려
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int R = sc.nextInt();
        System.out.println((int)(W * (1 + (double)R / 30)));
    }
}