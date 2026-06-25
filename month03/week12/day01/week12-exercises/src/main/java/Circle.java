public class Circle implements Drawable, Resizable {
    private double radius;
    private double scale = 1.0;
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.printf("Дугуйг зурах:.radius=%.1f, scale=%.1f%n", radius, scale);
    }

    @Override
    public void resize(double factor){
          scale *= factor;
    }
}
