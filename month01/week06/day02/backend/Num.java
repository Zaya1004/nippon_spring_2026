import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Num1:");
        int Num1 = numScanner.nextInt();
        System.out.println("Num2:");
        int Num2 = numScanner.nextInt();
        System.out.println("Num3: ");
        int Num3 = numScanner.nextInt();
        System.out.println("Num4:");
        int Num4 = numScanner.nextInt();
        System.out.println("Num5:");
        int Num5 = numScanner.nextInt();
        int [] numbers = {Num1, Num2, Num3, Num4, Num5};
        int sum = 0;
        for(int n : numbers){
            sum += n ;
        }
        System.out.println("Sum: "+sum);
        int average = (int) sum / numbers.length;
        System.out.println("Average: " + average);


    }
}
