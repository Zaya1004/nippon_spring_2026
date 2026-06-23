public class Boat extends Vehicle{
    boolean isMotor;

    Boat(String brand, int speed, boolean isMotor) {
        super(brand, speed);
        this.isMotor = isMotor;
    }
    


    @Override
    void move(){
        System.out.println(brand + " usaar yvj bna. " + isMotor + " motortoi, ");
    }
}
