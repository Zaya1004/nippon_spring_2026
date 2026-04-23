package nippon_spring_2026.month01.week04.day04;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("money: ");
        int money = scanner.nextInt();
        System.out.println("jiliin huu: ");
        int jiliin = scanner.nextInt();
        double huu = money * jiliin / 100;
        System.out.println("1 jiliin huu: " + huu );
        scanner.close();

    }
}
