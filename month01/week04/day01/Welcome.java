package nippon_spring_2026.month01.week04.day01;
import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give me your name: ");
        String name = scanner.nextLine();

        System.out.println("Welcome, " + name );

        scanner.close();
    }
}