package month02.week03.day02;

public class ArrayUnits {
    static int sum(int[] numbers){
        int sum = 0;
        for (int i : numbers ){
            sum += i;
        }
        return sum;
    }
    static double average(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    public static void main(String[] args) {
        int [] array = {3, 7, 2, 9, 1};
        System.out.println(sum(array));
        System.out.println(average(array));
    }
}
