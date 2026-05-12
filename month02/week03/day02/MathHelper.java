package month02.week03.day02;

public class MathHelper {
    static int sum(int a, int b) {
        return a + b;
    }

    static int product(int a, int b) {
        return a * b;
    }

    static double average(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    static int max(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    static int min(int a, int b) {
        if (a < b)
            return a;
        return b;
    }

    static int absolute(int n) {
        return Math.abs(n);
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(product(6, 4));
        int[] nums = { 10, 20, 30 };
        System.out.println(average(nums));
        System.out.println(max(7, 3));
        System.out.println(min(7, 3));
        int result = absolute(-15);
        System.out.println(Math.abs(result));
    }

}
