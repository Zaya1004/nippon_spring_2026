public class Friut extends Food {
    boolean isOrganic;
    Friut(String name, int calories, boolean isOrganic){
        super(name, calories);
        this.isOrganic = isOrganic;
    }

    @Override
    boolean isHealthy(){
        return true;
    }

    @Override
    void describe(){
        System.out.println("Food: " + name + ". " + calories + "kkl. " + isHealthy() );
    }
}
