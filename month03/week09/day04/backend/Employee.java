public class Employee extends Person {
    String company;
    int salary;
    Employee(String name, int age, String company, int salary){
        super(name, age);
        this.company = company;
        this.salary = salary;
    }
    
    @Override
    void work(){
        System.out.println(company + "-d ajillaj baina.");
    }
    
    @Override
    void getSalary(){
        System.out.println(salary + " tsalintai.");
    }
    

}
