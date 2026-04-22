package nippon_spring_2026.month01.week04.day03;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("num1");
        int num1 = scanner.nextInt();
        System.out.println("num2"); 
        int num2 = scanner.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        scanner.close();
    }
    
}
