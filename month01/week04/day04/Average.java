package nippon_spring_2026.month01.week04.day04;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("num1: ");
        int num1 = scanner.nextInt();
        System.out.println("num2: ");
        int num2 = scanner.nextInt();
        System.out.println("num3: ");
        int num3 = scanner.nextInt();
        System.out.println("num4: ");
        int num4 = scanner.nextInt();
        System.out.println("num5: ");
        int num5 = scanner.nextInt();
        double niit = (num1 + num2 +num3 + num4 + num5) / 2;
        System.out.println("Dundaj: " + niit);
        scanner.close();
    }
}
