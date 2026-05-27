public class Car extends Vehicle {
    int doors; 
    Car(String brand, int year, int doors){
        super(brand, year);
        this.doors = doors;
    }

    @Override
    void showInfo(){
        super.showInfo();
        System.out.println("Doors: " + doors);
    }
}
