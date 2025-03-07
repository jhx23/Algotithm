package BaekJoon.Bronze2;

/*문제 번호 : 3052
문제 이름 : 나머지*/

import java.util.HashSet;
import java.util.Scanner;

public class Q3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> remainder = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            remainder.add(num % 42);
        }
        System.out.println(remainder.size());
    }
}