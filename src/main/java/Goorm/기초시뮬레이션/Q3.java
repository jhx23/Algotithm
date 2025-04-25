package Goorm.기초시뮬레이션;
/**
 * 빵야
 */
import java.io.*;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(input[i]);
        }

        int count = 0;
        int enemy = 0;
        while (enemy < N) {
            count++;
            int damage = ((count - 1) % 4) + 1;

            H[enemy] -= damage;

            if (H[enemy] <= 0) {
                enemy++;
            }
        }
        System.out.println(count);
    }
}