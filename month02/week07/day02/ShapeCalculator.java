package nippon_spring_2026.month02.week07.day02;

public class ShapeCalculator {
    static double circleArea(double r) {
        return r * r;
    }

    static double circlePerimeter(double r) {
        return 2 * 3.14 * r;
    }

    static double rectArea(double w, double h) {
        return w * h;
    }

    static double rectPerimeter(double w, double h) {
        return (w + h) / 2;
    }

    static double triangleArea(double b, double h) {
        return (b * h) / 2;
    }

    public static void main(String[] args) {
        System.out.println("===== Helberiin tootsooluur ====");
        System.out.println("Toirog: (r=5)");
        System.out.println("Talbai: " + circleArea(5));
        System.out.println("Perimeter: " + circlePerimeter(5));
        System.out.println("Tegsh untsugt: ");
        System.out.println("Talbai: " + rectArea(4, 6));
        System.out.println("Perimeter: " + rectPerimeter(4, 6));
        System.out.println("3ljin: ");
        System.out.println("Talbai: " + triangleArea(8, 5));

    }

}
