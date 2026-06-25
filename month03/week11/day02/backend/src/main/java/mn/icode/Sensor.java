package mn.icode;

import java.nio.channels.Pipe.SourceChannel;

interface Sensor {
        abstract double readValue();
        abstract String unit();
        
        default String  report() {
        	return "Sensor reading: " + readValue() + unit();
        }
        
        default boolean isNormal(double min, double max) {
        	return readValue() >= min && readValue() <= max; 
        };
        
}
