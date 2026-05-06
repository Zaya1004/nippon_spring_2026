package nippon_spring_2026.month02.week05.day01;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner agegroupScanner = new Scanner(System.in);
        System.out.println("Nasaa oruulna uu:");
        int age = agegroupScanner.nextInt();
        if (age <= 2) {
            System.out.println("Nylh");
        } else if (age <= 12) {
            System.out.println("Huuhed");
        } else if (age <= 17) {
            System.out.println("Usvur nas");
        } else if (age <= 64) {
            System.out.println("Nasand hursen");
        } else {
            System.out.println("Ahmad");
        }
    }
}
