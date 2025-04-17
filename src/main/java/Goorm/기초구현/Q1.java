package Goorm.기초구현;

import java.util.Scanner;

/**
 * 합 계산기
 */

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        int total = 0;

        for (int i = 0; i < T; i++) {
            String[] parts = sc.nextLine().split(" ");
            int a = Integer.parseInt(parts[0]);
            String op = parts[1];
            int b = Integer.parseInt(parts[2]);

            int result = 0;
            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
            }

            total += result;
        }

        System.out.println(total);
    }
}
