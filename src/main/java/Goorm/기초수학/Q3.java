package Goorm.기초수학;

/**
 * 여유 황금비
 * 2개의 정수가 T회 주어집니다.
 * 2개의 정수 중 작은 수에 1.6을 곱한 값 이상, 1.63을 곱한 값 이하의 범위 내에 큰 수가 존재하면
 * 이 두 수는 여유 황금비.
 * T회 중, 두 수가 여유 황금비가 되는 횟수를 구해 출력
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int count = 0;

        for(int i = 0; i < T; i++) {
            double A = sc.nextDouble();
            double B = sc.nextDouble();

            double min,max;
            if (A < B) {
                min = A;
                max = B;
            } else {
                min = B;
                max = A;
            }
            double lowerBound = min * 1.6;
            double upperBound = max * 1.63;

            if (max >= lowerBound && max <= upperBound) {
                count++;
            }
        }
        System.out.println(count);

        sc.close();

    }
}