package Goorm.기초구현;

import java.util.Scanner;

/**
 * 합리적 소비
 */

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String maxItem = "";
        int maxPrice = Integer.MIN_VALUE;

        String minItem = "";
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int price = Integer.parseInt(input[1]);

            if (price > maxPrice) {
                maxPrice = price;
                maxItem = name;
            }

            if (price < minPrice) {
                minPrice = price;
                minItem = name;
            }
        }

        System.out.println(maxItem + " " + maxPrice);
        System.out.println(minItem + " " + minPrice);
    }
}