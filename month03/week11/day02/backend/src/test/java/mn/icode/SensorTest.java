package mn.icode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SensorTest {

	@Test
	public void testTemperaturSensor() {
		TemperatureSensor sensor = new TemperatureSensor(15);
		Assertions.assertEquals(sensor.readValue(), 15);
	}
	
	@Test
	public void testPressureSensor() {
		PressureSensor sensor = new PressureSensor(20);
		Assertions.assertEquals(sensor.readValue(), 20);
	}
	
	@Test 
	public void testHumiditySensor() {
		HumiditySensor sensor = new HumiditySensor(0.9);
		Assertions.assertEquals(sensor.readValue(), 0.9);
	}
	
	

}
