package mn.icode;

public class HumiditySensor implements Sensor{
      double percent;
      public HumiditySensor(double percent) {
		 this.percent = percent;
      }
      
     @Override
    public double readValue() {
    	
    	return percent;
    }
     
     @Override
    public String unit() {
    	
    	return "%";
    }
}
