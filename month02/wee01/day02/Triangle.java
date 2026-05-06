package nippon_spring_2026.month02.week05.day02;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a tal: ");
        int a = sc.nextInt();
        System.out.println("b tal: ");
        int b = sc.nextInt();
        System.out.println("c tal: ");
        int c = sc.nextInt();
        if (a == b && b == c && a == c) {
            System.out.println("3n tal adil");
        } else if (a == b && a == c && b != c) {
            System.out.println("2 tal adil ");
        } else if (a != b && a != c && b != c) {
            System.out.println("buh tal uur");
        } else if (a > b + c) {
            System.out.println("3valjin bish");
        } else {}
    }
}
