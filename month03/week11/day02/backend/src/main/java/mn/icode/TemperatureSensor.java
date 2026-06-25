package mn.icode;

public class TemperatureSensor implements Sensor{
	    double celsius;
	    TemperatureSensor(double celsius){
	    	this.celsius = celsius;
	    }
        @Override
        public double readValue() {
        	return celsius;
        }
        
        @Override
        public String unit() {
        // TODO Auto-generated method stub
        return "°C";
        }
}
