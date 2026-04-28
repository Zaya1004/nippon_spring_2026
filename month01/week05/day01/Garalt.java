package nippon_spring_2026.month01.week05.day01;

import java.util.Scanner;

public class Garalt {
    public static void main(String[] args) {
        Scanner garaltScanner = new Scanner(System.in);
        System.out.println(" a toog oruulna uu: ");
        int a = garaltScanner.nextInt();
        System.out.println("b toog  oruulna uu:");
        int b = garaltScanner.nextInt();
        if (a % b == 1) {
            System.out.println("Uldegdel 1");
        } else if (a % b == 0) {
            System.out.println("Huvaagdana");
        } else {
            System.out.println("uldegdel: " + (a + b));
        }

        System.out.println("Too oruulna uu (1-10):");
        int x = garaltScanner.nextInt();
        String result = (x > 10) ? "Tom " : (x > 5) ? "Dund" : "Jijig";
        System.out.println(result);

        System.out.println("Unguu oruulna uu (red,green,blue): ");
        String color = garaltScanner.next();
        switch (color) {
            case "red":
                System.out.println("Ulaan");

                break;
            case "green":
                System.out.println("Nogoon");
                break;
            case "blue":
                System.out.println("Tsenher");
                break;
            default:
                System.out.println("Busad");

        }
        System.out.println("Too oruulna uu (6,7,8,): ");
        int n = garaltScanner.nextInt();
        switch (n) {
            case 6:
                System.out.println("Zurgaa");
            case 7:
                System.out.println("Doloo");
            case 8:
                System.out.println("Naim");
                break;
            default:
                System.out.println("Busad");

        }

    }
}
