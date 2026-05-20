public class Rectangle {
    double width;
    double height;

    double area() {
        return width * height;
    }

    double perimtr() {
        return 2 * (width + height);
    }

    boolean isSquare(){
        return width == height;
    }

    void showInfo() {
        System.out.println(area());
        System.out.println(perimtr());
        System.out.println(isSquare());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 5.0;
        r1.height = 3.0;
        r1.showInfo();
        Rectangle r2 = new Rectangle();
        r2.width = 4.0;
        r2.height = 4.0;
        r2.showInfo();
    }
}
