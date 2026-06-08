package mn.icode;

public class Bike extends Vehicle implements Automatic, HasEngine{
    Bike(String brand){
        super(brand);
    }

    @Override
    int maxSpeed() {
        return 120;
    }

    @Override
    public boolean isAutomatic() {
        return false;
    }

    @Override
    public boolean hasEngine() {
        return false;
    }
}
