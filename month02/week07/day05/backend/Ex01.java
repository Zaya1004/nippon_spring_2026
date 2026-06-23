package nippon_spring_2026.month02.week07.day05.backend;

public class Ex01 {
    static int sumR(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumR(n - 1);
    }

    static int sumI(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    static int sumF(int n) {
        return n * (n + 1) / 2;
    }

    static int powerR(int n) {
        if (n == 1) {
            return 1;
        }
        return n * powerR(n - 1);
    }

    static int powerI(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    static int mystery(int n){
        if ( n == 1){
            return 1;
        }
        return mystery(n / 2) + 1;
    }

    public static void main(String[] args) {
        System.out.println(sumR(100));
        System.out.println(sumI(100));
        System.out.println(sumF(100));
        System.out.println(powerR(3));
        System.out.println(powerI(3));
        System.out.println(mystery(8));
    }
}
