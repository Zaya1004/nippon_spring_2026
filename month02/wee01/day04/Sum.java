package nippon_spring_2026.month02.week05.day04;
public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Tegsh toonuud: ");
        for (int i = 2; i <= 50; i = i + 2) {
            sum = sum + i;
            System.out.print(i + " ");

        } 
        System.out.println();
        System.out.println("Niilber: " + sum);
    }
}
