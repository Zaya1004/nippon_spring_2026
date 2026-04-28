package nippon_spring_2026.month01.week05.day02;

import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gerliin ungiig oruulna uu (red/yellow/green): ");
        String light = sc.next().toLowerCase();

        switch (light) {
            case "red":
                System.out.println("Zogs!");
                break;
            case "yellow":
                System.out.println("Belen bai!");
                break;
            case "green":
                System.out.println("Yv!");
            default:
               }

    }
}
