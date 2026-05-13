package month02.week03.day03;

public class Predict {
    static void show(int n) {
        System.out.println("int: " + n);
    }

    static void show(double n) {
        System.out.println("double: " + n);
    }

    static void show(String s) {
        System.out.println("String: " + s);
    }

    static void show(int a, int b) {
        System.out.println("2 ints: " + a + "," + b);
    }

    public static void main(String[] args) {
        show(42);
        show(3.14);
        show("hello");
        show(1, 2);
        show((double) 5);

    }
}
