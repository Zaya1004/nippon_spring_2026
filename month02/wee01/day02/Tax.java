package nippon_spring_2026.month02.week05.day02;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jiliin orlogo: ");
        long income = sc.nextLong();
        if (income >= 0 && income < 10000000) {
            System.out.println("tax : 10%");
        } else if (income >= 10000001 && income < 50000000) {
            System.out.println("tax : 15%");
        } else if (income > 50000001) {
            System.out.println("tax : 20%");
        } else {
        }
    }
}
