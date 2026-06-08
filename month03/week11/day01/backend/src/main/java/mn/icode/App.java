package mn.icode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Vehicle [] cars = {
            new Car("Subaru"),
            new Bike("Yamaha")
        };

        for (Vehicle v : cars){
            System.out.println(v.maxSpeed());
            v.describe();
        }
    }
     

}
