package nippon_spring_2026.month01.week05.day02;

import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Niit dun: ");
        int total = sc.nextInt();
        if (total < 100000) {
            System.out.println("Hungulult: 0%");
        } else if (total >= 100001 && total < 499999) {
            System.out.println("Hungulult: 5%");
        } else if (total >= 500000 && total < 999999) {
            System.out.println("Sale: 10%");
        } else if (total > 1000000) {
            System.out.println("Sale: 15%");
        } else {
        }
    }
}
