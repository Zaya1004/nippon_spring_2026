package month02.week03.day03;

public class Compile {
    static int compute(int n) {
        return n * 2;
    }

    static int compute1(int n) {
        return n + 10;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(double n) {
        System.out.println(n);
    }

    static double area(double r) {
        return Math.PI * r * r;
    }

    static double area(double w, double h) {
        return w * h;
    }

    public static void main(String[] args) {
        System.out.println(compute(3));
        System.out.println(compute1(2));
        System.out.println(add(3, 2));
        System.out.println(add(3.14, 4.1));
        print("hello");
        print(3.13);
        System.out.println(area(3.14));
        System.out.println(area(5.4, 5.1));
    }
}
