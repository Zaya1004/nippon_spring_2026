public class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public double area() {
        return 0.0;
    }

    public double perimeter() {
        return 0.0;
    }

    public void printInfo() {
        System.out.println("shape has color: " + color + ", area of " + area() + ", P: " + perimeter());
    }

}
