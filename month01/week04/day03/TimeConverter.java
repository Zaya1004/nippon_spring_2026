package nippon_spring_2026.month01.week04.day03;

import java.util.Scanner;

public class TimeConverter { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("time:");
        int time = scanner.nextInt();
        System.out.println("minut:");
        int minut = scanner.nextInt();
        System.out.println("sec:");
        int sec = scanner.nextInt();
        int niit = ((time * 60) + (minut * 60) + sec);
        System.out.println("niit: " + niit);
        scanner.close();        


    
}
    
}
