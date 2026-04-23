import java.util.Scanner;

public class BirthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        int birthyear = 2025 - age;
        System.out.println(name  +  age  + "years old. " + "Born in " + birthyear );
        scanner.close();
    }
    
}
