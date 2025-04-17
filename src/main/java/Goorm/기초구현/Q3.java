package Goorm.기초구현;

import java.util.Scanner;
/**
 * 과연 승자는?
 */

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        String[] aliceCards = sc.nextLine().split(" ");
        String[] bobCards = sc.nextLine().split(" ");

        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < N; i++) {
            int aliceCard = Integer.parseInt(aliceCards[i]);
            int bobCard = Integer.parseInt(bobCards[i]);

            if (aliceCard > bobCard) {
                if (aliceCard - bobCard == 7) {
                    aliceScore -= 1;
                    bobScore += 3;
                } else {
                    aliceScore += 2;
                }
            } else if (aliceCard < bobCard) {
                if (bobCard - aliceCard == 7) {
                    bobScore -= 1;
                    aliceScore += 3;
                } else {
                    bobScore += 2;
                }
            } else {
                aliceScore += 1;
                bobScore += 1;
            }
        }
        System.out.println(aliceScore + " " + bobScore);
    }
}
