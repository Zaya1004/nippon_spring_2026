package nippon_spring_2026.month01.week05.day02;

import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nuuts ug: ");
        String pwd = sc.next();

        boolean hasUpper = !pwd.equals(pwd.toLowerCase());
        boolean hasDigit = pwd.matches(".*\\d.*");
        int len = pwd.length();
        if (len > 8 && hasUpper && hasDigit) {
            System.out.println("Huchtei");
        } else if (len > 6 && hasDigit) {
            System.out.println("Dund");
        } else if (len < 6) {
            System.out.println("Sul");
        } else {
        }

    }
}
