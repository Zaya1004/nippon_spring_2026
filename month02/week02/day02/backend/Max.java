package nippon_spring_2026.month02.week02.day02.backend;
public class Max {
    public static void main(String[] args) {
        int [] numbers = {45, 12, 78, 3, 56, 29, 41, 42, 67, 8, 34};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i]> max) max = numbers[i];
            if (numbers[i]< min) min = numbers[i];
        }
        System.out.println("Max: " + max);
        System.out.println("Min: "+ min);

        int target = 42;
        boolean found = false;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i]==target){
                System.out.println("Oldson: index "+ i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Oldsongui");
        }

        int evenCount = 0;
        for(int n : numbers) {
            if (n % 2 == 0) evenCount++;
        }
        System.out.println("Tegsh toonuudiin too: "+ evenCount);

        System.out.println("Tegsh toonuud: ");
        for (int n : numbers) {
            if (n % 2 ==0) System.out.println(n + " ");
        }
    }
}
