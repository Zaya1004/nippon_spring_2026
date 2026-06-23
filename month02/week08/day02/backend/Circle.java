package nippon_spring_2026.month02.week08.day02.backend;
public class Circle {
    double radius;

    double area() {
        return 3.14 * radius * radius;
    }

    double cir() {
        return 2 * 3.14 * radius;
    }

    void showInfo() {
        System.out.println(area());
        System.out.println(cir());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 78.53;
        c1.area();
        c1.cir();
        c1.showInfo();
    }
}
