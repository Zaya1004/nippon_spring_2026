spackage nippon_spring_2026.month02.week07.day01;
public class Example01 {
    static void printLine(String text) {
        System.out.println(text);
    }

    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        printLine("hello");
        printLine("Test");

        System.out.println(square(4));
        int b = square(15);
        System.out.println(b);
        System.out.println(square(16));
    }
}
