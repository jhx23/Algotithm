package BaekJoon.Bronze4;

/*문제 번호 : 2440
문제 이름 : 별 찍기-3*/

import java.util.Scanner;

public class Q2440 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = N; i >= 1; i--) {  // i를 N부터 1까지 감소
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
    }
}
