package nippon_spring_2026.month03.week09.day01.backend;
public class ElectricCar extends Car {
    int batteryKm;

    ElectricCar(String brand, int year, int doors, int batteryKm){
        super(brand, year, doors);
        this.batteryKm = batteryKm;
    }
    
    @Override
    void showInfo(){
        super.showInfo();
        System.out.println("batteryKm: " + batteryKm);
    }
}
