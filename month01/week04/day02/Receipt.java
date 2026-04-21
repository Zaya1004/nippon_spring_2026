package nippon_spring_2026.month01.week04.day02;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
          System.out.println("ner: ");
          String ner = scanner.nextLine();
          System.out.println("shirheg:");
          int shirheg = scanner.nextInt();
          int une = 2500;
          int niit = une * shirheg;
          System.out.println("niit" + niit);
          scanner.close();
          



         }
    
}
