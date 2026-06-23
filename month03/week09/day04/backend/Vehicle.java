public class Vehicle {
    String brand;
    int speed;
    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    void move(){
        System.out.println(brand + " yvj baina.");
    }
    void showInfo(){
        System.out.println(brand + speed + "tai yvj baina. ");
    }
    

    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Toyota", 50, 4),
            new Boat("Serenity", 9000, true)
        };

        for (Vehicle v : vehicles){
           v.showInfo();
        }
    }
}