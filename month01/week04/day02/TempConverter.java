package nippon_spring_2026.month01.week04.day02;

import java.util.Scanner;

public class TempConverter {public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("C:");
     int C = scanner.nextInt();
     int F = C * 9 / 5 + 32;
     System.out.println("F" + F);
     scanner.close();
}
    
}
