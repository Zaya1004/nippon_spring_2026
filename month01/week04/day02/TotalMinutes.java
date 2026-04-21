package nippon_spring_2026.month01.week04.day02;

import java.util.Scanner;

public class TotalMinutes {
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("time:");
     int time = scanner.nextInt();
     System.out.println("minute:");
     int minut = scanner.nextInt();
     int niit = time * 60 + minut;
     System.out.println("niit" + niit);
     scanner.close();
}    
}
