package nippon_spring_2026.month01.week04.day02;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("jin:");
        double jin = scanner.nextDouble();
        System.out.println("undur:");
        double undur = scanner.nextDouble();
        double BMI = jin/(undur*undur);
        System.out.println("BMI: " + BMI);
        scanner.close();
    }
  
    
}
