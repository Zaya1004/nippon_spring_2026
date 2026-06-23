package nippon_spring_2026.month03.week09.day01.backend;
public class Vehicle {
       String brand;
       int year;
       Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
       }                 
       
       void showInfo(){
        System.out.println(brand + "( " + year + ")");
       }
}
