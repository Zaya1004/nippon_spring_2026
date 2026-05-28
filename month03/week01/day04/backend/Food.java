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

    public static void main(String[] args) {
        Food[] foods = {
            new Friut("Apple", 95, true),
            new FastFood("Fries", 500, "L"),
            new Vegetable("Banana", 110, true)
        }; for (Food f : foods){
            f.describe();
        }
    }
}
