package nippon_spring_2026.month01.week05.day02;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = sc.nextInt();
        if (year % 100 == 0) {
            System.out.println("leap year");
        } else if (year % 4 == 0) {
            System.out.println("leap year ");
        } else if (year % 400 == 0) {
            System.out.println("leaf year ");
        } else {
            System.out.println("not leap year");
        }
    }
}
