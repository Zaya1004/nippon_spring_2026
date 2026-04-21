package nippon_spring_2026.month01.week04.day02;

import java.util.Scanner;

public class TriangleArea {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("suuri:");
    int suuri = scanner.nextInt();
    System.out.print("undur:");
    int undur = scanner.nextInt();
    int area = suuri*undur/2;
    System.out.println("area: " + area);

    scanner.close();



}    
}
