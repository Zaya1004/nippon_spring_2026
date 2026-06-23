public class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    void move() {
        System.out.println(brand + " mashin zamaar yvj baina");
    }
}
