package mn.icode;

public class PressureSensor implements Sensor{
       double hPa;
       public PressureSensor(double hPa) {
		this.hPa = hPa;
	}
       
       @Override
    public double readValue() {
    	
    	return hPa;
    }
       
       @Override
    public String unit() {
    	
    	return "hPa";
    }
}
