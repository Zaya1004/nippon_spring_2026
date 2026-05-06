package nippon_spring_2026.month02.week05.day02;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jin(kg): ");
        double weight = sc.nextDouble();
        System.out.println("Undur(m): ");
        double height = sc.nextDouble();
        double result = (weight / (height * height));
        if (result < 18.5) {
            System.out.println("Turanhai");
        } else if (result <= 18 && result > 24.9) {
            System.out.println("Heviin");
        } else if (result <= 25 && result > 29.9) {
            System.out.println("Iluudel jintei");
        } else if (result >= 30) {
            System.out.println("Targalalt");
        } else {
        }
    }
}
