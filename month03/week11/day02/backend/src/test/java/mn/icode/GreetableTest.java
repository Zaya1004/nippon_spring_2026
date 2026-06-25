package mn.icode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetableTest {
     @Test 
     public void testEnglish() {
    	 English greetEnglish = new English();
    	 Assertions.assertEquals("Hello", greetEnglish.greet());
     }
     
     @Test 
     public void testJapanese() {
    	 Japanese greJapanese = new Japanese();
    	 Assertions.assertEquals("Konnichiwa", greJapanese.greet());
    	 Assertions.assertEquals("KONNICHIWA!!!", greJapanese.greetLoud());
     }
}
