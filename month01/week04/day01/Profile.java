package nippon_spring_2026.month01.week04.day01;

import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter your name: ");
         String name = scanner.nextLine();
        
         System.out.println("enter your age: ");
         int age = scanner.nextInt();
         System.out.println("enter your city: ");
         String city = scanner.next();

         System.out.println("========================");
         System.out.println("ner: " + name);
         System.out.println("nas: " + age);
         System.out.println("hot: " + city);
         System.out.println("========================");
         scanner.close();

    }
    
}
