public class Main {
    public static void main(String[] args) {
        Vehicle carVehicle = new Vehicle("Hybrid", 1990);
        carVehicle.showInfo();
        Car myCar = new Car("Hybrid", 2004, 2);
        myCar.showInfo();
        ElectricCar myElectricCar = new ElectricCar("Toyoto", 2012, 4, 56000);
        myElectricCar.showInfo();
        Person thePerson = new Person("Zaya", 21);
        thePerson.introduce();
        Student thStudent = new Student("Zaya", 21, "Engineer", 3.6);
        thStudent.introduce();
        GraduateStudent thGraduateStudent = new GraduateStudent("Zaya", 18, "makeup", 3.0, "Topic");
        thGraduateStudent.introduce();
        Employee thEmployee = new Employee("Zaya", 21, "X", 2.25);
        thEmployee.showInfo();
        Manager thManager = new Manager("Zaya", 21, "IT", 4, 1000);
        thManager.showInfo();
    }
}
