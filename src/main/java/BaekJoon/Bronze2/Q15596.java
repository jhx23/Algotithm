package BaekJoon.Bronze2;

/*
 * 문제 번호: 15596
 * 문제 이름: 정수 N개의 합
 */

import java.util.Scanner;

public class Q15596 {
    long sum(int[] a) {
        long ans = 0;
        for (int num : a) {
            ans += num;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 크기 입력
        int n = sc.nextInt();
        int[] a = new int[n];

        // 배열 요소 입력
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Test 객체 생성 및 sum 메서드 호출
        Q15596 q = new Q15596();
        long result = q.sum(a);

        // 결과 출력
        System.out.println(result);

    }
}