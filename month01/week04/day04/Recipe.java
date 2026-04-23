package nippon_spring_2026.month01.week04.day04;

import java.util.Scanner;

public class Recipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Store ===");
        System.out.println("First item: ");
        String First = scanner.nextLine();
        System.out.println("Price: ");
        int Price = scanner.nextInt();
        System.out.println("Quantity: ");
        int Quantity = scanner.nextInt();


        System.out.println("Second item: ");
        String Second = scanner.nextLine();
        System.out.println("Price2: ");
        int Price2 = scanner.nextInt();
        System.out.println("Quantity2: ");
        int Quantity2 = scanner.nextInt();


        System.out.println("Third item: ");
        String Third = scanner.nextLine();
        System.out.println("Price3: ");
        int Price3 = scanner.nextInt();
        System.out.println("Quantity3: ");
        int Quantity3 = scanner.nextInt();

        int dun1 = Price * Quantity;
        int dun2 = Price2 * Quantity2;
        int dun3 = Price3 * Quantity3;
        int niit = dun1 + dun2 + dun3;
        int Vat = niit / 10;
        
        
        
        
        System.out.println("=========================");
        System.out.println("");



    }
    
}
