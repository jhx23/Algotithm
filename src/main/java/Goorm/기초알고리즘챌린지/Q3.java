package Goorm.기초알고리즘챌린지;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int gx = sc.nextInt() - 1;
        int gy = sc.nextInt() - 1;
        int px = sc.nextInt() - 1;
        int py = sc.nextInt() - 1;

        String[][] board = new String[N][N];
        boolean[][] gVisited = new boolean[N][N];
        boolean[][] pVisited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.next();
            }
        }
        int gScore = 1;
        int pScore = 1;
        gVisited[gx][gy] = true;
        pVisited[px][py] = true;

        boolean gEnd = false;
        while (!gEnd) {
            String cmd = board[gx][gy];
            int dist = Integer.parseInt(cmd.substring(0, cmd.length() - 1));
            char dir = cmd.charAt(cmd.length() - 1);

            for (int i = 0; i < dist; i++) {
                if (dir == 'U') gx--;
                else if (dir == 'D') gx++;
                else if (dir == 'L') gy--;
                else if (dir == 'R') gy++;

                if (gx < 0) gx = N - 1;
                if (gx >= N) gx = 0;
                if (gy < 0) gy = N - 1;
                if (gy >= N) gy = 0;

                if (gVisited[gx][gy]) {
                    gEnd = true;
                    break;
                } else {
                    gVisited[gx][gy] = true;
                    gScore++;
                }
            }
        }
        boolean pEnd = false;
        while (!pEnd) {
            String cmd = board[px][py];
            int dist = Integer.parseInt(cmd.substring(0, cmd.length() - 1));
            char dir = cmd.charAt(cmd.length() - 1);

            for (int i = 0; i < dist; i++) {
                if (dir == 'U') px--;
                else if (dir == 'D') px++;
                else if (dir == 'L') py--;
                else if (dir == 'R') py++;

                if (px < 0) px = N - 1;
                if (px >= N) px = 0;
                if (py < 0) py = N - 1;
                if (py >= N) py = 0;

                if (pVisited[px][py]) {
                    pEnd = true;
                    break;
                } else {
                    pVisited[px][py] = true;
                    pScore++;
                }
            }
        }
        if (gScore > pScore) {
            System.out.println("goorm " + gScore);
        } else if (pScore > gScore) {
            System.out.println("player " + pScore);
        }
    }
}