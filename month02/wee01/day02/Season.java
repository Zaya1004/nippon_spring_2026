package nippon_spring_2026.month02.week05.day02;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sar oruulna uu: ");
        int sar = sc.nextInt();
        if (sar == 12 || sar == 1 || sar == 2) {
            System.out.println("Uvul");
        } else if (sar == 3 || sar == 4 || sar == 5) {
            System.out.println("Havar");
        } else if (sar == 6 || sar == 7 || sar == 8) {
            System.out.println("Zun");
        } else if (sar == 7 || sar == 8 || sar == 9) {
            System.out.println("Namar");
        } else { 
        }
        
    }
}
