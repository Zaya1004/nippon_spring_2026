package nippon_spring_2026.month03.week10.day04.backend.src.main.java.com.app;

public class MathUtils {
    public static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    public static double average(int[] nums) {
        if (nums.length == 0) throw new IllegalArgumentException("Empty array");
        double sum = 0;
        for (int n : nums) sum += n;
        return sum / nums.length;
    }
}
