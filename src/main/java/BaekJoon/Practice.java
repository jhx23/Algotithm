package BaekJoon;

/* 브론즈5 풀어보는 용*/
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 1 : 0);
    }
}