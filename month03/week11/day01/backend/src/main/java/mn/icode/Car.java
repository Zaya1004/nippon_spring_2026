package mn.icode;

public class Car extends Vehicle implements Automatic, HasEngine {
    Car(String brand){
        super(brand);
    }

    @Override
    int maxSpeed() {
        return 200;
    }

    @Override
    public boolean isAutomatic() {
        return true;
    }

    @Override
    public boolean hasEngine() {
        return true;
    }
}
