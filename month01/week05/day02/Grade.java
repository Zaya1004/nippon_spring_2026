package nippon_spring_2026.month01.week05.day02;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Onoo oruulna uu: ");
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("Dun: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Dun: B");
        } else if (score >= 79 && score < 80) {
            System.out.println("Dun: C");
        } else if (score >= 69 && score < 70) {
            System.out.println("Dun: D");
        } else if (score >= 0 && score < 60) {
            System.out.println("Dun: F");
        } else {
            System.out.println("Buruu onoo!");
        }
    }

}
