package month02.week03.day03;

public class Describe {
    static String describe(int n) {
        return "number: " + n;
    }

    static String describe(String s) {
        return "Мөр: \"" + s.lines().count()+ "\", урт=" + s.length();
    }

    static String describe(boolean b) {
        return b ? "True" : "False";
    }

    static String describe(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }

    public static void main(String[] args) {
        System.out.println(describe(42));
        System.out.println(describe("hello java"));
        System.out.println(describe(true));
        System.out.println(describe(false));
        System.out.println(describe(3, 7));
    }
}
