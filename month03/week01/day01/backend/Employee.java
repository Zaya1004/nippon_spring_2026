public class Employee extends Person {
    String company;
    double salary;
     
    Employee(String name, int age, String company, double salary){
        super(name, age);
        this.company = company;
        this.salary = salary;
    }

    void work(){
        System.out.println(name + " ni " + company + "-d ajillaj baina.");
    }

    void getSalary(){
        System.out.printf("Tsalin: " +  salary);
    }

    @Override
    void showInfo(){
        super.showInfo();
        work();
        getSalary();
    }
}
