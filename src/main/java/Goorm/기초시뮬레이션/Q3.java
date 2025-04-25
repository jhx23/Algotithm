package Goorm.기초시뮬레이션;
/**
 * 빵야
 */
import java.io.*;
import java.util.*;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(st.nextToken());
        }

        long totalShots = 0;
        int ct = 0;

        for (int i = 0; i < N; i++) {
            while (H[i] > 0) {
                int damage = (ct % 4) + 1;
                H[i] -= damage;
                ct++;
                totalShots++;
            }
        }
        System.out.println(totalShots);
    }
}