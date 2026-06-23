public class Triangle extends Shapes{
    double a;
    double b;
    double c;

    public Triangle(String color, double a, double b, double c){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter(){
        return a + b + c;
    }

    public double area(){
        return perimeter()* ((perimeter()-a) * (perimeter()-b) * (perimeter() - c));
    }

    @Override
    public void printInfo() {
        System.out.println("Color is " + getColor() + ". Area is " + area() + ". Perimeter is " + perimeter());
    }
}
