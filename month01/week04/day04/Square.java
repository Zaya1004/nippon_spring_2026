import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tal: ");
        int tal = scanner.nextInt();
        double S  = tal * tal;
        double P = tal * 4;
        double D = tal * 1.41421;
        System.out.println("S: " + S );
        System.out.println("P: " + P);
        System.out.println("D: " + D);
        scanner.close();
    }
    
}
