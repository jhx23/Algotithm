package Goorm.기초시뮬레이션;
/**
 * 복제 로봇
 */
import java.io.*;

public class Q2 {
     public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int N = Integer.parseInt(br.readLine());

            int[] px = new int[N];
            int[] py = new int[N];
            for (int i = 0; i < N; i++) {
                input = br.readLine().split(" ");
                px[i] = Integer.parseInt(input[0]);
                py[i] = Integer.parseInt(input[1]);
            }

            int Q = Integer.parseInt(br.readLine());

            String[] C = br.readLine().split(" ");

            for (int i = 0; i < Q; i++) {
                String cmd = C[i];
                int next_x = x, next_y = y;

                if (cmd.equals("U")) {
                    next_y = y + 1;
                } else if (cmd.equals("D")) {
                    next_y = y - 1;
                } else if (cmd.equals("L")) {
                    next_x = x - 1;
                } else if (cmd.equals("R")) {
                    next_x = x + 1;
                }

                boolean valid = true;
                for (int j = 0; j < N; j++) {
                    if (px[j] == next_x && py[j] == next_y) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    x = next_x;
                    y = next_y;
                }
            }

            System.out.println(x + " " + y);
        }
    }