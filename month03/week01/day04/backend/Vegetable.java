public class Vegetable extends Food {
    boolean isOrganic;
    Vegetable(String name, int calories, boolean isOrganic){
        super(name, calories);
        this.isOrganic = isOrganic;
    }

    @Override
    boolean isHealthy(){
        return true;
    }
    
    @Override
    void describe(){
        System.out.println("Vegetable: " + name + ". " + calories + "kkl. " + isHealthy() );
    }
}
