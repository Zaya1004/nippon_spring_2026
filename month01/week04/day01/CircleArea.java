package nippon_spring_2026.month01.week04.day01;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your radius:");
        int radius = scanner.nextInt();
        double area = 3.14*radius*radius;
        System.out.println("talbai bol" + area );

        scanner.close();


    }
    
}
