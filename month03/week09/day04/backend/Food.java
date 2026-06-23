public class Food {
     String name;
     int calories;
     
     Food(String name, int calories){
        this.name = name;
        this.calories = calories;
     }
    
     
    void describe(){
        System.out.println(name + calories + " kkl.");
    }

    boolean isHealthy(){
        return calories < 300;
    }


}
