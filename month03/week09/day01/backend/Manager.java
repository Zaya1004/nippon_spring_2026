package nippon_spring_2026.month03.week09.day01.backend;
public class Manager extends Employee {
    int teamSize;

    Manager(String name, int age, String company, double salary, int teamSize){
        super(name, age, company, salary);
        this.teamSize = teamSize;
    }

    void manage(){
        System.out.println(". " + teamSize + " huniig udirdaj baina.");
    }

    @Override
    void showInfo(){
        super.showInfo();
        manage();
    }
}
