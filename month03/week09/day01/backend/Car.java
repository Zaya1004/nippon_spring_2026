package nippon_spring_2026.month03.week09.day01.backend;
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
