public class Square extends AbstractShape {
    private double side;
    public Square(double side){
        super("Blue");
        this.side = side;
    }

    @Override
    public void area(){
        System.out.println("Area: " + (side * side));
    }

    @Override
    public void perimeter(){
        System.out.println("Perimeter: " + (4 * side));
    }
}
