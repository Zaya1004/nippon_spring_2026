package nippon_spring_2026.month02.week07.day03;

public class Overloading {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(add(3.14, 2.71));
        System.out.println(add(1, 2, 3));
        System.out.println(add("java", "dev"));
    }
}
