package mn.icode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    public void testCarInitializationAndSpeed() {
        Vehicle car = new Car("Toyota");
        Assertions.assertEquals(200, car.maxSpeed(), "Car must return a max speed of 200.");
    }

    @Test 
    public void testBikeInitializationAndSpeed(){
        Vehicle bike = new Bike("Yamaha");
        Assertions.assertEquals(120, bike.maxSpeed(), "Bike must return a max speed of 120.");
    }

    @Test
    public void testCarInitializationAndAutomatic(){
        Automatic car = new Car("Toyota");
        Assertions.assertTrue(car.isAutomatic());
    }

    @Test
    public void testBikeInitializationAndAutomatic(){
        Automatic bike = new Bike ("Yamaha");
        Assertions.assertFalse(bike.isAutomatic());
    }

    @Test
    public void testCarInitializationAndHasEngine(){
        HasEngine car = new Car("Toyota");
        Assertions.assertTrue(car.hasEngine());
    }

    @Test
    public void testBikeInitializationAndHasEngine(){
        Bike bike = new Bike ("Yamaha");
        Assertions.assertFalse(bike.hasEngine());
    }
}
