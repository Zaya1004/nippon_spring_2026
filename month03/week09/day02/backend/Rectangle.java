public class Rectangle extends Shapes {
    double width;
    double height;

    public Rectangle(String color,double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void printInfo() {
        System.out.println("Color is "+ getColor() + ". Area is " + area() + ". Perimeter is " + perimeter());
    }
}
