public class FastFood extends Food {
    String size;
    FastFood(String name, int calories, String size){
        super(name, calories);
        this.size = size;
    }

    @Override
    boolean isHealthy(){
        return false;
    }
    
    @Override
    void describe(){
        System.out.println("Fast Food: " + name + ". " + calories + "kkl. " + isHealthy() );
    }
}
